package ru.mera.katisheva.task10;

import java.io.FileOutputStream;
import java.io.IOException;


public class MyThreadWrite implements Runnable {
    Thread thread;
    String threadName;
    String filePath;
    String str;

    MyThreadWrite(String threadName, String filePath, String str){
        thread = new Thread(this, threadName);
        this.threadName = threadName;
        this.filePath = filePath;
        this.str = str;
        thread.start();
    }

    synchronized public void writeStringToFile(){

        try {
            FileOutputStream fout;
            fout = new FileOutputStream(filePath);

            for (int j = 0; j < str.length(); j++) {
                fout.write(str.charAt(j));
                //System.out.println(threadName+" is writing "+str.charAt(j));
                /*try{
                    Thread.sleep(10);
                }
                catch(InterruptedException exc){
                    System.out.println("Main thread interrupted.");
                }*/
            }
            fout.close();
        }
        catch(IOException exc){
            System.out.println("Error writing to file. "+exc);
        }
    }

    @Override
    public void run() {
        //System.out.println(threadName+" starting.");
        this.writeStringToFile();
        //System.out.println(threadName+" terminating.");
    }
}
