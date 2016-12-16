package com.lijiazhou.musicreco.activities.ActivityBase;

import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.lijiazhou.musicreco.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lijiazhou on 18/02/2016.
 */
public abstract class MenuActivityBase extends AppCompatActivity {

    protected int menuID;
    protected List<View.OnClickListener> listeners;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        listeners = new ArrayList<>();
        getMenuInflater().inflate(R.menu.nav, menu);
        menu.getItem(0).setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        setListeners();
        return true;
    }



    public abstract void setListeners();


}
