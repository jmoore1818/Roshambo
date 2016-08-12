package com.Opponents;

public class User extends Opponents {

	String name = null;
	String myThrow = null;

	public User(String name, String myThrow) {
		this.name = name;
		this.myThrow = myThrow;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMyThrow() {
		return myThrow;
	}

	public void setMyThrow(String myThrow) {
		this.myThrow = myThrow;
	}

	@Override
	public String determiner() {

		return myThrow;
	}

}
