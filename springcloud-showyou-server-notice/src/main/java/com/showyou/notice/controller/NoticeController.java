package com.showyou.notice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/notice")
public class NoticeController {

	@Value("${server.port}")
	private String port;
	@Value("${spring.datasource.url}")
	private String foo;
	@Value("${testName}")
	private String userName;
	
	@RequestMapping("/showHello")
	public String showHello(){
//		return "hello,i'm from "+ port;
		return foo;
		
	}
	@RequestMapping("/show")
	public String show(){
//		return "hello,i'm from "+ port;
		return userName;
		
	}
}
