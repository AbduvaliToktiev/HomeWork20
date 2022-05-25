public class Main {
    public static void main(String[] args) {
    Circle circle = new Circle();
    circle.setRadius(10.5);
    circle.Perimeter();
        System.out.println(circle);
    Circle.Square(3.14, circle.getPerimeter());
    }
}
