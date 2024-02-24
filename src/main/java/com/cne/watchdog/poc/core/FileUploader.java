package com.cne.watchdog.poc.core;

import com.cne.watchdog.poc.common.FileObject;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.UUID;


/**
 * created on: 02 24 2024
 * 10:54 am
 */

public class FileUploader implements Uploader {
    private static final String CLOUD_DIR = "/home/pratyay/Desktop/workspace/java-workspace/watchdog-poc/src/main/resources/cloud";
    @Override
    public void upload(FileObject fileObject) {
        try {
            String fileName = UUID.randomUUID().toString();
            OutputStream  outputStream = new FileOutputStream(CLOUD_DIR.concat("/").concat(fileName));
            byte [] contents = fileObject.getFileInputStream().readAllBytes();
            outputStream.write(contents);
            outputStream.close();
        }
        catch (Exception e){
            throw new RuntimeException("upload failed");
        }
    }
}
