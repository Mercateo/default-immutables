package com.mercateo.immutables;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import org.immutables.value.Value;
import org.immutables.vavr.encodings.VavrEncodingEnabled;

@Target({ ElementType.PACKAGE, ElementType.TYPE })
@Value.Style(
        visibility = org.immutables.value.Value.Style.ImplementationVisibility.PUBLIC,
        builderVisibility = org.immutables.value.Value.Style.BuilderVisibility.SAME,
        // Detect names starting with underscore
        typeAbstract = "_*",
        // Generate without any suffix, just raw detected name
        typeImmutable = "*"
)
@VavrEncodingEnabled
public @interface ValueStyle {
}
