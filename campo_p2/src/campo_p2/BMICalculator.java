package campo_p2;
import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
			
			
			double weightInPounds;
			double heightInInches;
			double weightInKilograms;
			double heightInMeters;
			double BMI;
			int choose;
			
			System.out.println("Choose height and weight option: 1 (pounds and inches) or 2 (kilograms and meters)");
			choose = scnr.nextInt();
			
			switch(choose)
			{case 1:
				System.out.println("Enter your weight (pounds): ");
				weightInPounds = scnr.nextDouble();
				System.out.println("Enter your height (inches): ");
				heightInInches = scnr.nextDouble();
				
				BMI = (703 * weightInPounds) / (heightInInches * heightInInches);
				System.out.println("Your Body Mass Index: " + BMI);
				
				break;
			
				case 2:
					System.out.println("Enter your weight (kilograms): ");
					weightInKilograms = scnr.nextDouble();
					System.out.println("Enter your height (meters): ");
					heightInMeters = scnr.nextDouble();
					
					BMI = (703 * weightInKilograms) / (heightInMeters * heightInMeters);
					System.out.println("Your Body Mass Index: " + BMI);
			
					break;
	}
			
				System.out.println("BMI is less than 18.5 means: UnderWeight");
				
				System.out.println("BMI between 18.5 and 24.9 means: Healthy");
				
				System.out.println("BMI between 25 TO 29.9 means: Overweight");
				
				System.out.println("BMI greater than or equal to 30.0 means: obese");
				}
	
}
