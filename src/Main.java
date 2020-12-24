import exercise45Banking.Bank;
import exercise45Banking.Branch;
import exercise45Banking.Costumer;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Bank b1 = new Bank("Millenium");
        Branch br1 = new Branch("Activo banco");
        b1.addBranch(br1);
        b1.addBranch(br1);


        br1.newCustomer("Ricardo", 7.0);
        br1.newCustomer("Ricardo", 7.0);

        br1.addCustomerTransaction("Ricardo",50.0);
    }

}