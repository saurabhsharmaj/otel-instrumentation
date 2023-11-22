package com.example.demo;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {	

		@GetMapping("/")
		public String getProcessDefinitions() {
			return "price-service-"+UUID.randomUUID().toString();
		}
		
}
