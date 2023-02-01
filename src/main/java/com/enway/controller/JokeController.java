package com.enway.controller;

import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	@GetMapping("/api-get-single")
	public String getApiSingle(@QueryParam("id") int id) {
		return jokeService.invokeGetApiSingle(id);
	}
	
	@PostMapping("/api-post")
	public void postApi(@RequestBody Joke joke) {
		jokeService.invokePostApi(joke);
	}
	
	@DeleteMapping("/api-delete/{id}")
	public boolean deleteApi(@PathVariable int id) {
		return jokeService.deleteApi(id);
	}
	
	@PutMapping("/api-put")
	public String putApi(@RequestBody Joke joke) {
		return jokeService.putApi(joke);
	}

}
