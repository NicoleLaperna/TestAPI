package com.enway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.enway.entity.Joke;
import com.enway.service.JokeService;

@RestController
public class JokeController {
	
	@Autowired
	JokeService jokeService;
	
	@GetMapping("/api-get")
	public String getApi() {
		return jokeService.invokeGetApi();
	}
	
	@PostMapping("/api-post")
	public void postApi(@RequestBody Joke joke) {
		jokeService.invokePostApi(joke);
	}

}
