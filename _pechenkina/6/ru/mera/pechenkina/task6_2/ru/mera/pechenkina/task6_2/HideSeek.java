package ru.mera.pechenkina.task6_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import ru.mera.pechenkina.task6_2.Players.Names;
import ru.mera.pechenkina.task6_2.Players.PlayerState;


public class HideSeek {

	public static Map<Integer, Players> players = new HashMap<Integer, Players>();
	public static ArrayList<Players> winners = new ArrayList<Players>();
	public static ArrayList<Players> loosers = new ArrayList<Players>();

	public static class MiJeDogovarivalisDomaNePryatatsaException extends Exception {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public MiJeDogovarivalisDomaNePryatatsaException(String message) {
			super(message);
		}
	}

	public static void main(String[] args) throws MiJeDogovarivalisDomaNePryatatsaException {
		// TODO Auto-generated method stub


		PlayerState[] plrstate = PlayerState.values();
		Names[] names = Names.values();

		Random random = new Random(System.currentTimeMillis());


		for (int i=0; i<10; i++) {
			players.put(i,new Players(names[i].toString(), plrstate[random.nextInt(3)].toString()));
		}

		// print all players in team
		for (int i = 0; i < players.size(); i++) {
			System.out.println(players.get(i));
		}

		// play and leader said
		try {
			for (int i = 0; i < players.size(); i++) {
				
				boolean leadersay = random.nextBoolean();
				
				if (leadersay) {

					System.out.println("Leader said  NOT HIDE on step " + i);
					if (players.get(i).getPlayerState().toString() == PlayerState.NOTHIDE.toString()) {
						loosers.add(players.get(i));
						System.out.println("Our loosers  " + loosers.size());
					} else {
						continue;
					}

				} else {
					System.out.println("Leader silently check player on step " + i);
					if (players.get(i).getPlayerState() == PlayerState.HIDE.toString()) {
						winners.add(players.get(i));
						System.out.println("Our winner  " + winners.size());
					} else if (players.get(i).getPlayerState() == PlayerState.NOTHIDE.toString()) {
						loosers.add(players.get(i));
						System.out.println("Our loosers  " + loosers.size());
					} else {
						throw new MiJeDogovarivalisDomaNePryatatsaException(
								"It is not honest to go home Mr. " + players.get(i).getNames());
					}
				}

			}

		} catch (MiJeDogovarivalisDomaNePryatatsaException e) {
			//System.err.print(e);
			System.out.println(e);
		}

			// print all winners in team
			System.out.println("we have " + winners.size() + " winners ");
			for (int i = 0; i < winners.size(); i++) {
				System.out.println("Our winner  " + winners.get(i));
			}

			
			// print all loosers in team
			System.out.println("we have " + loosers.size() + " loosers ");
			for (int i = 0; i < loosers.size(); i++) {
				System.out.println("Our loosers  " + loosers.get(i));
			}

	}

}
