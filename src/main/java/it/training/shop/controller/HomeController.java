package it.training.shop.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HomeController {

	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello Somchai!";
	}
	
	
	
	@PutMapping("/hello2")
	public ResponseEntity<String> hello2(@RequestParam("name") String name,
									  	 @RequestParam("surname") String surname){
		
		String result = "Hello, " + name + " " + surname;
		
		return ResponseEntity.ok(result);
	}
	
	
	@GetMapping("/hello3/{name}")
	public ResponseEntity<String> hello3(@PathVariable String name){
		
		String result = "Hello, " + name;
		
		return ResponseEntity.badRequest().body("");
	}
	
	
	
	
	
	
	
}
