public class Rectangle extends Shape {

protected double length;
protected double width;

public Rectangle() {
    super();
    width =1.0;
    length = 1.0;
}


public Rectangle(double length, double width) {
    super();
    this.length = length;
    this.width = width;
}

public Rectangle(String color, boolean filled, double length, double width) {
    super(color, filled);
    this.length = length;
    this.width = width;
}

public double getLength() {
    return length;
}

public void setLength(double length) {
    this.length = length;
}

public double getWidth() {
    return width;
}

public void setWidth(double width) {
    this.width = width;
}

public double getArea() {
    return length * width;
}

@Override
public boolean equals(Object obj) {
    
    if( obj instanceof Rectangle){
        return (this.width == ((Rectangle)obj).width && this.length == ((Rectangle)obj).length && super.equals(obj));
    }
    return true;
}


public double getPerimeter() {
    return 2*(length +width);
}

// public String toString() {
//     return String.format("A Rectangle with width = %f and length = %f, which is a subclass of %s", width, length, super.toString());
// }

@Override
public String toString() {
    
    return super.toString() + " || " + " Width: " +width +  " || " + " Length: "+length ;
}



}