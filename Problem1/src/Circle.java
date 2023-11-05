// Circle class
class Circle implements Shape {
    private double radius;

    public Circle() {
        this.radius = 1.0; // Default radius
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}