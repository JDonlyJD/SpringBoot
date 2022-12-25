package com.board.demo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.board.question.Question;
import com.board.question.QuestionRepository;
import com.board.question.QuestionService;

import lombok.RequiredArgsConstructor;


//컨트롤러로 사용하려면, 컨트롤러로 설정해놔야한다!
@Controller

//repository기반으로 연결되어있는 해당 테이블(객체)의 해당 엔티티의 ~로 ~를 만들어줌
@RequiredArgsConstructor
public class MainController {

	
	private final QuestionService questionService;
	
	private final QuestionRepository questionRepository;
	
	
	@RequestMapping("/main")
	@ResponseBody
	public void index() {
		System.out.println("인덱스입니다."); 
	}
	

	
	@RequestMapping("/question/list/{id}")
	@ResponseBody
	public String list(Model model, @PathVariable("id") Integer id) {
		
		Question question = this.questionService.getQuestion(id);
		model.addAttribute("question",question);
		
		return "question_detail";
	}
	
/*	public static index() {
		return "인덱스에요!"
	}	*/
	
}
