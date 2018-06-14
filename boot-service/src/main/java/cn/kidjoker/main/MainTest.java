package cn.kidjoker.main;

import cn.kidjoker.annotation.DemoConfig;
import cn.kidjoker.annotation.DemoService;
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

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DemoConfig.class);

        DemoService demoService = ctx.getBean ( DemoService.class );

        demoService.outputResult ();

        ctx.close ();
	}
}
