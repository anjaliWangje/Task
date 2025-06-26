package passwordvalidator;

import java.util.Scanner;

//public class Passwordvalidator {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter your password: ");
//        String password = sc.nextLine();
//
//        boolean Uppercase = false;
//        boolean Lowercase = false;
//        boolean Digit = false;
//        String specialChars = "@#$%^&+=!";
//
//      //  boolean SpecialChar = false;
//
//        if (password.length() >= 8) {
//            for (char ch : password.toCharArray()) {
//                if (Character.isUpperCase(ch)) Uppercase = true;
//                else if (Character.isLowerCase(ch)) Lowercase = true;
//                else if (Character.isDigit(ch)) Digit = true;
//                               else if (specialChars.contains(String.valueOf(ch))) hasSpecialChar = true;
////                else if ("@#$%^&+=!".contains(String.valueOf(ch))) SpecialChar = true;
//            }
//
//            boolean SpecialChars;
//            if (Uppercase && Lowercase && Digit && SpecialChars) {
//                System.out.println(" Password is valid.");
//            } else {
//                System.out.println(" Password is not valid.");
//            }
//
//        } else {
//            System.out.println(" Password must be at least 8 characters long.");
//        }
//
//        sc.close();
//    }
//}
import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        String specialChars = "@#$%^&+=!";

        if (password.length() >= 8) {

            for (char ch : password.toCharArray()) {
                if (Character.isUpperCase(ch)) hasUppercase = true;
                else if (Character.isLowerCase(ch)) hasLowercase = true;
                else if (Character.isDigit(ch)) hasDigit = true;
                else if (specialChars.contains(String.valueOf(ch))) hasSpecialChar = true;
            }

            if (!hasUppercase) {
                System.out.println(" Must include at least one uppercase letter.");
            }
            if (!hasLowercase) {
                System.out.println(" Must include at least one lowercase letter.");
            }
            if (!hasDigit) {
                System.out.println(" Must include at least one digit.");
            }

            if (hasUppercase && hasLowercase && hasDigit) {
                System.out.println(" Password is VALID.");
                if (!hasSpecialChar) {
                    System.out.println(" Tip: Add a special character for better security.");
                }
            } else {
                System.out.println(" Password is NOT valid.");
            }

        } else {
            System.out.println(" Password must be at least 8 characters long.");
        }

        sc.close();
    }
}





 class Password{


         public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);

             System.out.print("Enter your password: ");
             String password = sc.nextLine();

             if (
                     password.length() >= 8 &&
                             password.matches(".*[A-Z].*") &&
                             password.matches(".*[a-z].*") &&
                             password.matches(".*\\d.*") &&
                             password.matches(".*[@#$%^&+=!].*")
             ) {
                 System.out.println(" Password is valid.");
             } else {
                 System.out.println(" Password is not valid.");
             }

             sc.close();
         }
     }

