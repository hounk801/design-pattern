package hounk.Prototype.rookie;

/**
 * @Description TODO
 * @Author naikuo
 * @Date 2019/9/28 1:25 PM
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    public void draw(){
        System.out.println("Inside Rectangle::draw() method");
    }
}
