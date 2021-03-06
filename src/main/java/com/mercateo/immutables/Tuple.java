package com.mercateo.immutables;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.immutables.value.Value;

/**
 * @deprecated please use {@link TupleStyle} instead
 */
@Target({ ElementType.PACKAGE, ElementType.TYPE })
@Retention(RetentionPolicy.CLASS) // Make it class retention for incremental compilation
@Value.Style(allParameters = true, // all attributes will become constructor parameters as if they are annotated
                                   // with @ValueStyle.Parameter
        visibility = Value.Style.ImplementationVisibility.PUBLIC, // Generated class will be always public
        defaults = @Value.Immutable(builder = false)) // Disable copy methods and builder
@Deprecated
public @interface Tuple {
}
