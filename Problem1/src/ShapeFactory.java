class ShapeFactory {
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