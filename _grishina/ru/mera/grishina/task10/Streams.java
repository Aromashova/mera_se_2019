package ru.mera.grishina.task10;

import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 ** Let's compare the performance of parallel and sequential writing to a file.
 */

public class Streams{
    ArrayList<String> lines;
    long lines_number = 1000;

    ArrayList<String> parallelWriting;
    ArrayList<String> sequentialWriting;
    ArrayList<Write> runnableObjectsWrite;
    ArrayList<Read> runnableObjectsRead;

    static long time1;
    static long time2;
    static long time3;
    static long time4;

    Streams(){
        lines = new ArrayList<>();
        parallelWriting =  new ArrayList<>();
        sequentialWriting =  new ArrayList<>();
        runnableObjectsWrite = new ArrayList<>();
        runnableObjectsRead = new ArrayList<>();

        for(int i = 0; i < lines_number; i++){
            lines.add(i,"Lines" + (i + 1));
        }
    }

    public void writeLinesToFileInSequence() throws IOException{
        String directory = "SequentialStreams/";

        long timeStart = System.currentTimeMillis();

        for(int i = 0; i < lines_number; i++){
            FileOutputStream writing;
            String file = directory + (i + 1) + ".txt";
            writing = new FileOutputStream(file);
            for(int j = 0; j < lines.get(i).length(); j++) {
                writing.write(lines.get(i).charAt(j));
            }
            writing.close();
        }

        long timeFinish = System.currentTimeMillis();

        time1 = timeFinish - timeStart;

        System.out.println("Sequential streams: The line was written to the directory " + directory + " for " + time1 + " milliseconds.");
    }

    public void readLinesToFileInSequence() throws IOException{
        String directory = "SequentialStreams/";

        long timeStart = System.currentTimeMillis();

        for(int i = 0; i < lines_number; i++){
            FileInputStream reading;
            String tempLine = "";
            String file = directory + (i + 1) + ".txt";
            int j;
            reading = new FileInputStream(file);
            do {
                j = reading.read();
                if (j != -1) {
                    tempLine += (char)j;
                }
            } while (j != -1);
            sequentialWriting.add(tempLine);
            reading.close();
        }

        long timeFinish = System.currentTimeMillis();

        time2 = timeFinish - timeStart;

        System.out.println("Sequential streams: The line was read to the directory " + directory + " for " + time2 + " milliseconds.");
    }

    public void writeLinesToFileInParallel() throws InterruptedException{
        String directory = "ParallelStreams/";

        long timeStart = System.currentTimeMillis();

        for (int i = 0; i < lines_number; i++){
            String file = directory + (i + 1) + ".txt";
            runnableObjectsWrite.add(i, new Write("Write stream " + (i + 1), file, lines.get(i)));
        }

        for(int i = 0; i < lines_number; i++){
            runnableObjectsWrite.get(i).stream2.join();
        }

        long timeFinish = System.currentTimeMillis();

        time3 = timeFinish - timeStart;

        System.out.println("Parallel streams: The line was written to the directory " + directory + " for " + time3 + " milliseconds.");
    }


    public void readLinesToFileInParallel() throws InterruptedException {
        String directory = "ParallelStreams/";

        long timeStart = System.currentTimeMillis();

        for (int i = 0; i < lines_number; i++){
            String file = directory + (i + 1) + ".txt";
            runnableObjectsRead.add(i, new Read("Read stream " + (i + 1), file));
        }

        for(int i = 0; i < lines_number; i++){
            runnableObjectsRead.get(i).stream1.join();
        }

        long timeFinish = System.currentTimeMillis();

        time4 = timeFinish - timeStart;

        System.out.println("Parallel streams: The line was read to the directory " + directory + " for " + time4 + " milliseconds.");
    }

    public static void main(String[] args) {
        Streams streams = new Streams();

        try{
            streams.writeLinesToFileInSequence();
        } catch(IOException exc){
            System.out.println("Error writing to file.");
        }

        try{
            streams.readLinesToFileInSequence();
        } catch(IOException exc){
            System.out.println("Error reading from file.");
        }

        try{
            streams.writeLinesToFileInParallel();
        } catch(InterruptedException exc){
            System.out.println("Main thread interrupted.");
        }

        try{
            streams.readLinesToFileInParallel();
        } catch(InterruptedException exc){
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Parallel writing is faster for " + (time1 - time3) + " milliseconds.");
        System.out.println("Parallel reading is faster for " + (time2 - time4) + " milliseconds.");
    }
}