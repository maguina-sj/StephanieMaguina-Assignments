package com.human.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {
	@RequestMapping("/")
	public String index(@RequestParam (value="name", required=false)String name, @RequestParam (value="lastName", required=false)String lastName, @RequestParam (value="num", required=false) Integer num) {
		String output="";
//		if(name != null && lastName != null && num > 0 && num != null) {
//			for (int i = 1; i <= num; i++) {
//				output += "Hello " + name;
//			}
//		}
//		else if(name != null && lastName != null) {
//			output= "Hello " + name + " " + lastName;
//		}
//		else if (name == null && lastName == null) {
//			output= "Hello Human";
//		}
//		
//		
//		else if (name != null || lastName != null) {
//			output= "Hello " + name ;
//		}
//		else if (lastName != null) {
//			output= "Hello " + lastName;
//		}
//		
//		else {
//			
//		}
//		return output;
//	}
//	
		if (name == null) {
			name = "Human";
		}
		if (lastName == null) {
			lastName = "";
		}
		if (num== null) {
			num = 1;
		}
		String result = "";
		for (int i = 0; i < num; i++) {
			result += String.format("Hello %s %s<br>", name, lastName);
		}
		return result;
	}
}
