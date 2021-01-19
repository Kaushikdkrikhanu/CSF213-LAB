public class Rectangle extends Shape {
    private double width;
    private double length;

    Rectangle(){
        super();
        width = 1;
        length = 1;
    }

    Rectangle(double width,double length){
        super();
        this.width = width;
        this.length = length;
    }
    Rectangle(double width,double length,String color,boolean filled){
        super(color,filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return 2*(length+width);
    }

    public String toString() {
        return "A rectangle with length "+ length+" and width "+ width+super.toString();
    }
}
