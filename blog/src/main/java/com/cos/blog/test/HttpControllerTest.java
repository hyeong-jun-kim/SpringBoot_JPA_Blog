package com.cos.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HttpControllerTest {
	private static final String TAG = "HttpControllerTest:";
	//localhost:8000/blog/http/lombok
	@GetMapping("/http/lombok")
	public String lonbokTest() {
		Student s = Student.builder().stu_num(123).password("1234").email("email").build();
		System.out.println(TAG+"getter :"+s.getStu_num());
		s.setStu_num(2000);
		System.out.println(TAG+"getter :"+s.getStu_num());
		return "lombok test 완료";
	}
	@GetMapping("/http/get")
	public String getTest() {
		Student s = Student.builder().stu_num(123).password("1234").email("email").build();
		return "lombok test 완료";
	}
	@PostMapping("/http/post")
	public String postTest(@RequestBody Student s) {
		return "post 요청: " + s.getStu_num() + ", " + s.getName() + ", " + s.getPassword() + ", "  + s.getEmail();
	}
	@PutMapping("/http/put")
	public String putTest(@RequestBody Student s) {
		return "put 요청: " + s.getStu_num() + ", " + s.getName() + ", " + s.getPassword() + ", "  + s.getEmail();
	}
	@DeleteMapping("/http/delete")
	public String deleteTest() {
		return "delete 요청";
	}	
}
