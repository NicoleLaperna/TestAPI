package com.enway.service.impl;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.enway.entity.Joke;
import com.enway.service.JokeService;

@Service
public class JokeServiceImpl implements JokeService{
	
	public String invokeGetApi() {
		RestTemplate restTemplate= new RestTemplate();
		String url = "http://localhost:3307/getAll";
		String result = restTemplate.getForObject(url, String.class);
		return result;
	}
	
	public String invokePostApi(Joke joke) {
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:3307/saveJoke";
		
//		Joke request = new Joke(joke.getId(), joke);
		
		HttpEntity<Joke> entity = new HttpEntity<>(joke);
		
		ResponseEntity<Joke> response = restTemplate.exchange(
			    url, HttpMethod.POST, entity, Joke.class);
		
		Joke responseObject = response.getBody();
		
		return responseObject.toString();
	}

}
