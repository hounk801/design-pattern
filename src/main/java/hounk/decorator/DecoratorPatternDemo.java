package hounk.decorator;

/**
 * @Description TODO
 * @Author naikuo
 * @Date 2019/9/26 8:21 PM
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {

        Shape circle = new Circle();
        circle.draw();

        Shape rectangle = new Rectangle();
        rectangle.draw();

        RedShapeDecorator redShapeDecorator = new RedShapeDecorator(circle);

        redShapeDecorator.draw();

    }


}
