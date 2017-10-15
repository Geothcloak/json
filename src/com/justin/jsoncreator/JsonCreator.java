package com.justin.jsoncreator;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.justin.createitem.Item;

public class JsonCreator {
	public Item createObjectFromJson(){
		ObjectMapper mapper = new ObjectMapper();
		String jsonString = "{\"flaskType\": \"Healing\",\"prefix\": [\"Seething\", \"Bubbling\"],\"suffix\":[\"Of Movement\", \"Of Damage\"]}";
		Item item = null;
		try {
			item = mapper.readValue(jsonString, Item.class);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return item;
	}
	public void unMapObject() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		Item item = createObjectFromJson();
		String jsonString;
		jsonString = mapper.writeValueAsString(item);
	}
	
	
 }
