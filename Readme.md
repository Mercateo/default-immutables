[![Build Status](https://travis-ci.org/Mercateo/default-immutables.svg?branch=master)](https://travis-ci.org/Mercateo/default-immutables)
[![Coverage Status](https://coveralls.io/repos/github/Mercateo/default-immutables/badge.svg?branch=master)](https://coveralls.io/github/Mercateo/default-immutables?branch=master)
[![MavenCentral](https://img.shields.io/maven-central/v/com.mercateo/default-immutables.svg)](http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22com.mercateo%22%20AND%20a%3A%22default-immutables%22)


# com.mercateo:default-immutables

Default-Styles and Helper-Classes for common use cases of [Immutables](http://immutables.github.io/), a framework based on annotation processors to generate simple, safe and consistent value objects

## Data class style

After defining an immutable with data class style
```
@Value.Immutable
@DataClass
public interface ExampleDataClass {
    String getName();

    int counter();

    static ExampleDataClassBuilder builder() {
        return new ExampleDataClassBuilder();
    }
}
```
there is a builder
```
    ExampleDataClass dataClass = ExampleDataClass.builder()
            .withName("foo")
            .withCounter(123)
            .build();
```
which even has a copy function:
```
    ExampleDataClass otherDataClass = ExampleDataClass.builder()
            .from(dataClass)
            .withName("bar")
            .build();
```

## Tuple style

After defining an immutable with tuple style
```
@Value.Immutable
@Tuple
public interface ExampleTuple {
    String name();

    int count();

    static ImmutableExampleTuple of(String name, int count) {
        return ImmutableExampleTuple.of(name, count);
    }
}
```

there is a static constructor method

```
    ExampleTuple tuple = ExampleTuple.of("foo", 123);
```

## Typed Objects

Typed "primitives" can be easily defined:

```
@Value.Immutable
@Wrapped
public abstract class _ExampleTypedString extends Wrapper<String> {}
```

and used:
```
    ExampleTypedString typedString = ExampleTypedString.of("foo");
```

`value()`, `.hashCode()`, `.equals(<other>)` and `.toString()` are already there.
