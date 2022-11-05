package com.board.demo;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	
	// QuestionRepository의 정보를 가지고 오기 위해서 호출!
	// 가져올 때 어떤 Annotation을 써야할까 ? @Autowired : 객체 자동 생성 , 서비스와 다른 모델로의 연결이었는데... 
	// 지금은 서비스쪽을 안만짐. 
	@Autowired
	private QuestionRepository questionRepository;
	
	//JUnit으로 테스트한다는 Annotation : @Test 
	// -> Run As - Junit Test
	@Test
	void contextLoads() {
		
		//생성자 선언
		Question q  = new Question();		
		//글 제목
		q.setSubject("제목 테스트1");
		q.setContent("내용 테스트1");
		q.setCreateDate(LocalDateTime.now()); // sysDate(), getDate()와 동일
		this.questionRepository.save(q);

		
		
		//생성자 선언2
		Question q2  = new Question();		
		//글 제목
		q2.setSubject("제목 테스트2");
		q2.setContent("내용 테스트2");
		q2.setCreateDate(LocalDateTime.now()); // sysDate(), getDate()와 동일
		this.questionRepository.save(q2);
		
		
	}

}
