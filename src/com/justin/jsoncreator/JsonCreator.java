package com.justin.jsoncreator;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.justin.createitem.Item;

public class JsonCreator {
	public void createObjectFromJson(){
		ObjectMapper mapper = new ObjectMapper();
		String jsonString = "{\"Flask type\": \"healing\",\"Prefix\": [\"Seething\", \"bubbling\"],\"Suffix\":[\"Of movement\", \"Of damage\"]}";
		
		try {
			Item item = mapper.readValue(jsonString, Item.class);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
 }
