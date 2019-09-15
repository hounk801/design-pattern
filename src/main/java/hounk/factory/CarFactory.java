package hounk.factory;

/**
 * @Classname CarFactory
 * @Description TODO
 * @DATE 2019/9/15 17:08
 * @Created by hounk
 */
public abstract class CarFactory {

    /**
     * 轮胎
     * @return
     */
    public abstract Tyre createTyre();

    /**
     * 发动机
     * @return
     */
    public abstract Motor createMotor();

    /**
     * 制动器
     * @return
     */
    public abstract Brake createBrake();
}
