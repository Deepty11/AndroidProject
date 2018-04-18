package com.hfad.rehnuma.implicitwebbrowserintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class fourthActivity extends AppCompatActivity {
    Intent intent=null,chooser=null;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
    }

        public void onClickFindKidneyHospitals(View view){
            switch(view.getId()){
                case R.id.kidney1:
                    intent= new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("http://www.nikdu.org.bd/"));
                    chooser=Intent.createChooser(intent,"Open with..");
                    if(intent.resolveActivity(getPackageManager())!=null){
                        startActivity(chooser);
                    }
                    break;
                case R.id.kidney2:
                    intent= new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("http://www.kidneyfoundationbd.com/"));
                    chooser=Intent.createChooser(intent,"Open with..");
                    if(intent.resolveActivity(getPackageManager())!=null){
                        startActivity(chooser);
                    }
                    break;
                case R.id.kidney3:
                    intent= new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("http://www.cityhospitalbd.com"));
                    chooser=Intent.createChooser(intent,"Open with..");
                    if(intent.resolveActivity(getPackageManager())!=null){
                        startActivity(chooser);
                    }
                    break;

            }


        }
    }

