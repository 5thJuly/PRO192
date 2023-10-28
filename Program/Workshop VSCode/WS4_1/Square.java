public class Square extends Rectangle {      
    private double side;     
    
    public Square(String color, boolean filled, double width, double length) {         
        super(color, filled, width, length);       
    }
    
    public Square(double width, double length) {         
            super(width, length); 
        }      
    public Square(String color, boolean filled, double width, double length, double side) {         
        super(color, filled, width, length);         
        this.side = side;     
    }       
    public double getSide() {         
        return side;     
    }      
    public void setSide(double side) {         
        this.side = side;     
    }      
   
    @Override     
    
    public void setWidth(double width) {         
        super.setWidth(width); 
    }      
    @Override     
    public double getLength() {         
        return super.getLength();
    }      
    @Override     
    public void setLength(double length) {         
        super.setLength(length);
    }

    @Override
    public boolean equals(Object obj) {
        
        if( obj instanceof Square){
            return (this.side == ((Square)obj).side && super.equals(obj));
        }
        return false;
    }
    // public String toString() {
        
    //     return String.format("A Square with side = %f , which is a subclass of %s", getWidth(), super.toString());      
    
    // } 
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " || " + " Side: " + side;
    }
}
