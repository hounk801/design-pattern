package hounk.proxy;

/**
 * @Classname People
 * @Description �ӿ�ʵ����
 * @DATE 2019/12/11 23:37
 * @Created by Administrator
 */
public class People implements BaseService {
    @Override
    public void eat() {//��Ҫҵ�񣬴���ģʽҪ�󿪷���Աֻ������Ҫҵ��
        System.out.println("�Է�");
    }

    @Override
    public void wc() {
        System.out.println("�ϲ���");
    }
}
