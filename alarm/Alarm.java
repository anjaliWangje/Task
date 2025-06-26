package alarm;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Alarm {

            public static void main(String[] args) throws InterruptedException {
                Scanner sc = new Scanner(System.in);

                System.out.print(" Enter alarm time (HH:mm): ");
                String inputTime = sc.nextLine();

                System.out.print(" Enter alarm message (optional): ");
                String message = sc.nextLine();

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
                LocalTime alarmTime = LocalTime.parse(inputTime, formatter);

                System.out.println("Alarm set for: " + alarmTime);
                System.out.println(" Waiting for alarm...");
                while (true) {
                    LocalTime now = LocalTime.now();
                    if (now.getHour() == alarmTime.getHour() &&
                            now.getMinute() == alarmTime.getMinute()) {
                        System.out.println(" Alarm Time is " + now.format(formatter));
                        if (!message.isEmpty()) {
                            System.out.println(" Message: " + message);
                        }
                        break;

                    }
                    Thread.sleep(1000);
                }

                sc.close();
            }
        }



