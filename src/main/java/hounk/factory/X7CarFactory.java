package hounk.factory;

/**
 * @Classname X7CarFactory
 * @Description TODO
 * @DATE 2019/9/15 17:22
 * @Created by Administrator
 */
public class X7CarFactory extends CarFactory {
    @Override
    public Tyre createTyre() {
        return new GreateTyre();
    }

    @Override
    public Motor createMotor() {
        return new GreateMotor();
    }

    @Override
    public Brake createBrake() {
        return new GreateBrake();
    }
}
