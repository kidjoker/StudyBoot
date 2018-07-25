package cn.kidjoker.main;

import cn.kidjoker.beanPostProcessor.HelloController;
import cn.kidjoker.beanPostProcessor.PostProcessorConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 *
 * @auther KidjokeR
 * @since 2018年6月9日 - 上午10:37:54
 * @version 1.0.0
 */
public class MainTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(PostProcessorConfig.class);

        HelloController helloController=ctx.getBean(HelloController.class);

        helloController.sayHi();
        helloController.sayHello();

        ctx.close ();


	}
}
