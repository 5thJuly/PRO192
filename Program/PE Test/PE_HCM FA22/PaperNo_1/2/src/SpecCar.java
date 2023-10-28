
public class SpecCar  extends Car{
    private int warranty;

    public SpecCar() {
    }


    public SpecCar( String name, double price, int warranty ) {
        super(name, price);
        this.warranty = warranty;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return  super.toString()+","+ warranty ;
    }
 
}

