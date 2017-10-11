package com.justin.createitem;

public class Item {
	private String flaskType;
	private String[] Prefix;
	private String[] Suffix;
	
	public String getFlaskType() {
		return flaskType;
	}
	public void setFlaskType(String flaskType) {
		this.flaskType = flaskType;
	}
	public String[] getPrefix() {
		return Prefix;
	}
	public void setPrefix(String[] prefix) {
		Prefix = prefix;
	}
	public String[] getSuffix() {
		return Suffix;
	}
	public void setSuffix(String[] suffix) {
		Suffix = suffix;
	}
}
