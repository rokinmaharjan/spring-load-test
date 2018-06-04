package com.rokin.load;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/load")
public class LoadController {
	@Autowired
	private LoadService loadService;

	@GetMapping
	public String getString() {
		return "hahaha";
	}
	
	@GetMapping("/ddos")
	public String performDdos(@RequestParam("url") String url) {
		try {
			loadService.performDdos(url);
			loadService.performDdos(url);
			loadService.performDdos(url);
			loadService.performDdos(url);
			loadService.performDdos(url);
			loadService.performDdos(url);
			loadService.performDdos(url);
			loadService.performDdos(url);
			loadService.performDdos(url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "Performing DDOS on ".concat(url).concat(" in background");
	}
}
