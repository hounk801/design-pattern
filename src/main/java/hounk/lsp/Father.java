package hounk.lsp;

import java.util.Collection;
import java.util.HashMap;

/**
 * @Description 里式替换原则
 * @Author naikuo
 * @Date 2020/1/6 10:25 PM
 */
public class Father {

    public Collection say(HashMap map) {
        System.out.println("父类");
        return map.values();
    }
}
