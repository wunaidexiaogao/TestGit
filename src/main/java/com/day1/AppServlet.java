/**
 * 
 */
package com.day1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author 98591
 * SpringBoot整合servlet方式一
 *
 *
 */
@SpringBootApplication
@ServletComponentScan //在Spring boot启动时会扫描@WebServlet 并将该类实例化
public class AppServlet {

	public static void main(String[] args) {
		SpringApplication.run(AppServlet.class, args);
	}
}
