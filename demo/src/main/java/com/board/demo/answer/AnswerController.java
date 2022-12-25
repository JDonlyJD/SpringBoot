package com.board.demo.answer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.board.question.Question;
import com.board.question.QuestionService;

import lombok.RequiredArgsConstructor;


@RequestMapping("/answer")
@RequiredArgsConstructor
@Controller
public class AnswerController {

	private final QuestionService questionServcie;
	private final AnswerService answerService;
	
	
	@PostMapping("/create/{id}")
	public String createAnser(Model model, 
			@PathVariable("id") Integer id,
			@RequestParam String content) {
		
		Question question = this.questionServcie.getQuestion(id);
		return String.format("redirect:/question/detail/%s, id");
	}
}
