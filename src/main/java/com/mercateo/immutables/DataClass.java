package com.mercateo.immutables;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.immutables.value.Value;

@Target({ ElementType.PACKAGE, ElementType.TYPE })
@Value.Style(init = "with*", visibility = Value.Style.ImplementationVisibility.PRIVATE, builderVisibility = Value.Style.BuilderVisibility.PUBLIC)
public @interface DataClass {
}
