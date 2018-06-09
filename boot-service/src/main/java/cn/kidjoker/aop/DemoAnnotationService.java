package cn.kidjoker.aop;

import org.springframework.stereotype.Service;

/**
 *
 *
 * @auther KidjokeR
 * @since 2018年6月9日 - 上午11:04:53
 * @version 1.0.0
 */
@Service
public class DemoAnnotationService {
	
	@Action(name="注解式拦截的aop操作")
	public void add() {}
	
}
