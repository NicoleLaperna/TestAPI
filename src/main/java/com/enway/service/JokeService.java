package com.enway.service;

import com.enway.entity.Joke;

public interface JokeService {
	
	public String invokeGetApi();
	
	public String invokePostApi(Joke joke);
	
	public String invokeGetApiSingle(int id);

}
