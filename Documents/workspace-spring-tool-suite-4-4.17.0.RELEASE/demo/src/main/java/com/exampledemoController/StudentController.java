package com.exampledemoController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
	@GetMapping("/getdata")
	public String getTest() {
		return "student data";
	}
	@GetMapping("/getstu")
	public String getstu() {
		return "i am something";
	}

}
