
public class Cement {
    private String label;
    private int type;

    public Cement() {
    }

    public Cement(String label, int type) {
        this.label = label;
        this.type = type;
    }

    public String getLabel() {
        return label.substring(0, 3).toLowerCase() /**/ + label.substring(3);
    //  chuyển các kí tự trong chuỗi thành chữ thường từ vt 0 đén 3    /**/    nối chuỗi sau những kí tự chữ thường
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    
}
