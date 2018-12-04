package com.mercateo.immutables;

import org.immutables.value.Value;

@Value.Immutable
@TupleStyle
public interface _ExampleTuple {
    String name();

    int count();
}
