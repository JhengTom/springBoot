package com.jhengtom.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
/**
 * 用於導入spring的配置文件，並且加載到容器中
 * @ImportResource(locations = {"classpath:spring01.xml"})
 *
 * 如果要使用config加載到容器中，注意要把@ImportResource註解掉，不然就會兩邊加載
 */

//@ImportResource(locations = {"classpath:spring01.xml"})
@SpringBootApplication
public class SpringBoot02ConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot02ConfigApplication.class, args);
	}

}

