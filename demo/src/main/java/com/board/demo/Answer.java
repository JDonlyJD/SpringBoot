package com.board.demo;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

//엔티티 클래스
//아래의 클래스들이 DB테이블을 대신한다. = DB테이블과 매핑된다.
@Getter
@Setter
@Entity
public class Answer {

	// 댓글테이블
	
	//id : 기본키 지정(for.중복 방지)
	//id 어노테이션이 지정되면 기본키의 모든 특성을 가진 컬럼과 동일하게 적용
	//Generatedvalue : 오라클 시퀀스와 동일
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@Column(columnDefinition = "TEXT")
	private String content;
	
	
	//컬럼 어노테이션이 없어도 컬럼으로 인식
	//만약 컬럼으로 인식하고 싶지않은 필드에는 @Transien
	private LocalDateTime createDate;
	
	
	
	//Question과 Answer의 연결을 해주기 위해서
	// @ManyToOne - OneToMany로 연결시켜줌 : Question테이블에서는 OneToMany코드 있음
	@ManyToOne
	private Question question;
	
	
	
}
