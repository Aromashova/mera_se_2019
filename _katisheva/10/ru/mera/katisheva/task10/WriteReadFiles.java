package ru.mera.katisheva.task10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class WriteReadFiles{

    ArrayList<String> list;
    ArrayList<String> stringsSequential;
    ArrayList<String> stringsParallel;
    long listSize =1000;
    ArrayList<MyThreadWrite> runnableObjectsWrite;
    ArrayList<MyThreadRead> runnableObjectsRead;
    String dirName = "strings_parallel";

    WriteReadFiles(){

        File dir = new File(dirName);
        dir.mkdir();

        list = new ArrayList<>();
        for(int i=0; i<listSize; i++){
            list.add(i,"String number: "+(i+1));
        }
        stringsParallel =  new ArrayList<>();
        stringsSequential =  new ArrayList<>();
        runnableObjectsWrite = new ArrayList<>();
        runnableObjectsRead = new ArrayList<>();
    }

    public void writeStringsToFilesInOneThread() throws IOException{

        String dirName = "strings_sequential";
        File dir = new File(dirName);
        dir.mkdir();

        long millisStart = System.currentTimeMillis();
        for(int i=0; i<listSize; i++){
            FileOutputStream fout;
            String file=dirName+"/"+(i+1)+".doc";
            fout = new FileOutputStream(file);
            for(int j=0; j<list.get(i).length(); j++) {
                fout.write(list.get(i).charAt(j));
            }
            fout.close();
        }
        long millisFinish = System.currentTimeMillis();
        System.out.println("1 thread: Strings have been written into folder '" + dirName+"'. Duration: "+(millisFinish-millisStart)+"millis");

    }


    public void readStringsFromFilesInOneThread() throws IOException{

        String dirName = "strings_sequential";
        long millisStart = System.currentTimeMillis();
        for(int k=0; k<listSize; k++) {
            FileInputStream fin;
            String tempString = "";
            String file=dirName+"/"+(k+1)+".doc";
            int i;

            fin = new FileInputStream(file);

            do {
                i = fin.read();
                if (i != -1) {
                    tempString += (char)i;
                }
            } while (i != -1);
            stringsSequential.add(tempString);
            fin.close();

        }
        long millisFinish = System.currentTimeMillis();
        System.out.println("1 thread: Strings have been read from folder '"+dirName+"'. Duration: "+(millisFinish-millisStart)+"millis");

    }


    public void writeStringsToFilesInDifferentThreads() throws InterruptedException{

        long millisStart = System.currentTimeMillis();
        for (int k = 0; k < listSize; k++) {
            String file=dirName+"/"+(k+1)+".doc";
            runnableObjectsWrite.add(k, new MyThreadWrite("Write Thread " + (k + 1),file,list.get(k)));
        }

        for(int k=0; k<listSize; k++){

            runnableObjectsWrite.get(k).thread.join();
            //System.out.println(runnableObjectsWrite.get(k).threadName+" joined.");
        }

        long millisFinish = System.currentTimeMillis();
        System.out.println(listSize+" threads: Strings have been written into to folder '"+dirName+"'. Duration: "+(millisFinish-millisStart)+"millis");
    }


    public void readStringsFromFilesInDifferentThreads() throws InterruptedException {

        long millisStart = System.currentTimeMillis();
        for (int k = 0; k < listSize; k++) {
            String file=dirName+"/"+(k+1)+".doc";
            runnableObjectsRead.add(k, new MyThreadRead("Read Thread " + (k + 1),file));
        }

        for(int k=0; k<listSize; k++){
            runnableObjectsRead.get(k).thread.join();
            //System.out.println(runnableObjectsRead.get(k).threadName+" joined.");
        }

        long millisFinish = System.currentTimeMillis();
        System.out.println(listSize+" threads: Strings have been read from folder '"+dirName+"'. Duration: "+(millisFinish-millisStart)+"millis");
    }

    public static void main(String[] args) {

        WriteReadFiles wrf = new WriteReadFiles();

        try{
            wrf.writeStringsToFilesInOneThread();

        }
        catch(IOException exc){
            System.out.println("Error writing to file. "+exc);
        }

        try{
            wrf.readStringsFromFilesInOneThread();

        }
        catch(IOException exc){
            System.out.println("Error reading from file. "+exc);
        }

        try {
            wrf.writeStringsToFilesInDifferentThreads();
        }
        catch(InterruptedException exc){
            System.out.println("Main thread interrupted.");
        }

        try {
            wrf.readStringsFromFilesInDifferentThreads();
        }
        catch(InterruptedException exc){
            System.out.println("Main thread interrupted.");
        }

    }
}
