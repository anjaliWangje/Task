package stopwatch;

import java.util.Scanner;

public class watch {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Stopwatch is ready");
            System.out.print("Type 'start'  ");
            String input1 = scanner.nextLine().toLowerCase();

            long startTime = 0;
            long endTime = 0;

            if (input1.equals("start")) {
                startTime = System.currentTimeMillis();
                System.out.println("Stopwatch started...");

                System.out.print("Type 'stop' : ");
                String input2 = scanner.nextLine().toLowerCase();

                if (input2.equals("stop")) {
                    endTime = System.currentTimeMillis();
                    long Time = (endTime - startTime) / 1000;
                    System.out.println("Stopwatch stopped.");
                    System.out.println("Elapsed Time: " + Time + " seconds");
                } else {
                    System.out.println("Invalid input. Stopwatch not stopped.");
                }

            } else if (input1.equals("exit")) {
                System.out.println("bye!");}


            scanner.close();
        }

}
