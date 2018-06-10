package cn.kidjoker.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cn.kidjoker.el.ElConfig;

/**
 *
 *
 * @auther KidjokeR
 * @since 2018年6月9日 - 上午10:37:54
 * @version 1.0.0
 */
public class MainTest {
	
	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ElConfig.class);

        ElConfig resourceService = ctx.getBean(ElConfig.class);

        resourceService.outputResource();

		ctx.close();
	}
}
