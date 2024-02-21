import java.util.Scanner;

class Rectangle {
    private float length;
    private float width;

    // Default constructor
    public Rectangle() {
        length = 0;
        width = 0;
    }

    // Parameterized constructor
    public Rectangle(float l, float w) {
        length = l;
        width = w;
    }

    // Function to set length
    public void setLength(float l) {
        length = l;
    }

    // Function to set width
    public void setWidth(float w) {
        width = w;
    }

    // Function to calculate perimeter
    public float calculatePerimeter() {
        return 2 * (length + width);
    }

    // Function to calculate area
    public float calculateArea() {
        return length * width;
    }

    // Function to check if two rectangles have the same area
    public int sameArea(Rectangle other) {
        if (this.calculateArea() == other.calculateArea())
            return 1;
        else
            return 0;
    }

    // Function to display area and perimeter
    public void display() {
        System.out.println("Length: " + length + ", Width: " + width);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}

public class Mare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get dimensions of rectangle 1 from user
        System.out.println("Enter length of rectangle 1:");
        float length1 = scanner.nextFloat();
        System.out.println("Enter width of rectangle 1:");
        float width1 = scanner.nextFloat();

        // Get dimensions of rectangle 2 from user
        System.out.println("Enter length of rectangle 2:");
        float length2 = scanner.nextFloat();
        System.out.println("Enter width of rectangle 2:");
        float width2 = scanner.nextFloat();

        // Create two rectangle objects
        Rectangle rect1 = new Rectangle(length1, width1);
        Rectangle rect2 = new Rectangle(length2, width2);

        // Display information about the rectangles
        System.out.println("Rectangle 1:");
        rect1.display();
        System.out.println();

        System.out.println("Rectangle 2:");
        rect2.display();
        System.out.println();

        // Check if the rectangles have the same area
        if (rect1.sameArea(rect2) == 1)
            System.out.println("Both rectangles have the same area.");
        else
            System.out.println("The rectangles don't have the same area.");

        scanner.close();
    }
}
