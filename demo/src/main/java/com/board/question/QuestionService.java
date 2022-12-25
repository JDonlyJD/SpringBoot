package com.board.question;

import java.util.List;
import java.util.Optional;

public class QuestionService {
	
	private final QuestionRepository questionRepository;
	
	public List<Question> getList(){
		return this.questionRepository.findAll();
	}
	
	public Question getQuestion(Integer id) {
		//Optional : NullPointerException을 방지하기 위해 사용하는 mapper클래스이다.
		Optional<Question> question = this.questionRepository.findById(id);
	
		
		//isPresent : 해당데이터가 있는지 없는지 검사
		if(question.isPresent()) {
			return question.get();
		}else {
			throw new DataNotFoundException("question not found");
		}
	}
	
}
