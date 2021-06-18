package org.springframework.demo.domain;

/**
 * program: spring
 * description: domain
 *
 * @author junjie.fu
 * create: 2021-06-18 09:56
 */
public class Student {
	private String name;
	private Integer age;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}
}
