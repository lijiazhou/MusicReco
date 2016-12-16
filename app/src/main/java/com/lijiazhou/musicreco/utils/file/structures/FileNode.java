package com.lijiazhou.musicreco.utils.file.structures;

import java.util.LinkedList;

/**
 * Created by lijiazhou on 20/02/2016.
 */
public class FileNode {

    private String fileName;
    private String fullPath;
    private String extensionName;
    private long fileSize;
    private long duration;
    private String mimeType;

    public String getMineType() {
        return mimeType;
    }

    public void setMineType(String mine_type) {
        this.mimeType = mine_type;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFullPath() {
        return fullPath;
    }

    public void setFullPath(String fullPath) {
        this.fullPath = fullPath;
    }

    public String getExtensionName() {
        return extensionName;
    }

    public void setExtensionName(String extensionName) {
        this.extensionName = extensionName;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }


    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public FileNode(long fileSize, String fileName, String fullPath, String extensionName, String mimeType , long duration) {

        this.fileSize = fileSize;
        this.fileName = fileName;
        this.fullPath = fullPath;
        this.extensionName = extensionName;
        this.mimeType = mimeType;
        this.duration = duration;
    }
}
