
public class MyHouse implements House {
    private int price ;
    private String address ;

    public MyHouse() {
    }

    public MyHouse(int price, String address) {
        this.price = price;
        this.address = address;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    

    @Override
    public double getPricetoUSD() {
        return (double) price/23000;

    }

    @Override
    public String getCode() {
        //check trong address co chua so hay ca chu va so
        boolean check =true ;
        for (int i = 0; i < address.length(); i++) {
            if(Character.isDigit(address.charAt(i))==false) {// neu address truyen vao khong phai la so thi tra ve false
                check = false;
                
            }
            
        }
        if (check == true) { // neu vong for tra ve true thi tra ve 3 ki tu dau tien
            return address.substring(0, 3) ;
        }
        else { // tra ve false thi tra ve 3 ki tu cuoi
            return address.substring(address.length()-3) ;
        }

    }

}
