// Create a Java program to demonstrate the use of inheritance, method overriding, and interfaces using the following requirements:

// 1. Create an abstract class Shape with:
// - An abstract method double calculateArea()
// - A concrete method void displayShape() that prints ""This is a shape.""

// 2.Create two classes, Circle and Rectangle, that extend the Shape class:
// - Circle should have a constructor that takes the radius as a parameter and override calculateArea() to return the area of the circle.
// - Rectangle should have a constructor that takes length and breadth as parameters and override calculateArea() to return the area of the rectangle.
// 3. Implement an interface Drawable with a method void draw(). Both Circle and Rectangle should implement this interface and override draw() to display a message indicating which shape is being drawn.
// 4. In the main method:
// - Create objects of Circle and Rectangle.
// - Call the calculateArea(), draw(), and displayShape() methods on these objects.

// Example Output:

// This is a shape.
// Drawing a Circle.
// Area of Circle: 78.5

// This is a shape.
// Drawing a Rectangle.
// Area of Rectangle: 50.0

abstract class Shape {
    abstract double calculateArea();

    void displayShape() {
        System.out.println("This is a shape.");
    }
}


interface Drawable {
    void draw();
}


class Circle extends Shape implements Drawable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle.");
    }
}


class Rectangle extends Shape implements Drawable {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double calculateArea() {
        return length * breadth;
    }


    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(10.0, 5.0);

     
        circle.displayShape();
        circle.draw();
        System.out.println("Area of Circle: " + circle.calculateArea());

        rectangle.displayShape();
        rectangle.draw();
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}
