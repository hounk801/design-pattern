package hounk.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Classname Invaction
 * @Description ֪ͨ��
 * @DATE 2019/12/11 23:40
 * @Created by Administrator
 */
public class Invaction implements InvocationHandler {

    private BaseService obj;//���屻��ض���

    public Invaction(BaseService service) {
        this.obj = service;
    }

    /**
     * �ڱ������Ϊ��Ҫִ��ʱ���ᱻJVM����
     * �������Ϊ����Ϊʵ�ַ��ᱻ��Ϊ��������invoke
     * *****֪ͨJVM����������ط���������뵱ǰ��Ҫҵ�񷽷���ʵ��
     * <p>
     * ����������
     * С��.eat����//JVM����
     * eat������װΪMethod���Ͷ���
     * eat��������ʱ�������е�ʵ�η�װ��Object[]
     * ��������С���Ĵ��������Ϊinvoke�����ĵ�һ������
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //0.�ֲ�������������Ҫҵ�񷽷�ִ����ϵķ���ֵ
        Object value;
        //1.ȷ�ϵ�ǰ��������Ϊ
        String name = method.getName();
        //2.g���ݱ�������Ϊ��ͬ��������Ҫҵ��ʹ�Ҫҵ����ΰ�ִ��
        if ("eat".equals(name)) {
            wash();
            value = method.invoke(this.obj,args);
        }else{
            value = method.invoke(this.obj, args);
            wash();
        }
        return value;//�Żر����صķ������õĵط�
    }

    //��Ҫҵ��
    public void wash() {
        System.out.println("ϴ��");
    }
}
