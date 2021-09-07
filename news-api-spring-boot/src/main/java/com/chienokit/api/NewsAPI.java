package com.chienokit.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// NewsAPI chỉ là 1 class, muốn trở thành web service thì phải thêm anotation @RestController
@RestController
public class NewsAPI {
	@GetMapping("/test")

	public String testAPI() {

		return "success";

	}
}
