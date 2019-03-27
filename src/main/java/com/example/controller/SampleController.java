package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.SampleDao;

/*
 * @RestController 어노테이션을 이용해서 스프링의 빈에 등록한다.
 * 기존 스프링 프레임워크에서 어노테이션을 이용하기 위해서는 xml 파일에 <component-scan>등과 같은 별도의 설정이 필요하지만 boot의 경우는 자동으로 처리된다.
 * 단, 다른 패키지에 있는 클래스를 사용하고 싶은 경우에는 @ComponentScan 어노테이션을 이용하면 된다.
 * Rest 방식의 컨트롤러이다.
 * */
@RestController
public class SampleController {
	
	@GetMapping("/hello") // @GetMapping 어노테이션으로 클라이언트의 요청 URI를 매핑해준다.
	public String sayHello() {
		return "Hello World!";
	}
	
	@GetMapping("/sample")
	public SampleDao makeSample() {
		SampleDao sampleDao = new SampleDao();
		sampleDao.setValue2("v1");
		sampleDao.setValue1("v2");
		sampleDao.setValue3("v3");
		
		System.out.println(sampleDao);
		
		return sampleDao;
	}
}
