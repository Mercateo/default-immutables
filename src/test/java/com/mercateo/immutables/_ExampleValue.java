package com.mercateo.immutables;

import org.immutables.value.Value;

@Value.Immutable
@ValueStyle
public interface _ExampleValue {
    String getName();

    int counter();
}
