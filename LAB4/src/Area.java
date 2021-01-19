public class Area {
    private float side1;
    private float side2;
    private float area;

    public void display() {
        System.out.println(area);
    }

    public void calc_Area(int side1) {
        this.side1 = (float) side1;
        area = side1 * side1;
    }

    public void calc_Area(float side1) {
        this.side1 = side1;
        area = (float) (3.14 * side1 * side1);
    }

    public void calc_Area(float side1, float side2) {
        this.side1 = side1;
        this.side2 = side2;
        area = side1 * side2;
    }
}
