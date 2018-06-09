package cn.kidjoker.service.impl;

import org.springframework.stereotype.Service;

import cn.kidjoker.service.IFunctionService;

/**
 *
 *
 * @auther KidjokeR
 * @since 2018年6月7日 - 下午11:13:28
 * @version 1.0.0
 */
@Service
public class FunctionService implements IFunctionService {

	@Override
	public String sayHello(String word) {
		return "Hello " + word + " !";
	}
	
}
