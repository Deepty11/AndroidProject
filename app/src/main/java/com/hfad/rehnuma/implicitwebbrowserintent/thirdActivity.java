package com.hfad.rehnuma.implicitwebbrowserintent;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class thirdActivity extends Activity {
    Intent intent= null,chooser=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }
    public void onClickFindEyeHospitals(View view){
        switch(view.getId()){
            case R.id.eye1:
                intent= new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://bdeyehospital.com/#/"));
                chooser=Intent.createChooser(intent,"Open with..");
                if(intent.resolveActivity(getPackageManager())!=null){
                    startActivity(chooser);
                }
                break;
            case R.id.eye2:
                intent= new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.islamia.org.bd/"));
                chooser=Intent.createChooser(intent,"Open with..");
                if(intent.resolveActivity(getPackageManager())!=null){
                    startActivity(chooser);
                }
                break;
            case R.id.eye3:
                intent= new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.haruneyehospital.com/"));
                chooser=Intent.createChooser(intent,"Open with..");
                if(intent.resolveActivity(getPackageManager())!=null){
                    startActivity(chooser);
                }
                break;

        }


    }
}
