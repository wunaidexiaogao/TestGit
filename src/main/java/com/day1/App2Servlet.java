package com.day1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.day1.servlet.SecondServle;

/*
 * SpringBoot整合Servlet方式二
 * 
 */
@SpringBootApplication
public class App2Servlet {
	
	public static void main(String[] args) {
		SpringApplication.run(App2Servlet.class, args);
	}
	@Bean
	public ServletRegistrationBean getServletRegistrationBean(){
		ServletRegistrationBean bean = new ServletRegistrationBean(new SecondServle());
		bean.addUrlMappings("/second");
		return bean;
	}
}
