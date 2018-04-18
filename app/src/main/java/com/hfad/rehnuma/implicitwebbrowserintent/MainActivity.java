package com.hfad.rehnuma.implicitwebbrowserintent;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class MainActivity extends Activity {
    Intent intent=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickFind(View view)
    {
        Spinner spin=(Spinner)findViewById(R.id.speciality);
        String selectedSpeciality=String.valueOf(spin.getSelectedItem());
        if(selectedSpeciality.equals("Cardiac Hospitals")){
             intent= new Intent(this,secondActivity.class);
            //intent.putExtra(secondActivity.Extra,selectedSpeciality);
            startActivity(intent);
        }
        else if(selectedSpeciality.equals("Eye Hospitals")){
             intent= new Intent(this,thirdActivity.class);
           // intent.putExtra(secondActivity.Extra,selectedSpeciality);
            startActivity(intent);
        }

        else if(selectedSpeciality.equals("Kidney Hospitals")){
             intent= new Intent(this,fourthActivity.class);
            //intent.putExtra(secondActivity.Extra,selectedSpeciality);
            startActivity(intent);
        }

        else if(selectedSpeciality.equals("Orthopaedic Hospitals")){
             intent= new Intent(this,fifthActivity.class);
            //intent.putExtra(secondActivity.Extra,selectedSpeciality);
            startActivity(intent);
        }



    }
}
