package entities;

public class Account {

    protected int number;
    private String holder;
    private double balance;

    public Account() {
    }

    public Account(int number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
        balance = 0;
    }

    public String getName() {
        return holder;
    }

    public void setName(String holder) {
        this.holder = holder;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }
}
