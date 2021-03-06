package com.example.cshw2;

import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Spinner;

import androidx.annotation.RequiresApi;

import java.util.Random;


public class FaceControl implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener, AdapterView.OnItemSelectedListener {
    private Face view;
    Random rand = new Random();



    public FaceControl(Face fav)
    {
        view = fav;

    }


    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                // do your code
                view.hairStyle = rand.nextInt(3);
                view.skinColor = rand.nextInt(1 + 167772) -167772;
                view.eyeColor = rand.nextInt(1 + 167772) -167772;
                view.hairColor = rand.nextInt(1 + 167772) -167772;







                view.invalidate();
                break;

            case R.id.Hairbutton:



                break;

            case R.id.radioButton1:

                break;

            case R.id.radioButton2:

                break;



            default:
                break;




    }

}

    public void onNothingSelected(AdapterView<?> parent) {
        view.hairStyle = 0;
        view.invalidate();


    }

    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {

        switch(position)
        {
            case 0:
                view.hairStyle = 0;
                break;
            case 1:
                view.hairStyle = 1;
                break;
            case 2:
                view.hairStyle = 2;
                break;
            default:
                break;


        }
        view.invalidate();


    }


    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
