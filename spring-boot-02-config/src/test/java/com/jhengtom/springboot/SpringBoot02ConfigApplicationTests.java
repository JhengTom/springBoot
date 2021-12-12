package com.jhengtom.springboot;

import com.jhengtom.springboot.bean.Emp;

import com.jhengtom.springboot.service.EmpService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringBoot02ConfigApplicationTests {
	@Autowired
	Emp emp;

	@Autowired
	ApplicationContext context;

	@Test
	public void testXml() {
		EmpService empService = (EmpService) context.getBean("empService");
		System.out.println(empService);
		empService.add();
	}

	@Test
	public void testXml2() {
		EmpService empService2 = (EmpService) context.getBean("empService2");
		System.out.println(empService2);
		empService2.add();
	}

	@Test
	void contextLoads() {
		System.out.println(emp);
	}

}
