package hounk.decorator.stream;

import java.io.IOException;
import java.io.OutputStream;

/**
 * @Description TODO
 * @Author naikuo
 * @Date 2020/2/10 11:40 AM
 */
public class EntryptOutputStream extends OutputStream {

    private OutputStream os = null;

    public EntryptOutputStream(OutputStream os) {
        this.os = os;
    }

    @Override
    public void write(int a) throws IOException {
        a = a + 2;
        if (a > (97 + 26)) {
            a = a - 26;
        }
        this.os.write(a);
    }
}
