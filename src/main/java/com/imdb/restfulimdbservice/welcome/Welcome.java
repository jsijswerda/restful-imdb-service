package com.imdb.restfulimdbservice.welcome;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

	@GetMapping(path="/welkom")
	public String welcome() {
		return "welcome";
	}
}
