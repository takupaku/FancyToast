package com.example.student.fancytoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.shashank.sony.fancytoastlib.FancyToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view) {
        if(view.getId()== R.id.errorId){

            FancyToast.makeText(this,"Hello World !",FancyToast.LENGTH_LONG,FancyToast.ERROR,true);

        }
        if(view.getId()== R.id.successId){

            FancyToast.makeText(this,"Hello World !",FancyToast.LENGTH_LONG,FancyToast.SUCCESS,true);

        }
        if(view.getId()== R.id.warningId){

            FancyToast.makeText(this,"Hello World !",FancyToast.LENGTH_LONG,FancyToast.WARNING,true);

        }
        if(view.getId()== R.id.infoId){
            FancyToast.makeText(this,"Hello World !",FancyToast.LENGTH_LONG,FancyToast.INFO,true);

        }
        if(view.getId()== R.id.confusionId){
            FancyToast.makeText(this,"Hello World !",FancyToast.LENGTH_LONG,FancyToast.CONFUSING,true);

        }
    }
}
