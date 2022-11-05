package com.board.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


//컨트롤러로 사용하려면, 컨트롤러로 설정해놔야한다!

@Controller
public class MainController {

	@RequestMapping("/main")
	@ResponseBody
	public void index() {
		System.out.println("인덱스입니다."); 
	}
	
	
	
/*	public static index() {
		return "인덱스에요!"
	}	*/
	
}
