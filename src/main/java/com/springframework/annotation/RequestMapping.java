package com.springframework.annotation;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2018/8/1.
 */
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestMapping {
    String value() default "" ;
}
