package ru.mera.grishina.task10;

import java.io.FileInputStream;
import java.io.IOException;

public class Read implements Runnable {
    Thread stream1;
    String title;
    String fileDir;
    String line;

    Read(String title, String fileDir){
        stream1 = new Thread(this, title);
        this.title = title;
        this.fileDir = fileDir;
        this.line = "bla-bla-bla";
        stream1.start();
    }

    synchronized public void readStringFromFile(){
        try{
            int i;
            FileInputStream file1;
            file1 = new FileInputStream(fileDir);
            do{
                i = file1.read();
                if (i != -1) {
                    line += (char)i;
                }
            } while (i != -1);
        } catch(IOException exc){
            System.out.println("Error reading from file.");
        }
    }

    @Override
    public void run() {
        this.readStringFromFile();
    }
}