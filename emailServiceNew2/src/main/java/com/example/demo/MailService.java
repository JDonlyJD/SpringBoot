package com.example.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

	
	@Autowired
	private JavaMailSender mailSend;
	
	
	public void sendMail() {
		
		// 수신 대상을 담을 ArrayList 생성
		ArrayList<String> toUserList = new ArrayList<>(); 
		
		// 수신대상 추가
		toUserList.add("wjd4998@naver.com");

		// 수신대상 개수 확인
		int toUserSize = toUserList.size();
		
		// SimpleMailMessage : 단순 텍스트 구성 메일 메시지 생성할 때 이용
		SimpleMailMessage simpleMessage = new SimpleMailMessage();
		
		// 궁금한 클래스 : f3을 누르면 해당 클래스 분석 가능..!!  
		simpleMessage.setTo((String[])toUserList.toArray(new String[toUserSize]));
		
		// 메일 제목
		simpleMessage.setSubject("SMTP 사용 예제입니다.");
		
		// 메일 내용
		simpleMessage.setText("내용 예시입니다.");
		
		// 메일 발송
		mailSend.send(simpleMessage);
		
	}
}
