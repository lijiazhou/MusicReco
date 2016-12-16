package com.lijiazhou.musicreco.activities.ActivityBase;


import android.os.Bundle;
import android.view.MenuItem;
import com.lijiazhou.musicreco.dialogs.MenuDialog;
import com.lijiazhou.musicreco.R;


/**
 * Created by lijiazhou on 18/02/2016.
 */
public abstract class DialogMenuBase extends MenuActivityBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_menu) {
            MenuDialog menuDialog = new MenuDialog();
            menuDialog.setMenuDialog(this, menuID);
            menuDialog.setImplamentation(listeners);
            menuDialog.show(getFragmentManager(), null);
            return true;
        }

        return true;
    }

}
