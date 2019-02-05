package ru.mera.pechenkina.task6_1;

import ru.mera.pechenkina.task6_1.GamesWithFire.Games;

public class Person {
	private String name;
	private Games game;

	public Person(String name, Games game) {
		this.name = name;
		this.game = game;
	}

	public String getName() {
		return name;
	}

	public Games getGame() {
		return game;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format(" Our person: %s playes game: %s", getName(), getGame());
	}
	
	
}
