package bmicalculator;

import java.util.Scanner;

public class BIMCalculator {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("If weight is in kg");
        double wt=sc.nextDouble();
        double ht=sc.nextDouble();

        double weight = 40; // (kilogram)
      //  double height = 1.7; //(meters)
      // double height =5.2 ;//feet;

       // double heigh = height * 0.3048;
      //  double bmi = weight / (height * height);


        double height =64 ;//cm
        double heightInMeter=height/100;
        double bmi = weight / (height * height);


        //  formula=weight/height*height;
       // double bmi = weight / (height * height);
  //  double bmi=24.9;

        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi < 24.9) {
            System.out.println("Categ" +
                    "ory: Normal weight");
        } else if (bmi < 29.9) {
            System.out.println("Category: Overweight");
        } else {
            System.out.println("Category: Obese");
        }

         System.out.println("Your BMI is: " + bmi);

    }
}
