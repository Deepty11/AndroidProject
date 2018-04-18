package com.hfad.rehnuma.implicitwebbrowserintent;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class fifthActivity extends Activity {
    Intent intent= null,chooser=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
    }
        public void onClickFindOrthopaedicHospitals(View view){
            switch(view.getId()){
                case R.id.orthopaedic1:
                     intent= new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("http://www.sondhan.com/listing/dhaka-orthopaedic-hospital.html"));
                    chooser=Intent.createChooser(intent,"Open with..");
                    if(intent.resolveActivity(getPackageManager())!=null){
                        startActivity(chooser);
                    }
                    break;
                case R.id.orthopaedic2:
                    intent= new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("http://bdspinehospital.business.site/"));
                    chooser=Intent.createChooser(intent,"Open with..");
                    if(intent.resolveActivity(getPackageManager())!=null){
                        startActivity(chooser);
                    }
                    break;
                case R.id.orthopaedic3:
                    intent= new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("http://nitorbd.com/"));
                    chooser=Intent.createChooser(intent,"Open with..");
                    if(intent.resolveActivity(getPackageManager())!=null){
                        startActivity(chooser);
                    }
                    break;

            }


    }
    }

