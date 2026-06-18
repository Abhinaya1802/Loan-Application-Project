package guessrandom;

import java.util.Scanner;

public class GuessRandomnum {
	static int levelChoose;
	static double score = 100;
	static double minusscore = 0;
	static Scanner sc = new Scanner(System.in);
	static String i = "null";

	public static void main(String[] args) {

		System.out.println("Choose The level Of the Game: ");
		System.out.println("(easy->1 to 100),(medium->1 to 500),(Hard->1 to 1000)");
		System.out.println("Enter '1' for easy");
		System.out.println("Enter '2' for medium");
		System.out.println("Enter '3' for hard");
		String choose = sc.next().toLowerCase();

		switch (choose) {
		case "1" -> {
			minusscore = 5;
			levelChoose = 100;
			guessTheRandomNumber(levelChoose);
		}
		case "2" -> {
			minusscore = 2.5;
			levelChoose = 500;
			guessTheRandomNumber(levelChoose);
		}
		case "3" -> {
			minusscore = 1.5;
			levelChoose = 1000;
			guessTheRandomNumber(levelChoose);
		}
		default -> System.out.println("Your choice is not available");
		}
	}

	static void guessTheRandomNumber(int levelChoose) {
		int count = 0;
		String s = "no";
		int random = (int) (Math.random() * levelChoose);
		do {
			System.out.println("Enter the number you guessed");
			int guess = sc.nextInt();

			if (guess < random) {
				System.out.println("The Number is too Low");
				count++;

			} else if (guess > random) {
				System.out.println("The Number is Too High");
				count++;
			} else {
				System.out.println("Your Guess is correct!! After " + count + " Attempts");
				s = "yes";
				break;
			}
			i = evenOddHint(count, random);
		} while ((s.equalsIgnoreCase("no")) && (i == "null"));

		double level = score - (count * minusscore);
		System.out.println("Your Score is : " + level);
		if (level >= 90 && level <= 100)
			System.out.println("MASTER PLAYER");
		else if (level >= 70 && level <= 89)
			System.out.println("EXCELLENT PLAYER");
		else if (level >= 50 && level <= 69)
			System.out.println("GOOD PLAYER");
		else if (level >= 30 && level <= 49)
			System.out.println("AVERAGE PLAYER");
		else
			System.out.println("BEGINNER");

	}

	static String evenOddHint(int count, int random) {
		String i = "null";
		if (count % 5 == 0) {
			System.out.println("Need any HINT....?????");
			String yno = sc.next();
			if (yno.equalsIgnoreCase("yes")) {

				switch (count) {
				case 5 -> {
					if (random % 2 == 0) {
						System.out.println("It's an Even Number...");
					} else {
						System.out.println("It's an Odd Number...");
					}
				}
				case 10 -> {
					factorHint(random);
				}
				case 15 -> {
					unitPlaceHint(random);
				}
				case 20 -> {
					randomNumberRangebet(random);
				}
				default -> {
					System.out.println("Your Hints Limit is Over");
					System.out.println(count);
				}
				}
			}
		}
		return i;
	}

	static void factorHint(int randomNumber) {
		for (int i = 3; i <= 20; i++) {
			if (randomNumber % i == 0) {
				System.out.println("It's Multiple of " + i);
				break;
			}
		}
	}

	static void unitPlaceHint(int random) {
		System.out.println("Unit's Place of Number is " + (random % 10));
	}

	static void randomNumberRangebet(int random) {
		int leftRange = random - 20;
		int rightRange = random + 20;
		System.out.println("The Number Lies Between " + leftRange + " and " + rightRange);
	}

}
