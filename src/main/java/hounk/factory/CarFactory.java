package hounk.factory;

/**
 * @Classname CarFactory
 * @Description TODO
 * @DATE 2019/9/15 17:08
 * @Created by hounk
 */
public abstract class CarFactory {

    /**
     * ��̥
     * @return
     */
    public abstract Tyre createTyre();

    /**
     * ������
     * @return
     */
    public abstract Motor createMotor();

    /**
     * �ƶ���
     * @return
     */
    public abstract Brake createBrake();
}
