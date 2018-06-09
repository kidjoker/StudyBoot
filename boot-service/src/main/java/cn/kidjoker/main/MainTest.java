package cn.kidjoker.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cn.kidjoker.aop.DemoAnnotationService;
import cn.kidjoker.aop.DemoMethodService;
import cn.kidjoker.config.DiConfig;
import cn.kidjoker.service.impl.UseFunctionService;

/**
 *
 *
 * @auther KidjokeR
 * @since 2018年6月9日 - 上午10:37:54
 * @version 1.0.0
 */
public class MainTest {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DiConfig.class);
		
		DemoAnnotationService demoAnnotationService = ctx.getBean(DemoAnnotationService.class);
		
		//DemoMethodService demoMethodService = ctx.getBean(DemoMethodService.class);
		
		demoAnnotationService.add();
		
		//demoMethodService.add();
		
		ctx.close();
	}
}
