package com.mercateo.immutables;

import org.immutables.value.Value;

@Value.Immutable
@Tuple
public interface ExampleDeprecatedTuple {
    String name();

    int count();

    static ExampleDeprecatedTuple of(String name, int count) {
        return ImmutableExampleDeprecatedTuple.of(name, count);
    }
}
