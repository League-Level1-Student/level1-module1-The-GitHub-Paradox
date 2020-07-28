package _01_race_car;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */



public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
RaceCar C4 = new RaceCar("Race-C4-r", 5);
		// 1. Create a RaceCar and place it in 5th position
		// 2. Print the RaceCar's position in the race
C4.getPositionInRace();
		// 3. Crash the RaceCar
C4.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
C4.pit();
		// 5. Help the car move into first place.
C4.overtake();
C4.overtake();
C4.overtake();
C4.overtake();
C4.overtake();
C4.overtake();
C4.overtake();
	}
}
