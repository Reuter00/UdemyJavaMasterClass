package exercise45Banking;


import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;


    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(Branch nameOfAddedBranch) {

        if (findBranch(nameOfAddedBranch.getName()) >= 0) {
            System.out.println("Branch already exists!");
            return false;
        }

        branches.add(nameOfAddedBranch);
        System.out.println("Branch " + nameOfAddedBranch + " added!");
        return true;

    }

    //Find branch index
    private int findBranch(Branch branch) {
        return this.branches.indexOf(branch);
    }
    //Find branch name and compare with argument
    private int findBranch(String branchName) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch branch = this.branches.get(i);
            if (branch.getName().equals(branchName)) {
                return i;
            }
        }
        return -1;
    }


}
