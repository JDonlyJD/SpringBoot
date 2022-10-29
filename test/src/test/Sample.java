package test;

public class Sample {

	public static void main(String[] args) {
		
		//클래스 안의 변수 = 필드
		String test;
		
		// Sample클래스의 인스턴스 sam을 생성
		Sample sam = new Sample();
		Sample kim = new Sample();
		
		/*
		 객체와 인스턴스의 차이 : 관계의 차이
		
		 스레드
		 프로세스 : 실행중인 프로그램
		 프로그램이 운영체제에 의해 메모리 공간을 할당받아 실행중인 것.
		 프로세스는 프로그램에 사용되는 데이터와 메모리 등의 자원과 스레드로 구성
		
	 	 Multi-Process와 Multi-Thread의 차이점
		 Multi-Process : 하나의 응용프로그램을 여러개의 프로세스로 구성하여 각 프로세스가 하나의 작업을 처리하도록 하는 것.
		 장점 ) 하나의 프로세스가 죽어도 다른 프로세스에는 영향이 없다.
		 단점 ) 오버헤드가 발생할 확률이 있음. / 성능저하를 유발할 수 있다.
		
		 Multi-Thread : 하나의 응용프로그램을 여러개의 스레드로 구성하여 각 스레드가 하나의 작업을 처리하도록 하는 것
		 장점 ) 자원을 효율적으로 관리할 수 있다. 
		 단점 ) 하나의 스레드가 문제가 발생하면 전체적으로 영향을 끼칠 수 있음.
		
		 Collection vs Generic
		 Collection Framework의 종류 : List / Map / Tree ...
		 
		 람다 : 익명함수
		 
		 Web Framework : 웹 프로그램을 만들기위한 일종의 토탈패키지 
		 			ex : Spring, Rails, Express, React, Vue, Angular, NextJS, NestJS, Django, FLASK, FastAPI...
		 			
		 프레임워크를 통해 얻을 수 있는것들 (boot기준) : 
		 -1. 우수한 보안 : 아래의 공격등을 SpringBoot는 막을 수 있다.
		 	 SQL Injection : 악의적 SQL을 JS등을 통해 주입하여 공격하는 방법. 
		 	 XSS : 자바스크립트를 악의적으로 주입하여 공격하는 방법.
		 	 CSRF: 위조된 요청을 보내는 공격방법
		 	 ClickJacking : 사용자의 유도하지 않은 클릭을 유도하는 공격방법
		 -2. WAS 자동내장(Tomcat)
		 -3. 쉬운 설정

		 MVC 패턴 : 
		 - Model : 데이터 관리 
		 - View : UI
		 - Controller : Model과 View의 제어 
		 
		  mvt(Model View(Controller역할) Template(View역할)) 
		  mtv
		 
		 root context / servlet context / 
		 
		 Spring Legacy

		 */
		
		
		
	}
}
