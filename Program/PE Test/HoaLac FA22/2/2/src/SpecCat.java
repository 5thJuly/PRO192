
public class SpecCat extends Cat {
    private int noise;

    public SpecCat() {
    }

    public SpecCat(String area, int leg,  int noise) {
        super(area, leg);
        this.noise = noise;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + noise;
    }
    
    public void setData() {
        String area = super.getArea();
        super.setArea(area.substring(0, area.length()-1) + "BC" + area.substring(area.length() - 1));
    // tính chuỗi từ vị trí 0 đến vị trí trước vị trí cuối cùng || chèn BC vào chuỗi     
    }
    
    public int getValue() {
        if (super.getArea().charAt(1) == 'X')
        // kiểm tra kí tự thứ 2 của Area, nếu là X thì noise + 6 còn không thì noise + 6
            return noise + 9;
        
        else return noise + 6;
    }
    
}
