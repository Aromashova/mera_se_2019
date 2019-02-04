import java.io.File;
import java.io.IOException;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.IO;

public class FileWork {

    public static void main(String[] args)  {
        // io
        // nio

      /*  File f = new File("sample.txt");
        boolean exists = f.exists();
        if (exists) {
            System.out.println("Существует");
        } else  {
            System.out.println("Нет файла");
            try {
                boolean newFile = f.createNewFile();
                System.out.println("Результат создания файла " + newFile);
            } catch (IOException e) {
                System.out.println("Нельзя сотворить файл!");
            }
        }*/

      try {
          createFile1();
          createFile2();
          createFile3();
          createFile4();
          createFile5();
          System.out.println("Файлы созданы");
      } catch (IOException e) {
          System.out.println("не удалось создать файл " + e);
      }

    }


    public static void createFile1() throws IOException {
        new File("sample1.txt").createNewFile();
    }
    public static void createFile2() throws IOException {
        new File("sample2.txt").createNewFile();
    }
    public static void createFile3() throws IOException {
        new File("sample3.txt").createNewFile();
    }
    public static void createFile4() throws IOException {
        new File("sample4.txt").createNewFile();
    }
    public static void createFile5() throws IOException {
        new File("sample5.txt").createNewFile();
    }
}
