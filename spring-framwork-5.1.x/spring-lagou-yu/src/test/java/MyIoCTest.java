import com.lagou.edu.LagouBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MyIoCTest {

	@Test
	public void testMyIoC() {

		/*
		 * Ioc容器创建管理Bean对象的，Spring Bean是有生命周期的.
		 *
		 * 构造器执行、初始化方法执行、Bean后置处理器的before/after方法：
		 * 		AbstractApplicationContext # refresh # finishBeanFactoryInitialization
		 * Bean工厂后置处理器constructor、方法执行：
		 * 		AbstractApplicationContext # refresh # invokeBeanFactoryPostProcessors
		 * Bean后置处理器constructor：
		 * 		AbstractApplicationContext # refresh # registerBeanPostProcessors
		 *
		 * 可见，AbstractApplicationContext中的refresh方法是很重要的方法。
		 */
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

		LagouBean result = (LagouBean) applicationContext.getBean("lagouBean");
		System.out.println("This is lagouBean: " + result);
		assertThat(result).isNotNull();
	}

	@Test
	public void testMyAOP() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

		LagouBean result = applicationContext.getBean(LagouBean.class);
		result.print();
	}
}
