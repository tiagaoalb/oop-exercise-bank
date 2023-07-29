package entities;

public class Account {

    protected int accountNumber;
    private String name;
    private double depositValue;

    public Account() {
    }

    public Account(int accountNumber, String name, double depositValue) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.depositValue = depositValue;
    }

    public Account(int accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
        depositValue = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
