package com.springframework.annotation;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2018/8/1.
 */
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestParam {
    String value() default "" ;
}
