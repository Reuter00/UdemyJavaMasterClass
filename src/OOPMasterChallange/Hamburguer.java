package OOPMasterChallange;

public class Hamburguer {
    private String name;
    private String breadRollType;
    private String meat;
    private String add1;
    private double add1Price;
    private String add2;
    private double add2Price;
    private String add3;
    private double add3Price;
    private String add4;
    private double add4Price;
    private double price;

    public Hamburguer(String name, String breadRollType, String meat, double price) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }

    public void add1toHam(String name, double price){
        this.add1 = name;
        this.add1Price = price;
    }

    public void add2toHam(String name, double price){
        this.add2 = name;
        this.add2Price = price;
    }
    public void add3toHam(String name, double price){
        this.add3 = name;
        this.add3Price = price;
    }
    public void add4toHam(String name, double price){
        this.add4 = name;
        this.add4Price = price;
    }


    public double generateHamburguer(){

        double totalPrice = this.price;

        System.out.println(this.name + " Hamburguer " + " on a " + this.breadRollType + " roll price is " + this.price);

        if (this.add1 != null)
        {
            totalPrice += this.add1Price;
            System.out.println("Added " + this.add1 + " for an extra " + this.add1Price);
        }

        if (this.add2 != null)
        {
            totalPrice += this.add2Price;
            System.out.println("Added " + this.add2 + " for an extra " + this.add2Price);
        }
        if (this.add3 != null)
        {
            totalPrice += this.add3Price;
            System.out.println("Added " + this.add3 + " for an extra " + this.add3Price);
        }  if (this.add4 != null)
        {
            totalPrice += this.add4Price;
            System.out.println("Added " + this.add4 + " for an extra " + this.add4Price);
        }


        return totalPrice;
    }
}



