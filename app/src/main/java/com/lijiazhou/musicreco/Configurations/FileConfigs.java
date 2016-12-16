package com.lijiazhou.musicreco.Configurations;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;

/**
 * Created by lijiazhou on 21/02/2016.
 */
public class FileConfigs {

    //String path
    public static final String DEFAULT_ROOT_PATH = "/" ;

    public static final String DEFAULT_INTERNAL_STORAGE_PATH = Environment.getDataDirectory().getPath();

    public static final String DEFAULT_EXTERNAL_STORAGE_PATH = Environment.getExternalStorageDirectory().getPath();
}
