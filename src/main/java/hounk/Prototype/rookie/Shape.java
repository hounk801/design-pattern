package hounk.Prototype.rookie;

import lombok.Getter;
import lombok.Setter;

/**
 * @Description 原型模式
 * @Author naikuo
 * @Date 2019/9/28 1:24 PM
 */
@Getter
@Setter
public abstract class Shape implements Cloneable{

    String id;

    String type;

    @Override
    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
