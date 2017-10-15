package com.justin.jsoncreator;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;

public class JsonCreatorTest {
	JsonCreator jsonCreator;
	@Before
	public void init(){
		jsonCreator = new JsonCreator();
	}
	@Test
	public void canJsonCreator(){
		jsonCreator.createObjectFromJson();
		
	}
	@Test
	public void canUnMapObject() throws JsonProcessingException{
		jsonCreator.unMapObject();
		
	}
}
