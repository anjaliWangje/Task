package bmicalculator;

import java.util.Scanner;

public class BMI {


        public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

            System.out.print("Enter your weight (in kg): ");
            double weight = sc.nextDouble();

            System.out.println("Select height input format:");
            System.out.println("1. Meters");
            System.out.println("2. Centimeters");
            System.out.println("3. Feet");
            System.out.println("4. Inch ");

            System.out.print("Enter choice (1/2/3/4): ");
            int choice = sc.nextInt();

            double heightInMeters = 0;

            switch (choice) {
                case 1:
                    System.out.print("Enter height in meters: ");
                    heightInMeters = sc.nextDouble();
                    break;

                case 2:
                    System.out.print("Enter height in centimeters: ");
                    double cm = sc.nextDouble();
                    heightInMeters = cm / 100;
                    break;


                case 3:
                    System.out.print("Enter height in feet: ");
                    double Feet = sc.nextDouble();
                    heightInMeters = Feet * 0.3048;
                    break;
                case 4:
                    System.out.print("Enter height in inches: ");
                    double Inches = sc.nextDouble();
                    heightInMeters = Inches * 0.0254;
                    break;
                default:
                    System.out.println("Invalid choice. Exiting...");
                    return;
            }

            double bmi = weight / (heightInMeters * heightInMeters);

            System.out.println("Your BMI is: " + bmi);

            if (bmi < 18.5) {
                System.out.println("Category: Underweight");
            } else if (bmi < 24.9) {
                System.out.println("Category: Normal weight");
            } else if (bmi < 29.9) {
                System.out.println("Category: Overweight");
            } else {
                System.out.println("Category: Obese");
            }

            sc.close();
        }
    }



