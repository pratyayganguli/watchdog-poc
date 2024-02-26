package com.cne.watchdog.poc.core.read;

import com.cne.watchdog.poc.common.FileObject;

/**
 * created on: 02 25 2024
 * 2:47 pm
 */
public interface Reader {
    byte [] read(FileObject fileObject);
}
