
public class SComputer extends Computer {

    private String series ;

    public SComputer() {
    }

    public SComputer(String series, String name, String color, double price) {
        super(name, color, price);
        this.series = series;
    }

    public double getSalePrice() {
        //ket thuc series = A hoac a giam gia 5%
        if(series.endsWith("A")||series.endsWith("a")) { 
            // giam 5% => gia tri = 95%
            return 0.95 * super.getPrice();// phai dung super vi dang o lop con
        }
        //nguoc lai giam 1%
        else {
            return 0.99 * super.getPrice();
        }

    }
    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + series; 
    }

}
