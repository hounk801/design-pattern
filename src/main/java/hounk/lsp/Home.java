package hounk.lsp;

import java.util.HashMap;

/**
 * @Description TODO
 * @Author naikuo
 * @Date 2020/1/6 10:27 PM
 */
public class Home {

    public static void main(String[] args) {

        Father f = new Father();
        HashMap map = new HashMap();
        f.say(map);

        Son son = new Son();
        HashMap sonmap= new HashMap();
        son.say(sonmap);
    }
}
