
public class SpecCala extends Cala{
    private int color;

    public SpecCala() {
    }

    public SpecCala(int color, String owner, int price) {
        super(owner, price);
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "," + color; 
    }
    // thay the ki tu thu 2 bang 'XX'
    public void setData() {
        super.setOwner(owner.substring(0, 1) + owner.replace(owner.substring(0,2), "XX")) ;
        
        
    }
            
        
    
    public int getValue() {
        if(color % 2 == 1) {
            price = price + 3;
        }
        else {
            price = price + 7 ;
        }
        return price ;
    }

    
    
}
