
public class Seller extends Employee {  
    private double revenue;
   
    public Seller() {
    }

    
    public Seller(String name,double revenue, double salary) {
        super(name, salary);
        this.revenue = revenue;
    }
    public double getSalary() {
        double total = 0;
        if (revenue <30000) {    
            total = super.getSalary() + 0.05*revenue ;
        }
        else {
            total = super.getSalary() + 0.1*revenue;
        }
        return total;

    }

    public double getRevenue() {
        return revenue;
    }


    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }


    @Override
    public String toString() {
        return super.getName() + "\t" + super.getSalary() + "\t" + revenue;
    }
    
    
    
}
