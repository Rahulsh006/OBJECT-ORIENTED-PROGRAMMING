import java.util.Scanner;

interface Shape {
    double area();
    double perimeter();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return (3.14 * radius * radius);
    }

    public double perimeter() {
        return (2 * 3.14 * radius);
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return (length * width);
    }

    public double perimeter() {
        return (2 * (length + width));
    }
}

public class InterfaceShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double result;

        do {
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Exit");
            System.out.print("Enter Selection: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Radius: ");
                    double radius = scanner.nextDouble();

                    Circle circle = new Circle(radius);
                    result = circle.area();
                    System.out.println("Area of the circle: " + result);

                    result = circle.perimeter();
                    System.out.println("Perimeter of the circle: " + result);
                    break;

                case 2:
                    System.out.print("Enter Length: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter Width: ");
                    double width = scanner.nextDouble();

                    Rectangle rectangle = new Rectangle(length, width);
                    result = rectangle.area();
                    System.out.println("Area of the rectangle: " + result);

                    result = rectangle.perimeter();
                    System.out.println("Perimeter of the rectangle: " + result);
                    break;

                case 3:
                    System.out.println("Exiting...!");
                    break;

                default:
                    System.out.println("Invalid choice!");
                    break;
            }

            System.out.println();
        } while (choice != 3);

        scanner.close();
    }
}
