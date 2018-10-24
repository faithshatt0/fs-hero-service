package edu.csumb.cst438.hero.api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Controller {

	@RequestMapping ("/getHeroes")
	@ResponseBody
	String getHeroes () {
		return "Get Heroes done.";
	}
}