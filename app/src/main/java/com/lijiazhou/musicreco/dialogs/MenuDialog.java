package com.lijiazhou.musicreco.dialogs;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lijiazhou on 18/02/2016.
 */
public class MenuDialog extends DialogFragment {

    Context context;
    int layout;
    List<View.OnClickListener> listeners;

    public MenuDialog()
    {
        super();
        listeners = new ArrayList<>();
    }

    @Override
    public Dialog onCreateDialog(final Bundle savedInstanceState) {

        // the content
        final RelativeLayout root = new RelativeLayout(getActivity());
        root.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        // creating the fullscreen dialog
        final Dialog dialog = new Dialog(getActivity());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(root);
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        return dialog;
    }

    public void setMenuDialog(Context context, int layout)
    {
        this.context = context;
        this.layout = layout;
    }

    public void setImplamentation(List<View.OnClickListener> listeners)
    {
        this.listeners = listeners;

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(layout, container, false);
        int childCount = ((ViewGroup)v).getChildCount();

        for(int i = 0; i < childCount; i++)
        {
            if(listeners == null || 0 == listeners.size())
                break;

            ((ViewGroup)v).getChildAt(i).setOnClickListener(listeners.get(i));
        }

        getDialog().getWindow().setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM);
        return v;
    }

}
