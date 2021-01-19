public class Square extends Rectangle {
    Square(){
        super();
    }
    Square(double side){
        super(side,side);
    }
    Square(double side,String color,boolean filled){
        super(side,side,color,filled);
    }
    public double getSide(){
        return super.getLength();
    }
    public void setSide(double side){
        super.setLength(side);
        setWidth(side);
    }

    public void setLength(double length) {
        super.setLength(length);
    }

    public void setWidth(double width) {
        super.setWidth(width);
    }

    public String toString() {
        return "A square of side"+getSide();
    }

}
