import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IO {

    public static void main(String[] args) throws IOException {
        int read;
        FileInputStream is = new FileInputStream("somefile.txt");
        read = is.read();
        while (read != -1) {
            //   System.out.print(Character.toChars(read)[0]);
            read = is.read();
        }
        is.close();


        FileReader reader = new FileReader("somefile.txt");
        read = reader.read();
        while (read != -1) {
          //  System.out.print(Character.toChars(read) [0]);
            read = reader.read();
        }
        reader.close();


        byte[] buf = new byte[] {1,2,3,4};
        ByteArrayInputStream bis = new ByteArrayInputStream(buf);
        int read1 = bis.read();
        System.out.println(read1);
        read1 = bis.read();
        System.out.println(read1);

        BufferedInputStream bufstream = new BufferedInputStream(new FileInputStream("somefile.txt"));
        int read2 = bufstream.read();
        bufstream.available();

    }
}
