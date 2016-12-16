package com.lijiazhou.musicreco.activities.ActivityBase;

import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;

import com.lijiazhou.musicreco.R;

/**
 * Created by lijiazhou on 20/02/2016.
 */
public abstract class PopMenuActivityBase extends MenuActivityBase {

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        View menuItemView = findViewById(R.id.action_menu);
        final PopupMenu popup = new PopupMenu(this, menuItemView);
        popup.getMenuInflater().inflate(menuID, popup.getMenu());
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if(listeners == null || listeners.size() == 0)
                    return true;
                for(int i = 0; i < popup.getMenu().size() ; i++)
                {
                    if (popup.getMenu().getItem(i).getItemId() == item.getItemId())
                    {
                        listeners.get(i).onClick(findViewById(item.getItemId()));
                        return true;
                    }
                }
                return true;
            }
        });
        popup.show();
        return super.onOptionsItemSelected(item);
    }
}
