package com.example.customviewproject.Model;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;
import com.example.customviewproject.R;
import com.example.customviewproject.ViewModel.StateViewModel;

public class TextViewClass extends LayoutClass {

    public TextViewClass(Context context) {
        super(context);
    }

    public TextViewClass(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public TextViewClass(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

//    private Drawable mClearButtonImage;

    @Override
    public void init() {
        super.init();

        super.setGravity(Gravity.CENTER);

        final EditText editTextComp = (EditText) new EditText(this.getContext());
        editTextComp.setWidth(500);

//        mClearButtonImage = ResourcesCompat.getDrawable(getResources(), R.drawable.ic_clear_black_24dp1,null);

//
//        editTextComp.setOnTouchListener(new OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                if((editTextComp.getCompoundDrawablesRelative()[2]!= null)){
//                    float clearButtonStart;
//                    float clearButtonEnd;
//                    boolean isClearButtonClicked= false;
//
//
//
//                    if (getLayoutDirection() == LAYOUT_DIRECTION_RTL) {
//                        clearButtonEnd = mClearButtonImage.getIntrinsicWidth() + getPaddingStart();
//                        if (event.getX() < clearButtonEnd) {
//                            isClearButtonClicked = true;
//                        }
//                    } else {
//
//                        clearButtonStart = (getWidth() - getPaddingEnd()
//                                - mClearButtonImage.getIntrinsicWidth());
//                        if (event.getX() > clearButtonStart) {
//                            isClearButtonClicked = true;
//                        }
//                    }
//                    if (isClearButtonClicked) {
//                        if (event.getAction() == MotionEvent.ACTION_DOWN) {
//                            mClearButtonImage =
//                                    ResourcesCompat.getDrawable(getResources(),
//                                            R.drawable.ic_clear_black_24dp1, null);
//                            editTextComp.setCompoundDrawablesRelativeWithIntrinsicBounds(null,null,mClearButtonImage,null);
//
//                        }
//                        if (event.getAction() == MotionEvent.ACTION_UP) {
//                            mClearButtonImage = ResourcesCompat.getDrawable(getResources(),
//                                            R.drawable.lighter_clear_icon, null);
//                            editTextComp.getText().clear();
//                            editTextComp.setCompoundDrawablesRelativeWithIntrinsicBounds(null,null,null,null);
//
//                            return true;
//                        }
//                    } else {
//                        return false;
//                    }
//                }
//                return false;
//            }
//
//
//        });
//
//
//        editTextComp.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//            }
//        });

        editTextComp.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if ((event.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {

                    if((editTextComp.getText().toString()).equals("הדלק")) {
                        StateViewModel.state.postValue(true);

                    }else if((editTextComp.getText().toString()).equals("כבה")){
                        StateViewModel.state.postValue(false);

                    }
                    return true;
                }
                return false;
            }
        });

        super.addView(editTextComp);
    }

}
