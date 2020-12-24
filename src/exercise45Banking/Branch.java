package exercise45Banking;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Costumer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Costumer>();
    }

    public String getName() {
        return name;
    }


    public ArrayList<Costumer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, Double transactions) {

        if (findCustomer(name) >= 0) {
            System.out.println(name + " already exists!");
            return false;
        }
        customers.add(new Costumer(name, transactions));
        System.out.println(name + " added to customer list!");
        return true;
    }

    public boolean addCustomerTransaction(String name, Double transactions){
        int findElement = findCustomer(name);
        if (findElement < 0) {
            System.out.println(name + " dosn't exist!");
            return false;
        }
        System.out.println("total before: " + customers.get(findElement).getTransactions());
    this.customers.set(findElement, customers.get(findElement)).addtransactions(transactions);
        System.out.println("total after: " + customers.get(findElement).getTransactions());

return true;

    }

    //Find customer index
    private int findCustomer(Costumer customer) {
        return this.customers.indexOf(customer);
    }

    //Find customer name and compare with argument
    private int findCustomer(String customerName) {
        for (int i = 0; i < this.customers.size(); i++) {
            Costumer costumer = this.customers.get(i);
            if (costumer.getName().equals(customerName)) {
                return i;
            }
        }
        return -1;
    }
}
