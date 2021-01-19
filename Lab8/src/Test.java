public class Test {
    public static void main(String[] args) {
        Shape shape = new Shape("black",true);
        shape.setColor("silver");
        shape.setFilled(false);
        System.out.println(shape.getColor()+" "+shape.isFilled()+" "+shape.toString());
        Circle circle = new Circle(2,"White",true);
        System.out.println(circle.getArea()+" "+circle.getPerimeter()+" "+circle.toString());
        Rectangle rectangle = new Rectangle(3,4,"blue",true);
        System.out.println(rectangle.getArea()+" "+rectangle.getPerimeter()+" "+rectangle.toString());

    }
}
