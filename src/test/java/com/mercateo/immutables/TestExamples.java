package com.mercateo.immutables;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestExamples {

    @Test
    public void valueExample() {
        final ExampleValue value = ExampleValue.builder()
                .name("foo")
                .counter(123)
                .build();

        assertThat(value.getName()).isEqualTo("foo");
        assertThat(value.counter()).isEqualTo(123);
    }

    @Test
    public void valueBuilderCopyExample() {
        final ExampleValue value = ExampleValue.builder()
                .name("foo")
                .counter(123)
                .build();

        ExampleValue otherValue = ExampleValue.builder()
                .from(value)
                .name("bar")
                .build();

        assertThat(otherValue.getName()).isEqualTo("bar");
        assertThat(otherValue.counter()).isEqualTo(123);
    }


    @Test
    public void valueWithCopyExample() {
        final ExampleValue value = ExampleValue.builder()
                .name("foo")
                .counter(123)
                .build();

        ExampleValue anotherValue = value.withName("baz");

        assertThat(anotherValue.getName()).isEqualTo("baz");
        assertThat(anotherValue.counter()).isEqualTo(123);
    }

    @Test
    public void deprecatedDataClassExample() {
        final ExampleDataClass dataClass = ExampleDataClass.builder()
                .name("foo")
                .counter(123)
                .build();

        assertThat(dataClass.getName()).isEqualTo("foo");
        assertThat(dataClass.counter()).isEqualTo(123);

        ExampleDataClass otherDataClass = ExampleDataClass.builder()
                .from(dataClass)
                .name("bar")
                .build();

        assertThat(otherDataClass.getName()).isEqualTo("bar");
        assertThat(otherDataClass.counter()).isEqualTo(123);
    }

    @Test
    public void tupleExample() {
        final ExampleTuple tuple = ExampleTuple.of("foo", 123);

        assertThat(tuple.name()).isEqualTo("foo");
        assertThat(tuple.count()).isEqualTo(123);
    }

    @Test

    public void deprecatedTupleExample() {
        final ExampleDeprecatedTuple tuple = ExampleDeprecatedTuple.of("foo", 123);

        assertThat(tuple.name()).isEqualTo("foo");
        assertThat(tuple.count()).isEqualTo(123);
    }

    @Test
    public void wrappedTypeExample() {
        final ExampleTypedString typedString = ExampleTypedString.of("foo");

        assertThat(typedString.value()).isEqualTo("foo");
        assertThat(typedString.toString()).isEqualTo("ExampleTypedString{foo}");
    }
}
