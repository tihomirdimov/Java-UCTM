package Java01.exercise02;

public class task02Rectangle {
    public static class testRectangle{
        public static void main(String[] args){
            Rectangle rectangle1 = new Rectangle(3.51, 5.44);
            Rectangle rectangle2 = new Rectangle(3, 4);
            System.out.printf("Rectangle 1 | Side a: %.2f | Side b: %.2f | Perimeter: %.2f | Area: %.2f %n",
                    rectangle1.sideA,
                    rectangle1.sideB,
                    rectangle1.getPerimeter(),
                    rectangle1.getArea());
            System.out.printf("Rectangle 2 | Side a: %.2f | Side b: %.2f | Perimeter: %.2f | Area: %.2f %n",
                    rectangle2.sideA,
                    rectangle2.sideB,
                    rectangle2.getPerimeter(),
                    rectangle2.getArea());
        }
    }
    public static class Rectangle{
        public double sideA;
        public double sideB;
        public Rectangle(double a, double b){
            sideA = a;
            sideB = b;
        }
        public double getPerimeter() {
            return (sideA+sideB)*2;
        }
        public double getArea() {
            return sideA*sideB;
        }
        public void Print() {
            System.out.printf("Rectangle 2 | Side a: %.2f | Side b: %.2f | Perimeter: %.2f | Area: %.2f %n",
                    sideA,
                    sideB,
                    getPerimeter(),
                    getArea());
        }
    }
}

