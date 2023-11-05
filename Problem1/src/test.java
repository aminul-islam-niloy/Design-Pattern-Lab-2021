// Shape interface
interface Shape
 {
    double getArea();
}

// Circle class
class Circle implements Shape
 {
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

// Triangle class
class Triangle implements Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
        this.sideA = 1.0; // Default side lengths
        this.sideB = 1.0;
        this.sideC = 1.0;
    }

    public Triangle(double sideA, double sideB, double sideC) 
    {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() 
    {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
}

// Rectangle class
class Rectangle implements Shape 
{
    private double width;
    private double height;

    public Rectangle() {
        this.width = 2.0;      // Default width
        this.height = 1.5;    // Default height
    }

    public Rectangle(double width, double height)
     {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

// ShapeFactory class
class ShapeFactory
 {
    public static Shape createShape(String shapeType, double... parameters) {
        switch (shapeType.toLowerCase()) {
            case "circle":
                if (parameters.length == 1) {
                    return new Circle(parameters[0]);
                } else {
                    return new Circle();
                }
            case "triangle":
                if (parameters.length == 3) {
                    return new Triangle(parameters[0], parameters[1], parameters[2]);
                } else {
                    return new Triangle();
                }
            case "rectangle":
                if (parameters.length == 2) {
                    return new Rectangle(parameters[0], parameters[1]);
                } else {
                    return new Rectangle();
                }
            default:
                return null;
        }
    }
}


// public class Main {
//     public static void main(String[] args) {
//         Shape circle = ShapeFactory.createShape("circle", 3.0);
//         Shape triangle = ShapeFactory.createShape("triangle", 4.0, 5.0, 6.0);
//         Shape rectangle = ShapeFactory.createShape("rectangle", 2.0, 3.0);

//         System.out.println("Area of Circle: " + circle.getArea());
//         System.out.println("Area of Triangle: " + triangle.getArea());
//         System.out.println("Area of Rectangle: " + rectangle.getArea());
//     }
// }


