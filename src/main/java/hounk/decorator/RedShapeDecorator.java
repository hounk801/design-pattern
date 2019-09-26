package hounk.decorator;

/**
 * @Description TODO
 * @Author naikuo
 * @Date 2019/9/26 9:43 AM
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        setRedBorder(shape);
    }

    private void setRedBorder(Shape shape) {
        System.out.println("border color:red");
    }

}
