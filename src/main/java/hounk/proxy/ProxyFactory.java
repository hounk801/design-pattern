package hounk.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Classname ProxyFactory
 * @Description TODO
 * @DATE 2019/12/12 0:03
 * @Created by Administrator
 */
public class ProxyFactory {

    /**
     * JDK动态代理模式下，代理对象的数据类型应该由监控行为来描述
     * 参数：Class文件，监控类
     */
    public static BaseService builder(Class classFile) throws IllegalAccessException, InstantiationException {
        //1.创建被监控实例对象
        BaseService obj = (BaseService) classFile.newInstance();

        //2.创建通知对象
        InvocationHandler invaction = new Invaction(obj);

        //3.向JVM申请负责监控obj对象指定行为的监控对象（代理对象）
        /**
         * loader:被监控对象隶属的类文件在内存中的真实地址
         * interface：被监控对象隶属的类文件实现接口   哪些行为被监控
         * h；监控对象发现小明要执行被监控行为，应该由哪一个通知对象进行辅助
         */
        BaseService $proxy = (BaseService) Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), invaction);
        return $proxy;
    }
}
