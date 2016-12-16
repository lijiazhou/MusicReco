package com.lijiazhou.musicreco.utils.file.managers;

import com.lijiazhou.musicreco.Configurations.FileConfigs;
import com.lijiazhou.musicreco.utils.file.structures.FileNode;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by lijiazhou on 20/02/2016.
 */
public class FileTraversalManager {


    public FileTraversalManager() {

    }

    public HashMap<String, FileNode> constructFileNodeInternalList()
    {
        List<String> fileList = new ArrayList<>();
        File folder = new File(FileConfigs.DEFAULT_INTERNAL_STORAGE_PATH);
        addFile(fileList, folder);
        return null;
    }

    public HashMap<String, FileNode> constructFileNodeExternalList()
    {
        List<String> fileList = new ArrayList<>();
        File folder = new File(FileConfigs.DEFAULT_EXTERNAL_STORAGE_PATH);
        addFile(fileList, folder);
        return null;
    }

    public void addFile(List<String> fileList,File f){
        if(f.isDirectory()){
            File[] files = f.listFiles();
            for(File f1 : files){
                addFile(fileList, f1);
            }
        }
        else{
            String filename = f.getName();
            if(filename.length()>4&&filename.substring(filename.length()-4).equalsIgnoreCase(".mp3")){
                fileList.add(f.getAbsolutePath());
            }
        }
    }

}
