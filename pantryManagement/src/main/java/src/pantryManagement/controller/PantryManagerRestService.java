package src.pantryManagement.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import src.pantryManagement.model.constants;

@RestController
@RequestMapping("api/v1/pantryManager/")
public class PantryManagerRestService {
	private constants CONST = new constants();
	
	@RequestMapping(value="welcome", method=RequestMethod.GET)
	public ArrayList<String> welcomeMessage(){
		ArrayList<String> myWelcomeMessage = new ArrayList<String>();
		myWelcomeMessage.add(CONST.WELCOME_MSG);
		return myWelcomeMessage;
	}

}