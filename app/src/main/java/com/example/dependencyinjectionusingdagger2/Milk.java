package com.example.dependencyinjectionusingdagger2;


import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Qualifier;

@Qualifier
@Documented
@Retention(RUNTIME)
public @interface Milk {

    /** The name. */
    String value() default "milk";


}
