package com.cne.watchdog.poc.core.edit;

import com.cne.watchdog.poc.common.FileObject;

import java.util.concurrent.CompletableFuture;

/**
 * created on: 02 25 2024
 * 1:39 pm
 */
public interface Editor {
   void edit(FileObject fileObject);
 }
