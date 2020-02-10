package hounk.decorator.shape;

/**
 * @Description TODO
 * @Author naikuo
 * @Date 2019/9/26 9:40 AM
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
