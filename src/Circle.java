public class Circle {
    private double pi = 3.14;
    private double radius;
    private double perimeter;

    public Circle() {

    }

    @Override
    public String toString() {
        return "Circle: " + "\n" +
                "Радиус = " + radius + "\n" +
                "Периметр = " + perimeter;

    }

    public Circle(double pi, double radius, double perimeter) {
        this.pi = pi;
        this.radius = radius;
        this.perimeter = perimeter;

    }
    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void Perimeter() {
        perimeter = pi * radius * radius;
    }

    public static void Square(double pi, double perimeter) {
        double square;
        square = 2 * pi * perimeter;
        System.out.println("Площадь круга = " + square);
    }
}
