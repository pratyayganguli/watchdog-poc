package com.cne.watchdog.poc.server.common;

import java.util.List;

/**
 * created on: 02 25 2024
 * 3:23 pm
 */

public class FileStateCollection {
    private List<FileState> fileStateCollection;

    public FileStateCollection(List<FileState> fileStateCollection) {
        this.fileStateCollection = fileStateCollection;
    }

    public List<FileState> getFileStateCollection() {
        return fileStateCollection;
    }

    public void setFileStateCollection(List<FileState> fileStateCollection) {
        this.fileStateCollection = fileStateCollection;
    }
}
