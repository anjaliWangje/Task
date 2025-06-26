package bankingsystem;

//public class BankingSystem {
//    public static void main(String[] args) {
//
//
//   double balance = 12000;
//
//
//    double depositAmount = 10000;
//        if (depositAmount > 0) {
//        balance += depositAmount;
//        System.out.println("Deposited: " + depositAmount);
//    }
//
//    double withdrawAmount = 4000;
//        if (withdrawAmount > 0 && withdrawAmount <= balance) {
//        balance -= withdrawAmount;
//        System.out.println("Withdrawal: " + withdrawAmount);
//    } else {
//        System.out.println("Invalid withdrawal.");
//    }
//        System.out.println("Final Balance: " + balance);
//}
//
//
//}
import java.util.Scanner;

class Account {
    double balance = 12000;

    public synchronized void withdraw(String name, double amount) {
        System.out.println(" " + name + " got access to withdraw.");

        if (amount <= balance) {
            System.out.println(name + " is withdrawing " + amount);
            balance -= amount;
            System.out.println(name + " withdrawal successful. Remaining: ₹" + balance);
        } else {
            System.out.println(name + " cannot withdraw " + amount + ". Not enough balance.");
        }

        System.out.println(" " + name + " has finished withdrawal");
    }

    public double getBalance() {
        return balance;
    }
}

class WithdrawTask extends Thread {
    Account account;
    String name;
    double amount;

    public WithdrawTask(Account account, String name, double amount) {
        this.account = account;
        this.name = name;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(name, amount);
    }
}

public class SimpleBanking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account acc = new Account();

        System.out.println("Initial Account Balance: " + acc.getBalance());

        System.out.print("Enter amount to withdraw (You - Passbook): ");
        double youAmount = scanner.nextDouble();

        System.out.print("Enter amount to withdraw (Brother - ATM): ");
        double brotherAmount = scanner.nextDouble();

        System.out.print("Enter amount to withdraw (Father - NetBanking): ");
        double fatherAmount = scanner.nextDouble();

        WithdrawTask you = new WithdrawTask(acc, "You (Passbook)", youAmount);
        WithdrawTask brother = new WithdrawTask(acc, "Brother (ATM)", brotherAmount);
        WithdrawTask father = new WithdrawTask(acc, "Father (NetBanking)", fatherAmount);

        you.start();
        brother.start();
        father.start();

        try {
            you.join();
            brother.join();
            father.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(" Final Account Balance: ₹" + acc.getBalance());

        scanner.close();
    }
}



