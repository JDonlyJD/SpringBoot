package com.board.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

//import에 getter을 쳤을 때 import가 된다면 lombok설치가 잘 된 것임!
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


// 롬복의 getter, setter 어노테이션을 통해 set, get등의 메서드를 굳이 작성하지 않아도
// 사용할 수 있도록 처리해주고 있다. ==> getter, setter없이도 lombok만으로 가능!
@Getter
//@Setter


// RequiredArgsConstructor : 해당 속성을 필요로 하는 생성자가 롬복을 통해 자동 생성 -> 의존성 주입에도 사용한다.
// 생성자 초기화도 대신 해줌 ! 
// * 의존성 주입은 pom.xml, buildGradle에서 의존성 주입 (dependency추가)을 하는게 일반적이지만,
//   자바코드로도 할 수 있다. 
@RequiredArgsConstructor


public class lombokTest {
	
	// final만 붙이면 상수로! 
	private final String hello;
	//private int lombokint;
	private final int lombokint;
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		lombokTest lombk = new lombokTest("ㅎㅇ",22177);
		//lombk.setHello("ㅎㅇ");
		//lombk.setLombokint(273273);
	
		System.out.println(lombk.getHello());
		System.out.println(lombk.getLombokint());
		
	}
}


/*
패키지 : java파일(Controller, Service)등이 저장된다. 



프로젝트명 + application.java 파일 : 스프링부트의 시작을 담당하는 파일
프로젝트명 + application.java  - @SpringBootApplication : 스프링부트의 설정을 관리하는 어노테이션
	
resources : db, 데이터 등... html, css, 자바스크립트, 환경설정 파일들이 들어감... 
application.properties : db설정, 프로젝트 환경정보를 저장
static 디렉토리 : ??
		
src/main/java : 

	buildgradle : 메이븐의 pom.xml과 비슷 / for.의존성 주입. 
	
	db는 jpa로 대체하겠다.
	
	junit : db정보를 빠르게 확인할 수 있음.

*/



