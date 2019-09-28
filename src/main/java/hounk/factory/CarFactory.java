package hounk.factory;

/**
 * @Description 工厂模式
 * @DATE 2019/9/15 17:08
 * @Created by hounk
 */
public abstract class CarFactory {

    public abstract Tyre createTyre();

    public abstract Motor createMotor();

    public abstract Brake createBrake();
}
