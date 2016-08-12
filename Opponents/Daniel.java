package com.Opponents;

public class Daniel extends Opponents {

	String name = "Daniel";

	public Daniel() {

	}

	@Override
	public String determiner() {

		double random = Math.random();

		if (random < 0.33) {
			return "R";
		} else if (random < 0.66) {
			return "P";
		} else {
			return "S";

		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
