package com.cne.watchdog.poc.core.upload;

import com.cne.watchdog.poc.common.FileObject;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.logging.Logger;


/**
 * created on: 02 24 2024
 * 10:54 am
 */

public class FileUploader implements Uploader {
    private static final String CLOUD_DIR = "/home/pratyay/Desktop/workspace/java-workspace/watchdog-poc/src/main/resources/cloud";
    private static final String fileName = "report";
    private static final Logger LOGGER = Logger.getLogger(FileUploader.class.getName());
    @Override
    public void upload(FileObject fileObject) {
        try {
            OutputStream  outputStream = new FileOutputStream(CLOUD_DIR.concat("/").concat(fileName));
            byte [] contents = fileObject.getFileInputStream().readAllBytes();
            outputStream.write(contents);
            outputStream.close();
            LOGGER.info("upload successful");
        }
        catch (Exception e){
            throw new RuntimeException("upload failed");
        }
    }
}
