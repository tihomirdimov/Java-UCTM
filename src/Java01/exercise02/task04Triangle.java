package Java01.exercise02;

public class task04Triangle {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(3, 1, 3);
        Triangle triangle2 = new Triangle(4, 1, 3);
        triangle1.GetPerimeter();
        triangle1.GetArea();
        triangle2.GetPerimeter();
        triangle2.GetArea();
    }

    public static class Triangle {
        private double sideA;
        private double sideB;
        private double sideC;

        public Triangle(double a, double b, double c) {
            sideA = a;
            sideB = b;
            sideC = c;
        }

        public boolean IfRealTriangle() {
            return ((sideA + sideB) > sideC && (sideA + sideC) > sideB && (sideB + sideC) > sideA);
        }

        public void GetPerimeter() {
            if (this.IfRealTriangle()) {
                double perimeter = sideA + sideB + sideC;
                System.out.printf("Perimeter of the triangle is %.2f %n", perimeter);
            } else {
                System.out.println("Perimeter cannot be calculated. Not a real triangle");
            }
        }

        public void GetArea() {
            if (this.IfRealTriangle()) {
                double semiPerimeter = (sideA + sideB + sideC) / 2;
                double area = Math.sqrt(
                        semiPerimeter *
                                (semiPerimeter - sideA) *
                                (semiPerimeter - sideB) *
                                (semiPerimeter - sideC));
                System.out.printf("Area of the triangle is %.2f %n", area);
            } else {
                System.out.println("Area cannot be calculated. Not a real triangle.");
            }
        }
    }
}
