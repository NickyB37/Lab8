import java.util.Arrays;
import java.util.Scanner;

public class GetToKnowYourClass {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int userInput = 0;
		int stuInfo = 0;
		int index = userInput;
		String[] student = { "amber", "byron", "carl", "danny", "earl", "fred", "greg", "Hanna", "isa", "james" };

		int[] age = { 19, 20, 21, 22, 23, 24, 25, 26, 27, 28 };

		String[] favoriteFood = { "pizza", "hotdogs", "chicken", "steak", "tacos", "cake", "ice cream", "fruit",
				"burgers", "salad" };
		String[] homeTown = { "detroit", "lansing", "grand rapids", "flint", "allen park", "Southfield", "livonia",
				"Westland", "bellville", "troy" };

		String response = "y";

		try {
			do {
				System.out.println("Which student would you like to know about 1-10?");
				userInput = scnr.nextInt();

				for (int j = 0; j < 1; j++) {
					index = userInput;

					if (userInput == 1 || userInput == 2 || userInput == 3 || userInput == 4 || userInput == 5
							|| userInput == 6 || userInput == 7 || userInput == 8 || userInput == 9
							|| userInput == 10) {

						System.out.println(student[index]);
					}
					System.out.println("What would you like to know press 1.age 2.favorite food 3.Hometown");
					stuInfo = scnr.nextInt();
					for (int i = 0; i < 1; i++) {
					}
					if (stuInfo == 1) {
						System.out.println(Arrays.toString(student) + "is" + age[index]);
					} else if (stuInfo == 2) {
						System.out.println(student + "favorite food is" + favoriteFood[index]);
					} else if (stuInfo == 3) {
						System.out.println(student + "is from" + homeTown[index]);
					} else {
						System.out.println("enter 1 ,2 ,3");
					}

					System.out.println("would you like to know more yes/no?");
					response = scnr.next();

				}
			} while (response.equalsIgnoreCase("y"));
		} catch (Exception e) {
			System.out.println("not a valid entry");
		}

	}
}