package com.example.whiteboardfall2018serverjava.models;

public class Module {
	private int id = (int)(Math.random() * Integer.MAX_VALUE);
	private String title;
	public Module() {}
	public Module(String title) {
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
