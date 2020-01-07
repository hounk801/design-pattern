package hounk.proxy;

/**
 * @Classname People
 * @Description 接口实现类
 * @DATE 2019/12/11 23:37
 * @Created by Administrator
 */
public class People implements BaseService {
    @Override
    public void eat() {//主要业务，代理模式要求开发人员只关心主要业务
        System.out.println("吃饭");
    }

    @Override
    public void wc() {
        System.out.println("上厕所");
    }
}
