package com.graeme.debateit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class DebateItApplication extends WebMvcConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication.run(DebateItApplication.class, args);
	}
}
