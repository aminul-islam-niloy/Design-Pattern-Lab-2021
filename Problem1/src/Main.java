public class Main {
    public static void main(String[] args)
     {
        Shape circle = ShapeFactory.createShape("circle", 3.0);
        Shape triangle = ShapeFactory.createShape("triangle", 4.0, 5.0, 6.0);
        Shape rectangle = ShapeFactory.createShape("rectangle", 2.0, 3.0);

        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Area of Triangle: " + triangle.getArea());
        System.out.println("Area of Rectangle: " + rectangle.getArea());
    }
}