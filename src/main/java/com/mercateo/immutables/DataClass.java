package com.mercateo.immutables;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.immutables.value.Value;
import org.immutables.vavr.encodings.VavrEncodingEnabled;

@Target({ ElementType.PACKAGE, ElementType.TYPE })
@Value.Style(
        visibility = Value.Style.ImplementationVisibility.PUBLIC,
        builderVisibility = Value.Style.BuilderVisibility.SAME)
@VavrEncodingEnabled
public @interface DataClass {
}
