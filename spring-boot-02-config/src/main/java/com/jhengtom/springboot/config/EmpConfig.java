package com.jhengtom.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jhengtom.springboot.service.EmpService;

/**
 * @Configuration(組態) :他是spring裡的注釋，用於標示當前類是個一個配置類，來表示對應的Spring配置文件
*/
@Configuration
public class EmpConfig {

	/**
	 * @Bean 標示的方法用於向容器中注入組件
	 * 1.返回值就是注入容器的組件對象
	 * 2.方法名就是組件的id值
	 */
	@Bean
	public EmpService empService2() {
		System.out.println("EmpService 組件注入成功");
		return new EmpService();
	}
}
