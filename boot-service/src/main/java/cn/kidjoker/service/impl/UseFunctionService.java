package cn.kidjoker.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kidjoker.service.IUseFuntionService;

/**
 *
 *
 * @auther KidjokeR
 * @since 2018年6月7日 - 下午11:15:55
 * @version 1.0.0
 */
@Service
public class UseFunctionService implements IUseFuntionService {
	
	@Autowired
	private FunctionService functionService;
	
	@Override
	public String sayHello(String word) {
		return functionService.sayHello(word);
	}

}
