public class Circle implements Shape{
    public static final double PI = Math.PI;

    public final double radius;

    // 생성자
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }
}
