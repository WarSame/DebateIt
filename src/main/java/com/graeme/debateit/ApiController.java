package com.graeme.debateit;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	@RequestMapping("/api")
	public int getApi() {
		return 5;
	}
	
}
