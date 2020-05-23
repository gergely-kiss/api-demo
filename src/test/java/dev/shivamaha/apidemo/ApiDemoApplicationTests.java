package dev.shivamaha.apidemo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootTest
class ApiDemoApplicationTests {
	private final ConfigurableApplicationContext context;

	ApiDemoApplicationTests(ConfigurableApplicationContext context) {
		this.context = context;
	}

	@Test
	void contextLoads() {
		Assert.assertNotNull(context);
	}
	@Test
	void mainTest(){
		ApiDemoApplication.main(new String[]{});
	}


}
