package cn.kidjoker.beanPostProcessor;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface RoutingSwitch {

    String value() default "";

}
