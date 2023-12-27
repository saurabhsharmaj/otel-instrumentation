package com.example.demo;



import java.util.UUID;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {	
	Logger log = LogManager.getLogger(HomeRestController.class);
		
		@GetMapping("/")
		public String getProcessDefinitions() {
			UUID uuid=UUID.randomUUID();
			log.info("OrderService-"+uuid.toString());
			return "OrderService-"+uuid.toString();
		}
		
}
