import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Output {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream("from java.txt", false));
        fos.write(66);
        fos.write(65);

        byte[] b = new byte[] {65,66,67,68};
        fos.write(b);
        fos.close();
    }
}
