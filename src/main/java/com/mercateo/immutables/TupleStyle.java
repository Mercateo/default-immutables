package com.mercateo.immutables;

import org.immutables.value.Value;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PACKAGE, ElementType.TYPE})
@Retention(RetentionPolicy.CLASS) // Make it class retention for incremental compilation
@Value.Style(allParameters = true, // all attributes will become constructor parameters
        // as if they are annotated with @ValueStyle.Parameter
        visibility = Value.Style.ImplementationVisibility.PUBLIC, // Generated class will be always public
        defaults = @Value.Immutable(builder = false), // Disable copy methods and builder
        typeAbstract = "_*", // Detect names starting with underscore
        typeImmutable = "*") // Generate without any suffix, just raw detected name
public @interface TupleStyle {
}
