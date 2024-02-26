package com.cne.watchdog.poc.server.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * created on: 02 25 2024
 * 3:19 pm
 */

public class FileState {
    private String fileId;
    private byte [] content;

    public FileState(String fileId, byte[] content) {
        this.fileId = fileId;
        this.content = content;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }
}
