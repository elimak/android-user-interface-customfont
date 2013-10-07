package com.elimak.chap9customfont;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by elimak on 10/7/13.
 */
public class TextViewRobotoThin extends TextView {

    public static final String FONT_LOCATION = "robotothin.ttf";
    private static Typeface sTypeFace;

    public TextViewRobotoThin(Context context) {
        super(context);
        init(context);
    }

    public TextViewRobotoThin(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public TextViewRobotoThin(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context);
    }

    public static Typeface getTypeface(Context context) {
        Log.e("assets: ", context.getAssets().toString());
        if (sTypeFace == null) {
            sTypeFace = Typeface.createFromAsset(context.getAssets(), FONT_LOCATION);
        }
        return sTypeFace;
    }

    private void init(Context context) {
        if (isInEditMode()) {
            if (TextUtils.isEmpty(getText())) {
                setText("Roboto thin");
            }
            return;
        }

        setTypeface(getTypeface(context));
    }
}
