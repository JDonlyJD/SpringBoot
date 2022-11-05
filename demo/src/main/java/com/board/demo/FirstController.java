package com.board.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {

	//리턴문자를 수정했지만 페이지상의 내용은 변경되지 않았음 로컬was가 변경된 클래스를 리로딩하지 않았음.
	
	@RequestMapping("/hello") ///url을 주는 것
	@ResponseBody //해당 url을 타고왔을 때의 응답
	public String sayhi() {
		return "hihihiih";
	}


}



