public class Rectangle implements Shape 
{
    private double width;
    private double height;

    public Rectangle() 
    {
        this.width = 2.0; // Default width
        this.height = 1.5; // Default height
    }

    public Rectangle(double width, double height)
     {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea()
     {
        return width * height;
    }
}
