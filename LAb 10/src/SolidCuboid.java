public class SolidCuboid extends Cuboid implements Solid3D{
    private double mass;
    private double density;
    public SolidCuboid(double length, double height, double breadth,double mass,double density) {
        super(length, height, breadth);
        this.mass = mass;
        this.density = density;

    }
    public SolidCuboid(double length, double height, double breadth,double mass) {
        super(length, height, breadth);
        this.mass = mass;
        density =1.0;
    }


    public double getDensity() {
        return density;
    }

    public double getMass() {
        return mass;
    }
}
