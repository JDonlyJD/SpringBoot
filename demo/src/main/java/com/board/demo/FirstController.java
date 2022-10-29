package com.board.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {

	@RequestMapping("/hello") ///url을 주는 것
	@ResponseBody //해당 url을 타고왔을 때의 응답
	public String sayhi() {
		return "hihihiih";
	}


}



