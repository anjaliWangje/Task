package stopwatch;

import java.util.Scanner;

public class stopwatch {





        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            long startTime = 0;
            long endTime = 0;

           Thread stopwatchThread = new Thread(() -> {

                System.out.println("Stopwatch is ready. Type 'start' to begin and 'stop' to end.");
            });

            stopwatchThread.start();


            while (true) {
                System.out.print("Command (start/stop/exit): ");
                String input = scanner.nextLine().toLowerCase();

                if (input.equals("start")) {
                    startTime = System.currentTimeMillis();
                    System.out.println("Stopwatch started...");
                } else if (input.equals("stop")) {
                    endTime = System.currentTimeMillis();
                    long elapsedTime = (endTime - startTime) / 1000;
                    System.out.println(" Stopwatch stopped.");
                    System.out.println("Elapsed Time: " + elapsedTime + " seconds");
                } else if (input.equals("exit")) {
                    System.out.println("bye!");
                    break;
                } else {
                    System.out.println("Invalid command. Please type start, stop, or exit.");
                }
            }

            scanner.close();
        }
    }
















