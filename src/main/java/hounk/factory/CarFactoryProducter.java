package hounk.factory;

/**
 * @Classname FactoryProductor
 * @Description TODO
 * @DATE 2019/9/15 17:24
 * @Created by hounk
 */
public class CarFactoryProducter {
    public static CarFactory getCarFatory(String type){
        if("X5".equals(type)){
            return new X5CarFactory();
        }else {
            return new X7CarFactory();
        }
    }
}
