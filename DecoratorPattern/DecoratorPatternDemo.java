package DecoratorPattern;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        Shape redCircle = new RedShapeDecorator(new Circle());
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        redRectangle.draw();
    }
}
