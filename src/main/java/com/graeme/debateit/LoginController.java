package com.graeme.debateit;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@RequestMapping("/user")
	public Principal getUser(Principal principal) {
		return principal;
	}
}
