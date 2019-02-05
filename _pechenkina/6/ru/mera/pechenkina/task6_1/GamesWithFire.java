package ru.mera.pechenkina.task6_1;

import java.util.ArrayList;
import java.util.Random;

public class GamesWithFire {
    
	

	public enum Games {
		SNOWBALLS("Playing with snow in the winter"),
		SHIPSINSTREAMS("Launching ships along streams in Spring"),
		CATCHINGSUNBEAMS("Catching Sunbeams in Summer"),
		MEASUREPUDDLES("Measuring the depth of puddles using the boot method in Fall");
		
		
		private String description;

		private Games(String description) {
			this.description = description;
		}



		public String getDescription() {
			return description;
		}

	}
	

	public enum Season {
		WINTER("Playing with snow", Games.SNOWBALLS), 
		SPRING("Launching ships along streams", Games.SHIPSINSTREAMS), 
		SUMMER("Catching Sunbeams", Games.CATCHINGSUNBEAMS ), 
		FALL("Measuring the depth of puddles using the boot method", Games.MEASUREPUDDLES);

		private String description;
		private Games game;

		private Season(String description, Games game) {
		    this.description = description;
		    this.game = game;
		}

	    public String getDescription() {
	    	return description;
	    }
    }



	 public static void main(String[] args) {  
		 
		 Games[] game1 = Games.values();
		
/*		 for (Games game : Games.values()) {
			 System.out.println(game + ": " + game.getDescription());
			 
		 }
		
		 for (Season season : Season.values()) {
		      System.out.println(season + ": " + season.getDescription()); 
		     
		 }  */
		     
		 ArrayList <Person> command = new ArrayList<Person>();
		     
		  Person p1 = new Person("Billi",  Games.SNOWBALLS);
		  Person p2 = new Person("Villi",  Games.SHIPSINSTREAMS);
		  Person p3 = new Person("Mimmi",  Games.CATCHINGSUNBEAMS);
		  Person p4 = new Person("Filli",  Games.MEASUREPUDDLES);
		  command.add(p1);
		  command.add(p2);
		  command.add(p3);
		  command.add(p4);
		  
		  for (Person cmd : command) {
			  System.out.println("Command consists of " + cmd);
		  }
		  
		  Random random = new Random(System.currentTimeMillis());
		  int randomgame = random.nextInt(4);
		  int randomperson = random.nextInt(4);
		  
		System.out.println(
				"Let's check if " + command.get(randomperson).getName() + " could play game " + game1[randomgame]);

		if (command.get(randomperson).getGame() == game1[randomgame]) {
			System.out.println(
					"Our player " + command.get(randomperson).getName() + " win in the game " + game1[randomgame]);
		} else {
			System.out.println("Our player " + command.get(randomperson).getName() + " loooooooose in the game "
					+ game1[randomgame] + " because he only can play " + command.get(randomperson).getGame());
		}		  
		  

	 }
}

