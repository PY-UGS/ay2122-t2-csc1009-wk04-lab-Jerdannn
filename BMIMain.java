package Lab_4;
import java.util.Scanner;

public class BMIMain {
    public static void main(String[] args) {
        System.out.println("Question 1.");
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double userPound = userInput.nextDouble();
        System.out.print("Enter height in inches: ");
        double userInches = userInput.nextDouble();

        //Creating an object from the BMI class
        BMI aBMI = new BMI(userPound, userInches);
        System.out.println("BMI is " + aBMI.calculateBMI());

        if (aBMI.calculateBMI() < 18.5) {
            System.out.println("Underweight");
        }
        else if (aBMI.calculateBMI() >= 18.5 && aBMI.calculateBMI() < 25.0) {
            System.out.println("Normal");
        }
        else if (aBMI.calculateBMI() >= 25.0 && aBMI.calculateBMI() < 30.0) {
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }
        
        //Close the scanner after
        userInput.close();
    }
}
