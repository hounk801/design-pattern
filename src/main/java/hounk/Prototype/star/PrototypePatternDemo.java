package hounk.Prototype.star;

/**
 * @Description TODO
 * @Author naikuo
 * @Date 2019/9/28 11:53 AM
 */
public class PrototypePatternDemo {

    public static void main(String[] args) throws CloneNotSupportedException {
        Monkey monkey = new Monkey();
        monkey.setName("猴哥一号");
        monkey.setAge(18);

        ExtraSkill extraSkill = new ExtraSkill();
        extraSkill.setWidth(9200);
        extraSkill.setHeight(19200);

        monkey.setExtraSkill(extraSkill);

        System.out.println("---克隆----");
        for (int i = 0; i < 5; i++) {
            Monkey colne = monkey.clone();
            colne.setAge(colne.getAge() + i);
            colne.setName(colne.getName() + i);

            colne.getExtraSkill().setWidth(colne.getExtraSkill().getWidth() + i * 100);
            colne.getExtraSkill().setHeight(colne.getExtraSkill().getHeight() + i * 100);

            System.out.println(colne.getExtraSkill());
            System.out.println();

            colne.message();
            System.out.println();

        }
        System.out.println("---猴哥一号-----");
        System.out.println(monkey.getExtraSkill());
        monkey.message();
    }
}
