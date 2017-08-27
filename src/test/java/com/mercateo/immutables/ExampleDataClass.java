package com.mercateo.immutables;

import org.immutables.value.Value;

@Value.Immutable
@DataClass
public interface ExampleDataClass {
    String getName();

    int counter();

    static ImmutableExampleDataClass.Builder builder() {
        return ImmutableExampleDataClass.builder();
    }
}
