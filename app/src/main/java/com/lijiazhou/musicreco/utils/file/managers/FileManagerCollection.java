package com.lijiazhou.musicreco.utils.file.managers;

import android.content.Context;

import com.lijiazhou.musicreco.utils.file.structures.FileNode;

import java.util.HashMap;

/**
 * Created by lijiazhou on 21/02/2016.
 */
public class FileManagerCollection {

    public FileManagerCollection()
    {
        if(FileTraversalManagerInstance == null) {
            FileTraversalManagerInstance = new FileTraversalManager();
        }

        Music_Collection_Internal = FileTraversalManagerInstance.constructFileNodeInternalList();
        Music_Collection_External = FileTraversalManagerInstance.constructFileNodeExternalList();
        return;

    }

    public static FileTraversalManager FileTraversalManagerInstance;

    HashMap<String, FileNode> Music_Collection_Internal;
    HashMap<String, FileNode> Music_Collection_External;
}
