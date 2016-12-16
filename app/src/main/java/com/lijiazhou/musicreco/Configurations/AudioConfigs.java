package com.lijiazhou.musicreco.Configurations;

import android.provider.MediaStore;

/**
 * Created by lijiazhou on 21/02/2016.
 */
public class AudioConfigs {

    public static final String[] MUSIC_INFO_FILE_NODE =
            {
                    MediaStore.Audio.Media.TITLE,
                    MediaStore.Audio.Media.DATA,
                    MediaStore.MediaColumns.MIME_TYPE,
                    MediaStore.MediaColumns.SIZE,
                    MediaStore.Audio.Media.DURATION,
                    MediaStore.Audio.Media.IS_MUSIC,
                    MediaStore.Audio.Media.IS_RINGTONE,
                    MediaStore.Audio.Media.IS_NOTIFICATION,
                    MediaStore.Audio.Media.IS_ALARM,
                    MediaStore.Audio.Media.IS_MUSIC,
            };
}
