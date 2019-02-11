package ru.mera.pechenkina.task6_2;

public class Leader {

	public enum LeaderStates {YOUHIDING,SILENTSEARCH}
    private String LeaderStates;
    	
	/**
	 * @param leaderStates
	 */
	public Leader(String leaderStates) {
		LeaderStates = leaderStates;
	}
	
	public String getLeaderStates() {
		return LeaderStates;
	}

	@Override
    public String toString() {
        return String.format("Leader says  %s", getLeaderStates());
    }
}
