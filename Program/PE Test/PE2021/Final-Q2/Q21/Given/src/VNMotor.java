
public class VNMotor extends Motor{
    private String series;
                  //String brandName,String series,double price
    public VNMotor() {
    }
    public VNMotor(String brandName,String series,double price) {
        super(brandName, price);
        this.series = series;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }
    
    public double getSalePrice(){
        if(super.getPrice() < 3000){
            return 0.95 * super.getPrice(); // giam 5% neu gia tri duoi 3000
        }else{
            return 0.9 * super.getPrice(); // giam 10% neu gia tri tren 3000
        }
    }

    @Override
    public String toString() {
        return super.getBrandName() + "\t" + series + "\t" + super.getPrice();
    }
    
    
    
}
