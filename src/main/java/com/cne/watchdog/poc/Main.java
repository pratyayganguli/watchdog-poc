package com.cne.watchdog.poc;

import com.cne.watchdog.poc.common.FileObject;
import com.cne.watchdog.poc.core.FileUploader;
import com.cne.watchdog.poc.core.Uploader;

import java.io.FileInputStream;
import java.util.UUID;

/**
 * created on: 02 24 2024
 * 11:17 am
 */

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("/home/pratyay/Desktop/workspace/java-workspace/watchdog-poc/src/main/resources/external-resources/local/file1");
            FileObject fileObject = new FileObject(UUID.randomUUID().toString(), inputStream);
            Uploader uploader = new FileUploader();
            uploader.upload(fileObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
