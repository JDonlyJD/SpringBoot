package com.example.demo;

import org.springframework.stereotype.Controller;

@Controller
public class TestController {

	
	@request
	public String test() {
		return "이메일 서비스 시작전 테스트";
	}
	
}
