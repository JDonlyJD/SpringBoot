package com.board.demo;

import com.board.question.Question;
import com.board.question.QuestionRepository;

public class Search {

	   @Autowired
	   private QuestionRepository questionRepository;
	   
	   //jpa를 통한 데이터 조회
	   @Test
	   void testJpa() {
	      List<Question> all = this.questionRepository.findAll();
	      // assertEquals(기대값, 실제값)
	      // 기대값이 실제값과 동일하지 않으면 테스트는 실패처리된다.
	      assertEquals(1, all.size());
	            
	      Question q = all.get(0);
	      assertEquals("테스트중입니다.", q.getSubjet());

}
}



