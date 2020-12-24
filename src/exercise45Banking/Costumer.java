package exercise45Banking;

import java.util.ArrayList;

public class Costumer {
    private String name;
    private Double transactions;

    public Costumer(String name, Double transactions) {
        this.name = name;
        this.transactions = transactions;
    }

    public String getName() {
        return name;
    }

    public double getTransactions() {
        return transactions;
    }

    public void addtransactions(Double transactions){

        this.transactions = this.transactions + transactions;
    }
}
