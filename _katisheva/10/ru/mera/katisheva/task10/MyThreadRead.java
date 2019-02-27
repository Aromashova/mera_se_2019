package ru.mera.katisheva.task10;

import java.io.FileInputStream;
import java.io.IOException;

public class MyThreadRead implements Runnable {
    Thread thread;
    String threadName;
    String filePath;
    String str;

    MyThreadRead(String threadName, String filePath){

        thread = new Thread(this, threadName);
        this.threadName = threadName;
        this.filePath = filePath;
        this.str = "";
        thread.start();
    }

    synchronized public void readStringFromFile(){

        try {
            int i;
            FileInputStream fin;
            fin = new FileInputStream(filePath);

            do {

                i = fin.read();
                //System.out.println(threadName+" is reading "+((char)i));
                /*try{
                    Thread.sleep(10);
                }
                catch(InterruptedException exc){
                    System.out.println("Main thread interrupted.");
                }*/
                if (i != -1) {
                    str += (char)i;
                    //System.out.println(threadName+" is creating string: "+str);
                    /*try{
                        Thread.sleep(10);
                    }
                    catch(InterruptedException exc){
                        System.out.println("Main thread interrupted.");
                    }*/
                }
            } while (i != -1);
        }
        catch(IOException exc){
            System.out.println("Error reading from file. "+exc);

        }
    }

    @Override
    public void run() {
        //System.out.println(threadName+" starting.");
        this.readStringFromFile();
        //System.out.println(threadName+" terminating.");
    }
}
