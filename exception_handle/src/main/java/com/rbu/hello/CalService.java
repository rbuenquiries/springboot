package com.rbu.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalService {
	
	@PostMapping("/cal")
	public Integer calDiv(@RequestParam("first") int first,@RequestParam("second") int second) {
		return first/second;
	}
	
	@GetMapping("/cal")
	public Integer calDiv2(@RequestParam("first") int first,@RequestParam("second") int second) {
		return first/second;
	}

}
