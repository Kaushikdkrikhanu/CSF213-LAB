import java.util.Scanner;

public class AreaTester {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 for area of square\nEnter 2 for area of circle\nEnter 3 for area of rectangle");
        switch (scanner.nextInt()) {
            case 1:
                System.out.println("Enter side length");
                Area area = new Area();
                area.calc_Area(scanner.nextInt());
                area.display();
                break;
            case 2:
                System.out.println("Enter side radius");
                Area area1 = new Area();
                area1.calc_Area(scanner.nextFloat());
                area1.display();
                break;
            case 3:
                System.out.println("Enter length and breadth");
                Area area2 = new Area();
                area2.calc_Area(scanner.nextFloat(), scanner.nextFloat());
                area2.display();
        }


    }
}
