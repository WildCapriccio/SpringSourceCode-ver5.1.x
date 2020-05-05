package com.lagou.edu;

import org.springframework.beans.factory.InitializingBean;

public class LagouBean implements InitializingBean {

	public LagouBean() {
		System.out.println("LagoutBean 无参构造函数...");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("LagouBean 实现 InitializingBean的afterPropertiesSet方法...");
	}

	public void print() {
		System.out.println("LagouBean的业务逻辑 print方法 执行");
	}
}
