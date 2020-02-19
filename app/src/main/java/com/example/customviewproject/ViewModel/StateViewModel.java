package com.example.customviewproject.ViewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class StateViewModel extends ViewModel {

    public static MutableLiveData<Boolean> state;

    public MutableLiveData<Boolean> getCurrentState(){
        if(state==null){
            state = new MutableLiveData<Boolean>();
        }

        return state;
    }

}
