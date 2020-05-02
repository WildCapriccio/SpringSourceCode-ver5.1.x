import com.lagou.edu.LagouBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MyIoCTest {

	@Test
	public void testMyIoC() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

		LagouBean result = (LagouBean) applicationContext.getBean("lagouBean");
		System.out.println("This is lagouBean: " + result);
		assertThat(result).isNotNull();
	}
}
