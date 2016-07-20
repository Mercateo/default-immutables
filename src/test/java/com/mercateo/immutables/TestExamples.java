package com.mercateo.immutables;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestExamples {

    @Test
    public void dataClassExample() {
        final ExampleDataClass dataClass = ExampleDataClass.builder()
                .withName("foo")
                .withCounter(123)
                .build();

        assertThat(dataClass.getName()).isEqualTo("foo");
        assertThat(dataClass.counter()).isEqualTo(123);

        ExampleDataClass otherDataClass = ExampleDataClass.builder()
                .from(dataClass)
                .withName("bar")
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
    public void wrappedTypeExample() {
        final ExampleTypedString typedString = ExampleTypedString.of("foo");

        assertThat(typedString.value()).isEqualTo("foo");
        assertThat(typedString.toString()).isEqualTo("ExampleTypedString{foo}");
    }
}
