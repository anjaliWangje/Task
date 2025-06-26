package CurrencyConverter;

import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        double usd = 100;
        double rate = 0.925;// 1 usd=0.925 eur
        double eur = usd * rate;

        System.out.println(usd + " USD = " + eur + " EUR");
    }

}
class Currency{



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();
            sc.nextLine();

            System.out.print("From currency (USD, EUR, INR): ");
            String from = sc.nextLine().toUpperCase();

            System.out.print("To currency (USD, EUR, INR): ");
            String to = sc.nextLine().toUpperCase();

            double rate;
            String pair = from + "_" + to;

            switch (pair) {
                case "USD_EUR":
                    rate = 0.925;
                    break;

                case "EUR_USD":
                    rate = 0.456;
                    break;

                case "USD_INR":
                    rate = 83.0;
                    break;

                case "INR_USD":
                    rate = 0.0135;
                    break;

                case "EUR_INR":
                    rate = 89.5;
                    break;

                case "INR_EUR":
                    rate = 0.0112;
                    break;

                default:
                    System.out.println(" Currency conversion not supported.");
                    sc.close();
                    return;
            }

            double result = amount * rate;
            System.out.println("" + amount + " " + from + " = " + result + " " + to);

            sc.close();
        }
    }











