package hounk.factory;

/**
 * @Classname X5CarFactory
 * @Description TODO
 * @DATE 2019/9/15 17:13
 * @Created by hounk
 */
public class X5CarFactory extends CarFactory {
    @Override
    public Tyre createTyre() {
        return new CommonTyre();
    }

    @Override
    public Motor createMotor() {
        return new CommonMotor();
    }

    @Override
    public Brake createBrake() {
        return new CommonBrake();
    }
}
