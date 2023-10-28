package cau2;

public class SpecCape extends Cape {
    private int type ;
    
    public SpecCape() {

    }

 
// Thay thế 2 kí tự cuối của Tailor = "XYZ"
    public SpecCape(String tailor, int color, int type) {
        super(tailor, color);
        this.type = type;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "," + this.type;
    }
    public void setData() {
        int n = super.getTailor().length();
        super.setTailor(getTailor().substring(0, n-2) + "XYZ");
    }
    // Kiểm tra nếu tailor bắt đầu với 0->9 trả về color +11 còn không thì trả về color+4
    public int getValue() {
        if ("0123456789".contains(super.getTailor().substring(0, 1))) {
            return super.getColor() + 11 ;
        }
        return super.getColor()+4 ;
    }
    
}
