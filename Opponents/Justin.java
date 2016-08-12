package com.Opponents;

public class Justin extends Opponents {

	String name = "Justin";

	public Justin() {
	}

	@Override
	public String determiner() {

		double random = Math.random();

		if (random < 0.33) {
			return "S";
		} else if (random < 0.66) {
			return "P";
		} else {
			return "R";

		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
