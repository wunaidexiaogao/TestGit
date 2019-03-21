package com.day1.controller;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * SpringBoot HelloWorld
 * @author 98591
 *
 */

@Controller
public class HelloWorld {
	
	@RequestMapping("/hi")
	@ResponseBody
	public Map<String,Object> showHelloWorld(){
		Map<String, Object> map = new HashMap<>();
		map.put("msg", "Hello World");
		return map;
	}
}
