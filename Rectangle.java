public class Rectangle {
    public double length;
    public double width;

    // first constructor of default

    public Rectangle() {
        length = 1;
        width = 1;
    }

    // second constructor
    public Rectangle(double length, double width) throws NegativeValueException {
        if (length < 0 || width < 0) {
            throw new NegativeValueException("Length and width must be non-negative.");
        }
        this.length = length;
        this.width = width;
    }

    public void setDimensions(double length, double width) throws NegativeValueException {
        if (length < 0 || width < 0) {
            throw new NegativeValueException("Length and width must be non-negative.");
        }
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }
    public static void main(String[] args) {
        try {
            Rectangle rectangle1 = new Rectangle(1,5);
            System.out.println("Rectangle 1 - Area: " + rectangle1.getArea() + ", Perimeter: " + rectangle1.getPerimeter());

            Rectangle rectangle2 = new Rectangle(5, 10);
            System.out.println("Rectangle 2 - Area: " + rectangle2.getArea() + ", Perimeter: " + rectangle2.getPerimeter());

            rectangle2.setDimensions(8, 12);
            System.out.println("Updated Rectangle 2 - Area: " + rectangle2.getArea() + ", Perimeter: " + rectangle2.getPerimeter());

            rectangle2.setDimensions(-2, 6); // This will throw NegativeValueException
        } catch (NegativeValueException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
