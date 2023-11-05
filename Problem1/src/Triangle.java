public class Triangle implements Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
        this.sideA = 1.0; // Default side lengths
        this.sideB = 1.0;
        this.sideC = 1.0;
    }

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
}
