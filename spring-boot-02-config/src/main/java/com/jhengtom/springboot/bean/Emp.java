package com.jhengtom.springboot.bean;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * @ConfigurationProperties:告訴SpringBoot將配置文件中的對應屬性值，映射到這個組件類別中 prefix ="emp":前綴名，配置文件中的前綴名，相同就映射
 * @Component:必須將當前組件作為告訴SpringBootSpringBoot中的一個組件，才能使用容器提供的@ConfigurationnProperties
 * @PropertySource 使用這個的時候要配和@ConfigurationProperties 去控制前綴名，使其映射進入物件
 */
/**
 * 吃 application.yml/application.properties
 * 	@Component
 * 	@ConfigurationProperties(prefix = "emp") 全局配置
 */

/**
 *JSR303 驗證
 * @Validated
 */

/**
 * 局部配置@PropertySource 使用這個的時候要配和@ConfigurationProperties 去控制前綴名，使其映射進入物件
 * @PropertySource(value = { "classpath:emp.properties" })
 */

@ConfigurationProperties(prefix = "emp") //只要你想要配置文件都要存在
@PropertySource(value = {"classpath:emp.properties"})
@Component
@Validated
public class Emp {
	/**
	 * 類似於 Spring 中的 xml 配製檔中的資料注入方式：
	 * <bean class="Emp">
	 * <property name="lastName" value="字面量/ #{SpEL}Spring運算式/ ${key}從配製文件取值">
	 * </property>
	 * </bean>
	 */
	//	@Email
	//	@Value("${emp.last-name}")
	private String lastName;
	//	@Value("#{10*2}")
	private Integer age;
	//	@Value("38000 ")
	private Double salary;
	private Boolean boss;
	private Date birthday;

	private Map<?, ?> map;
	private List<?> list;

	private Forte forte;

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Boolean getBoss() {
		return boss;
	}

	public void setBoss(Boolean boss) {
		this.boss = boss;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Map<?, ?> getMap() {
		return map;
	}

	public void setMap(Map<?, ?> map) {
		this.map = map;
	}

	public List<?> getList() {
		return list;
	}

	public void setList(List<?> list) {
		this.list = list;
	}

	public Forte getForte() {
		return forte;
	}

	public void setForte(Forte forte) {
		this.forte = forte;
	}

	@Override
	public String toString() {
		return "Emp [lastName=" + lastName + ", age=" + age + ", salary=" + salary + ", boss=" + boss + ", birthday=" + birthday + ", " +
				       "map=" + map + ", list=" + list + ", forte=" + forte + "]";
	}

}
