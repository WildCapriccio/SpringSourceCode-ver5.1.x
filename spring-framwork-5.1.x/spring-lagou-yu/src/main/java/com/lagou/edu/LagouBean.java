package com.lagou.edu;

import org.springframework.beans.factory.InitializingBean;

public class LagouBean implements InitializingBean {

	private ItBean itBean;

	public void setItBean(ItBean itBean) {
		this.itBean = itBean;
	}

	public LagouBean() {
		System.out.println("LagoutBean 无参构造函数...");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("LagouBean 实现 InitializingBean的afterPropertiesSet方法...");
	}
}
