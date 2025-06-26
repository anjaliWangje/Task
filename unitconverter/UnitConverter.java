package unitconverter;

import java.util.Scanner;

public class UnitConverter {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Choose type: length / temperature / weight");
            String type = sc.next().toLowerCase();

            System.out.print(" value: ");
            double value = sc.nextDouble();

            System.out.print("From unit: ");
            String from = sc.next().toLowerCase();

            System.out.print("To unit: ");
            String to = sc.next().toLowerCase();

            double result = 0;
// length
            if (type.equals("length")) {
                if (from.equals("meter") && to.equals("kilometer")) {
                    result = value / 1000;
                } else if (from.equals("kilometer") && to.equals("meter")) {
                    result = value * 1000;
                } else if (from.equals("mile") && to.equals("meter")) {
                    result = value * 1609.34;
                } else if (from.equals("meter") && to.equals("mile")) {
                    result = value / 1609.34;
                } else {
                    System.out.println("Unsupported length units.");
                    return;
                }
            }

            //   for temperature
            else if (type.equals("temperature")) {
                if (from.equals("celsius") && to.equals("fahrenheit")) {
                    result = (value * 9 / 5) + 32;
                } else if (from.equals("fahrenheit") && to.equals("celsius")) {
                    result = (value - 32) * 5 / 9;
                } else {
                    System.out.println("Unsupported temperature units.");
                    return;
                }
            }

            // for weight
            else if (type.equals("weight")) {
                if (from.equals("kilogram") && to.equals("gram")) {
                    result = value * 1000;
                } else if (from.equals("gram") && to.equals("kilogram")) {
                    result = value / 1000;
                } else if (from.equals("pound") && to.equals("kilogram")) {
                    result = value * 0.453592;
                } else if (from.equals("kilogram") && to.equals("pound")) {
                    result = value / 0.453592;
                } else {
                    System.out.println("Unsupported weight units.");
                    return;
                }
            }

            else {
                System.out.println("Invalid type entered.");
                return;
            }

            System.out.println("Converted value: " + result + " " + to);
        }
    }


