package hounk.proxy;

/**
 * @Classname TestMain
 * @Description TODO
 * @DATE 2019/12/12 0:18
 * @Created by Administrator
 */
public class TestMain {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        BaseService people = ProxyFactory.builder(People.class);
        people.eat();//   ר�Ÿ�����people�Ĵ������
        people.wc();
    }
}
