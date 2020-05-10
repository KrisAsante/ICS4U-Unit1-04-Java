/****************************************************************************
 *
 * Created by: Chris Asante
 * Date : April 2020
 * Created for : ICS4U
 * Calculates the time for the microwave to heat food
 *
 ****************************************************************************/
import java.util.Scanner;

public class SchoolMicrowave {
	
	public static void main(String[] args) {
		double time = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Are you heating a sub, pizza or soup?");
		String food = scanner.nextLine();
		System.out.println("How many " + food + " are you heating?");
		int number = scanner.nextInt();
		scanner.close();
		
		if(number == 1 && food.equals("sub")) {
			time = 60;
		}else if (number == 1 && food.equals("pizza")) {
			time = 45;
		}else if (number == 1 && food.equals("soup")) {
			time = 105;
		}else if(number == 2 && food.equals("sub")) {
			time = 60 * 1.5;
		}else if (number == 2 && food.equals("pizza")) {
			time = 45 * 1.5;
		}else if (number == 2 && food.equals("soup")) {
			time = 105 * 1.5;
		}else if(number == 3 && food.equals("sub")) {
			time = 60 * 2;
		}else if (number == 3 && food.equals("pizza")) {
			time = 45 * 2;
		}else if (number == 3 && food.equals("soup")) {
			time = 105 * 2;
		}
		
		//Checks if the number is greater than 3	
		if(number > 3) {
		    System.out.println("You can only fit 3 items in the microwave");
		}
		else {
			System.out.println("The total time is " + time + " seconds");
		}
			
	}

}