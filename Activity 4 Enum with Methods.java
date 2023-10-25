public class ShapeCalculator {

    public enum Shape {
        CIRCLE(1.0), SQUARE(2.0), TRIANGLE(3.0);

        private double value;
        Shape(double value) {
            this.value = value;
        }

        public double calculateArea() {
            switch (this) {
                case CIRCLE:
                    return Math.PI * Math.pow(value, 2);
                case SQUARE:
                    return Math.pow(value, 2);
                case TRIANGLE:
                    return (Math.sqrt(3) / 4) * Math.pow(value, 2);
                default:
                    return 0.0;
            }
        }

        public double calculatePerimeter() {
            switch (this) {
                case CIRCLE:
                    return 2 * Math.PI * value;
                case SQUARE:
                    return 4 * value;
                case TRIANGLE:
                    return 3 * value;
                default:
                    return 0.0;
            }
        }
    }

    public static void main(String[] args) {
        for (Shape shape : Shape.values()) {
            System.out.println("Shape: " + shape);
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            System.out.println();
        }
    }
}

