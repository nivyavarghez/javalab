interface Shape {
    double calculateArea();
}

// Triangle class implementing Shape interface
class Triangle implements Shape {
    private double base;
    private double height;

    // Constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Method to calculate area
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// Main class to test runtime polymorphism
public class Ishape {
    public static void main(String[] args) {
        // Creating instances of different shapes
        Shape triangle = new Triangle(5, 8);

        // Calculating area of the triangle
        double area = triangle.calculateArea();

        // Printing the area
        System.out.println("Area of the triangle: " + area);
    }
}
