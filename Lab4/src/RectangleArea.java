import java.util.Scanner;

public class RectangleArea {
    private double length;
    private double width;
    private double area;

    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length and width of the rectangle:");
        length = scanner.nextDouble();
        width = scanner.nextDouble();
    }

    public void computeField() {
        area = length * width;
    }

    public void fieldDisplay() {
        System.out.println("Area of the rectangle is: " + area);
    }
}