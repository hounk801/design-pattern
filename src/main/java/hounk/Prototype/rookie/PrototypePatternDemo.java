package hounk.Prototype.rookie;

/**
 * @Description TODO
 * @Author naikuo
 * @Date 2019/9/28 1:28 PM
 */
public class PrototypePatternDemo {

    public static void main(String[] args) {

        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println(clonedShape.getType());

        Shape cloen = ShapeCache.getShape("2");
        System.out.println(cloen.getType());

        Shape shape = ShapeCache.getShape("3");
        System.out.println(shape.getType());
    }
}
