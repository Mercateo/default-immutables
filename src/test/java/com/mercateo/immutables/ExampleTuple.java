package com.mercateo.immutables;

import org.immutables.value.Value;

@Value.Immutable
@Tuple
public interface ExampleTuple {
    String name();

    int count();

    static ImmutableExampleTuple of(String name, int count) {
        return ImmutableExampleTuple.of(name, count);
    }
}
