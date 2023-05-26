public class EnumExample {
    public enum Shape {
        SQUARE(4), RECTANGLE(4), CIRCLE(0), TRAPEZOID(4),
        RHOMBUS(4), TRIANGLE(3), OVAL(0), HEXAGON(6);

        private final int sides;

        Shape(int sides) {
            this.sides = sides;
        }

        public int getSides() {
            return sides;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enumeration Constants and Values:");
        for (Shape shape : Shape.values()) {
            System.out.println(shape);
            System.out.println("Initial Value: " + shape.getSides());
            System.out.println("Ordinal Value: " + shape.ordinal());
            System.out.println();
        }
    }
} 