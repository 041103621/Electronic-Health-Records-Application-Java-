/**
File name: MyHealthDataTest.java
@author Liu Siqian, 041103621
Course: CST8284
Assignment: Assign01
Date: Feb 18, 2024
Professor: Zeinab Bayati
Purpose: Test program prompts for input of the patient’s data 
         and instantiate an object of the class MyHealthData 
         and prints the data from that object.
*/
import java.util.Scanner;
public class MyHealthDataTest {

	public static void main(String[] args) {
		
		String firstName;
	    String lastName;
		String gender;
		int birthYear;
		int currentYear = 2024;
		double height;
		double weight;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your first name: ");
		firstName = in.nextLine();
		System.out.print("Enter your last name: ");
		lastName = in.nextLine();
		System.out.print("Enter your gender: ");
		gender = in.nextLine();
		System.out.print("Enter your year of birth: ");
		birthYear = in.nextInt();
		in.nextLine();
		System.out.print("Enter your height(m): ");
		height = in.nextDouble();
		in.nextLine();
		System.out.print("Enter your weight(kg): ");
		weight = in.nextDouble();
		in.nextLine();
		
		MyHealthData healthdata1 = new MyHealthData(firstName, lastName, gender, height, weight, birthYear, currentYear);
		healthdata1.displayMyHealthData();

	}

}
