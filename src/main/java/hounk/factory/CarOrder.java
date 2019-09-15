package hounk.factory;

/**
 * @Classname CarOrder
 * @Description TODO
 * @DATE 2019/9/15 17:30
 * @Created by hounk
 */
public class CarOrder {
    public static void main(String[] args) {
        CarFactory x5 = CarFactoryProducter.getCarFatory("X5");
        Brake brake = x5.createBrake();
        Motor motor = x5.createMotor();
        Tyre tyre = x5.createTyre();
        Car car = new Car(tyre, motor, brake);
    }
}
