package q1;

import java.util.jar.Attributes.Name;

public class Candy extends DessertItem {

    private double price ;
    private double weight ;

    
//String name, double price, double weight
    public Candy() {
    }

    public Candy(String name, double price, double weight) {
        super(name);
        this.price = price;
        this.weight = weight;
    }
   
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + weight + "\t" + price ;
        
    }
    
    
    
}
