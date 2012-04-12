package org.thoughtcrime.securesms.lang;

import org.thoughtcrime.securesms.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

public class BhoToast extends Toast {
 
    public BhoToast(Context context, int text, int duration) {
        super(context);
        makeText(context, context.getString(text), duration).show();
    }
 
    public static Toast makeText(Context context, CharSequence text, int duration) {
 
        Toast result = new Toast(context);
        LayoutInflater inflate = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflate.inflate(R.layout.bho_toast, null);
        BhoTextView tv = (BhoTextView) v.findViewById(R.id.bho_toast_text);
        tv.setText(text);
 
        result.setView(v);
        result.setDuration(duration);
 
        return result;
    }
 
}