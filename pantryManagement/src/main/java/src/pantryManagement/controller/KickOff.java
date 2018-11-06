package src.pantryManagement.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KickOff {

	
	@RequestMapping("/")
	public String start() {
		return "ready to start";
	}

}
