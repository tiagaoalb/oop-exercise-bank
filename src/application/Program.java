package application;

import entities.Account;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account account = new Account();

        System.out.print("Enter account number: ");
        account.setNumber(sc.nextInt());

        System.out.print("Enter account name: ");
        account.setHolder(sc.next());

        String answerInput;

        do {
            System.out.print("Is there an initial deposit (y/n)? ");
            answerInput = sc.next();

            if (!(answerInput.equals("n") || answerInput.equals("y"))) {
                System.out.println("Answer must be 'n' or 'y'. Please try again.");
            }
        } while (!(answerInput.equals("n") || answerInput.equals("y")));

        if (answerInput.equals("n")) {
            account.deposit(0);
        } else {
            System.out.print("Enter initial deposit value: ");
            account.deposit(sc.nextDouble());
        }

        System.out.println("Account data:");
        System.out.println(account);
        System.out.println();

        System.out.print("Enter a deposit value: ");
        account.deposit(sc.nextDouble());

        System.out.printf("Updated account data: %n" + account);
        System.out.println();
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        account.withdraw(sc.nextDouble());

        System.out.printf("Updated account data: %n" + account);

        sc.close();
    }
}
