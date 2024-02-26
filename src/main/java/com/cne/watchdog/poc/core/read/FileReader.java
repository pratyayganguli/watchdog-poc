package com.cne.watchdog.poc.core.read;

import com.cne.watchdog.poc.common.FileObject;
import lombok.RequiredArgsConstructor;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Base64;

/**
 * created on: 02 25 2024
 * 2:47 pm
 */

@RequiredArgsConstructor

public class FileReader extends Thread{
    private volatile boolean running = true;
    @Override
    public void run() {
        try{
            while (running) {
                String PATH = "/home/pratyay/Desktop/workspace/java-workspace/watchdog-poc/src/main/resources/external-resources/local/report";
                FileInputStream inputStream = new FileInputStream(PATH);
                FileObject fileObject = new FileObject("report", inputStream);
                FileInputStream fileInputStream = fileObject.getFileInputStream();
                byte[] content = fileInputStream.readAllBytes();
                fileInputStream.close();
                System.out.println(Base64.getEncoder().encode(content));
            }
        }
        catch (Exception e){
            throw new RuntimeException("file cannot be read");
        }
    }

    public void stopThread(){
        running = false;
    }
}
