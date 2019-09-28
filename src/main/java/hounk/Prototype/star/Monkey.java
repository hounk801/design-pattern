package hounk.Prototype.star;

import lombok.Data;

/**
 * @Description TODO
 * @Author naikuo
 * @Date 2019/9/28 11:29 AM
 */
@Data
public class Monkey implements Cloneable {

    private Integer age;

    private String name;

    private ExtraSkill extraSkill;

    @Override
    public Monkey clone() throws CloneNotSupportedException {
        Monkey monkey = (Monkey) super.clone();
        monkey.extraSkill = this.extraSkill.clone();
        return monkey;
    }

    public void message() {
        System.out.println(this.getName() + "-" + this.getAge() + "- 金箍棒长度：" + this.getExtraSkill().getWidth());
    }
}
