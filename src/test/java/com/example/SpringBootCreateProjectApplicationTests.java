package com.example;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.example.controller.SampleController;

/*
 * 테스트 클래스에서 @WebMvcTest 어노테이션을 추가해서 특정 컨트롤러를 지정해준다.
 * @WebMvcTest 어노테이션을 사용하면 @Controller, @Component, @ControllerAdvice등이 작성된 코드를 인식할 수 있다.
 * 컨트롤러를 테스트 하려면 MockMvc 타입의 객체를 사용해야 하는데 
 * @WebMvcTest와 같이 사용하면 별도의 생성없이 @Autowired만으로 코드를 작성할 수 있기때문에 편리하다.
 * 컨트롤러를 테스트하는 경우 @SpringBootTest 어노테이션은 사용하지 않는다.
 * */
@RunWith(SpringRunner.class)
//@SpringBootTest
@WebMvcTest(SampleController.class)
public class SpringBootCreateProjectApplicationTests {
	@Autowired
	MockMvc mock;
	
	@Test
	public void testHello() throws Exception {
		//perform()을 이용해 객체를 브라우저에서 서버의 URL을 호출하듯이 테스트를 진행할 수 있고 결과는 andExpect()를 이용해서 확인할 수 있다.
//		mock.perform(get("/hello")).andExpect(content().string("Hello World"));
		
		// andExpect()는 결과 확인 외에도 Response에 대한 정보(정상적인 응답 상태, 응답으로 전송되는 결과)를 체크하는 용도로 사용할 수 있다.
		MvcResult mvcResult = mock.perform(get("/hello")).andExpect(status().isOk()).andExpect(content().string("Hello World!")).andReturn();
		
		System.out.println(mvcResult.getResponse().getContentAsString());
	}
}
