package com.github.tedaliez.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author fredguo
 * @since 2019/06/20
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
public @interface WebApi {

}
