package com.example.demo.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {
	
	@GetMapping("/hello")
	public String hello(Map<String, String> map) {
		map.put("hello-key", "!!!!!!123456789!!!!!!!!!!");
		return "hello-nihao-!!!!!";
	}
}
