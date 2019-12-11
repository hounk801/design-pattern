package hounk.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Classname Invaction
 * @Description 通知类
 * @DATE 2019/12/11 23:40
 * @Created by Administrator
 */
public class Invaction implements InvocationHandler {

    private BaseService obj;//具体被监控对象

    public Invaction(BaseService service) {
        this.obj = service;
    }

    /**
     * 在被监控行为将要执行时，会被JVM拦截
     * 被监控行为和行为实现方会被作为参数输送invoke
     * *****通知JVM，这个被拦截方法是如何与当前次要业务方法绑定实现
     * <p>
     * 三个参数：
     * 小明.eat（）//JVM拦截
     * eat方法封装为Method类型对象
     * eat方法运行时接受所有的实参封装到Object[]
     * 将负责监控小明的代理对象作为invoke方法的第一个参数
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //0.局部变量，接受主要业务方法执行完毕的返回值
        Object value;
        //1.确认当前被拦截行为
        String name = method.getName();
        //2.g根据被拦截行为不同，决定主要业务和次要业务如何绑定执行
        if ("eat".equals(name)) {
            wash();
            value = method.invoke(this.obj,args);
        }else{
            value = method.invoke(this.obj, args);
            wash();
        }
        return value;//放回被拦截的方法调用的地方
    }

    //次要业务
    public void wash() {
        System.out.println("洗手");
    }
}
