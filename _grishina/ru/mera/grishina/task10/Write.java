package ru.mera.grishina.task10;

import java.io.FileOutputStream;
import java.io.IOException;

public class Write implements Runnable {
    Thread stream2;
    String title;
    String fileDir;
    String line;

    Write(String title, String fileDir, String line){
        stream2 = new Thread(this, title);
        this.title = title;
        this.fileDir = fileDir;
        this.line = line;
        stream2.start();
    }

    synchronized public void writeStringToFile(){
        try{
            FileOutputStream file2;
            file2 = new FileOutputStream(fileDir);

            for (int i = 0; i < line.length(); i++){
                file2.write(line.charAt(i));
            }
            file2.close();
        } catch(IOException exc){
            System.out.println("Error writing to file.");
        }
    }

    @Override
    public void run(){
        this.writeStringToFile();
    }
}
