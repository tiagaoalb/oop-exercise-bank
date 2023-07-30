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

        System.out.print("Is there an initial deposit (y/n)?");
        String answerInput = sc.next();

        if (answerInput.equals("n")) {
            account.deposit(0);
        } else {
            System.out.print("Enter initial deposit value: ");
            account.deposit(sc.nextDouble());
        }

        System.out.println("Account data:");
        System.out.println(account);

        sc.close();
    }
}
