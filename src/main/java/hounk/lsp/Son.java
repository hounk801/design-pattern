package hounk.lsp;

import java.util.Collection;
import java.util.Map;

/**
 * @Description TODO
 * @Author naikuo
 * @Date 2020/1/6 10:26 PM
 */
public class Son extends Father {

    public Collection say(Map map) {
        System.out.println("子类");
        return map.values();
    }
}
