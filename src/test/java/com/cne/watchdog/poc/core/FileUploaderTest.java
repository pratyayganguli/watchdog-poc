package com.cne.watchdog.poc.core;

import com.cne.watchdog.poc.common.FileObject;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.UUID;


class FileUploaderTest {
    @Test
    void upload() throws IOException {
        FileInputStream inputStream = new FileInputStream("resources/external-resources/local/file1");
        FileObject fileObject = new FileObject(UUID.randomUUID().toString(), inputStream);
        Uploader uploader = new FileUploader();
        uploader.upload(fileObject);
    }
}