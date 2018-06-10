package cn.kidjoker.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 *
 *
 * @auther KidjokeR
 * @since 2018年6月9日 - 上午10:39:33
 * @version 1.0.0
 */
@Component
@ComponentScan("cn.kidjoker.service")
//@ComponentScan("cn.kidjoker.aop")
//@EnableAspectJAutoProxy
public class DiConfig {

}
