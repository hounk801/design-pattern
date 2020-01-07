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
     * JDK��̬����ģʽ�£�����������������Ӧ���ɼ����Ϊ������
     * ������Class�ļ��������
     */
    public static BaseService builder(Class classFile) throws IllegalAccessException, InstantiationException {
        //1.���������ʵ������
        BaseService obj = (BaseService) classFile.newInstance();

        //2.����֪ͨ����
        InvocationHandler invaction = new Invaction(obj);

        //3.��JVM���븺����obj����ָ����Ϊ�ļ�ض��󣨴������
        /**
         * loader:����ض������������ļ����ڴ��е���ʵ��ַ
         * interface������ض������������ļ�ʵ�ֽӿ�   ��Щ��Ϊ�����
         * h����ض�����С��Ҫִ�б������Ϊ��Ӧ������һ��֪ͨ������и���
         */
        BaseService $proxy = (BaseService) Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), invaction);
        return $proxy;
    }
}
