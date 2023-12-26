package Java01.exercise02;

public class task01Circle {
    public static class TestCircle {
        public static void main(String[] args) {
            Circle c1 = new Circle(5.0);
            System.out.printf("The circle has radius of %.2f, area of %.2f and perimeter of %.2f %n",
                    c1.radius,
                    c1.getArea(),
                    c1.getPerimeter());
            Circle c2 = new Circle(2.0);
            System.out.printf("The circle has radius of %.2f, area of %.2f and perimeter of %.2f %n",
                    c2.radius,
                    c2.getArea(),
                    c2.getPerimeter());
        }
    }
    public static class Circle {
        public double radius;
        public Circle (double r){
            radius = r;
        }
        public double getPerimeter() {
            return Math.PI*2*radius;
        }
        public double getArea() {
            return Math.PI*Math.pow(radius,2);
        }
    }
}