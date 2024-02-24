package com.cne.watchdog.poc.core;

import com.cne.watchdog.poc.common.FileObject;

import java.util.concurrent.CompletableFuture;

/**
 * created on: 02 24 2024
 * 10:54 am
 */
public interface Uploader {
    void upload(FileObject fileObject);
}
