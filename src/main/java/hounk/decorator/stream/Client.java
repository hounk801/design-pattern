package hounk.decorator.stream;

import java.io.*;

/**
 * @Description TODO
 * @Author naikuo
 * @Date 2020/2/10 11:42 AM
 */
public class Client {

    public static void main(String[] args) throws IOException {
        DataOutputStream dout = new DataOutputStream(new BufferedOutputStream(new EntryptOutputStream(new FileOutputStream("/Users/naikuo/projects/design-pattern/MyEntrypt.txt"))));
        dout.write("abcdxyz".getBytes());
        dout.close();
    }
}
