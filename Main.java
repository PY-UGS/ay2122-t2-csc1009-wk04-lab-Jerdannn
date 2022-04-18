package CSC1009_Lab.Lab_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Question 1: BMI");
        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();
        System.out.print("Enter height in pounds: ");
        double inches = input.nextDouble();

        BMI b = new BMI(pounds, inches);
        System.out.println("BMI is " + b.getBMI());
        System.out.println(b.bmiStatus(b.getBMI()));

        System.out.println("Question 2: Stack");
        Stack stack = new Stack();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }

        input.close();
    }
}
