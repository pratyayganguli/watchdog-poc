package com.cne.watchdog.poc.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.FileInputStream;

/**
 * created on: 02 24 2024
 * 10:55 am
 */


public class FileObject {
    private String fileId;
    private FileInputStream fileInputStream;

    public FileObject(String fileId, FileInputStream fileInputStream) {
        this.fileId = fileId;
        this.fileInputStream = fileInputStream;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public FileInputStream getFileInputStream() {
        return fileInputStream;
    }

    public void setFileInputStream(FileInputStream fileInputStream) {
        this.fileInputStream = fileInputStream;
    }
}
