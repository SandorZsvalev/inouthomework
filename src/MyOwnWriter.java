import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class MyOwnWriter extends Writer {

    private StringBuffer myBuffer;


    public MyOwnWriter() {
        myBuffer = new StringBuffer();
    }

    public void writeAllList (ArrayList <String> strings) {
        strings.forEach(str -> {
            try {
                write(str.toCharArray(),0,str.length());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
        if ((off < 0) || (off > cbuf.length) || (len < 0) ||
                ((off + len) > cbuf.length) || ((off + len) < 0)) {
            throw new IndexOutOfBoundsException();
        } else if (len == 0) {
            return;
        }
        myBuffer.append(cbuf, off, len);
    }


    @Override
    public void flush() throws IOException {

    }

    @Override
    public void close() throws IOException {
        myBuffer = null;
    }

    @Override
    public String toString() {
        return myBuffer.toString();
    }
}
