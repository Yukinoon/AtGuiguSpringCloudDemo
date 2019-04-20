package com.atguigu.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;


@Configuration
public class MySelfRule {

	@Bean
	public IRule myRule() {
		
//		return new RandomRule();//目的:用我们重新选择的随机算法替换掉默认的轮询。
		
		return new RandomRule_ZY();//
	}
}
