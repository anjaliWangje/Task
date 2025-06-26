package calculator;

import java.util.Scanner;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        int result = 0;
        boolean valid = true;

        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                } else {
                    System.out.println(" Cannot divide by zero.");
                    valid = false;
                }
                break;
            default:
                System.out.println(" Invalid operator.");
                valid = false;
        }

        if (valid) {
            System.out.println(" Output: " + result);
        }

        sc.close();
    }
}
