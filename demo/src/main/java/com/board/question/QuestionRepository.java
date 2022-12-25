package com.board.question;

import org.springframework.data.jpa.repository.JpaRepository;

//jpa repository를 상속받자. / <클래스명(테이블), 키타입>
// 리파지토리를 생성하기 위해서는 JpaRepository 인터페이스를 상속받아야 한다.
// JpaRepository를 상속할때는 제네릭으로 받아와야 하며,
// 엔티티의 타입(테이븖명)과 해당 엔티티의 PK의 속성을 지정해야한다.
// 
public interface QuestionRepository extends JpaRepository<Question, Integer>{

}
