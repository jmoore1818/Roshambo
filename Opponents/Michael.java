package com.Opponents;

public class Michael extends Opponents {

	String name = "Michael";

	public Michael() {
	}

	@Override
	public String determiner() {

		return "R";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}