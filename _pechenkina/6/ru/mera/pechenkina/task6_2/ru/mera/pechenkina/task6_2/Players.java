package ru.mera.pechenkina.task6_2;

public class Players {
	
	
	public enum Names {
		ABC,
		BCD,
		CDE,
		DEF,
		EFG,
		FGH,
		GHI,
		HIJ,
		IJK,
		JKL;				
	}
	
	public enum PlayerState {
		HIDE,
		NOTHIDE,
		WENTHOME
	}
	
	private String names;
	private String playerState;
	/**
	 * @param names
	 * @param playerState
	 */
	public Players(String name, String playerStates) {
		names = name;
		playerState = playerStates;
	}
	public String getNames() {
		return names;
	}
	public String getPlayerState() {
		return playerState;
	}
	
	@Override
    public String toString() {
        return String.format("Player with name: %s now he is %s", getNames(), getPlayerState());
    }

}
	

