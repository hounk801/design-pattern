package hounk.factory;

/**
 * @Classname Car
 * @Description TODO
 * @DATE 2019/9/15 17:32
 * @Created by hounk
 */
public class Car {
    Tyre tyre;
    Motor motor;
    Brake brake;

    public Car(Tyre tyre, Motor motor, Brake brake) {
        this.brake = brake;
        this.motor = motor;
        this.tyre = tyre;
    }
}
