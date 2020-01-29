package com.accenture.streamexamples;

public class Player extends Person {

	String teamName;

	public Player(String name, int age, String teamName) {
		super(name, age);
		this.teamName = teamName;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	@Override
	public String toString() {
	
		return "[ Player Name :"+this.getName()+", Age :"+this.getAge()+", Team Name :"+this.teamName+" ]";
	}

}
