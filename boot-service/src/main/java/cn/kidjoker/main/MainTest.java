package cn.kidjoker.main;

import cn.kidjoker.el.ElConfig;
import cn.kidjoker.service.IDemoPrototypeService;
import cn.kidjoker.service.IDemoSingletonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ElConfig.class);

        ElConfig resourceService = ctx.getBean(ElConfig.class);

        resourceService.outputResource();

		ctx.close();
	}
}
