package com.mercateo.immutables;

import org.immutables.value.Value;

abstract class Wrapper<T> {
    @Value.Parameter
    public abstract T value();

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" + value() + "}";
    }
}
