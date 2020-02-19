package com.example.customviewproject.Model;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;

public class LayoutClass extends LinearLayout {


    public LayoutClass(Context context) {
        super(context);
        init();
    }

    public LayoutClass(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public LayoutClass(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }



    public void init(){
        setBackgroundColor(Color.YELLOW);

    }


}
