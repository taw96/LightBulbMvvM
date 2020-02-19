package com.example.customviewproject.Model;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.CompoundButton;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;

import com.example.customviewproject.R;
import com.example.customviewproject.ViewModel.StateViewModel;

public class SwitchClass extends LayoutClass {

    public SwitchClass(Context context) {
        super(context);
    }

    public SwitchClass(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs
        );
    }

    public SwitchClass(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void ChangeState(){


    }


    @Override
    public void init() {

        super.init();
        final SwitchCompat switchComp = new SwitchCompat(this.getContext());
        setBackgroundColor(Color.YELLOW);
        switchComp.setShowText(true);
        switchComp.setTextOn("On");
        switchComp.setTextOff("Off");
        super.setGravity(Gravity.CENTER);

        switchComp.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    StateViewModel.state.postValue(true);
                }else {
                    StateViewModel.state.postValue(false);
                }

            }

        });

        switchComp.setThumbResource(R.drawable.thumb1);
        switchComp.setTrackResource(R.drawable.track);


        super.addView(switchComp);

    }


}
