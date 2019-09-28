package hounk.Prototype.star;

/**
 * @Description TODO
 * @Author naikuo
 * @Date 2019/9/28 11:32 AM
 */
public class ExtraSkill implements Cloneable{

    private int width;

    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public ExtraSkill clone() throws CloneNotSupportedException {
        ExtraSkill clone = (ExtraSkill) super.clone();
        return clone;
    }
}
