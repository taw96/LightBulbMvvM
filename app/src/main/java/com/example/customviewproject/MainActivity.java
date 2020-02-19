package com.example.customviewproject;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.customviewproject.ViewModel.StateViewModel;

public class MainActivity extends AppCompatActivity {

    private StateViewModel model;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        model = new ViewModelProvider(this).get(StateViewModel.class);

        model.getCurrentState().postValue(false);

        final ImageView lightBulb = (ImageView) findViewById(R.id.lightBulb);

        System.out.println(model.getCurrentState().getValue());


        final Observer<Boolean> stateObserver = new Observer<Boolean>() {
            @Override
            public void onChanged(@Nullable final Boolean newBoolean) {
                System.out.println(model.getCurrentState().getValue());


                if(newBoolean){
                lightBulb.setImageResource(R.drawable.on);
                    Toast.makeText(MainActivity.this, "switched on", Toast.LENGTH_SHORT).show();
                }else{
                lightBulb.setImageResource(R.drawable.off);
                    Toast.makeText(MainActivity.this, "switched off", Toast.LENGTH_SHORT).show();

                }
            }
        };

            model.getCurrentState().observe(this,stateObserver);

    }
}
