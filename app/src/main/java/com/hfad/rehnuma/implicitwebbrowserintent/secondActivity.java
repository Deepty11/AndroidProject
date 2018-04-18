package com.hfad.rehnuma.implicitwebbrowserintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class secondActivity extends AppCompatActivity {
    Intent intent=null,chooser=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public void onClickFindCardiacHospitals(View view){
        switch(view.getId()){
            case R.id.cardiac1:
                intent= new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://labaidgroup.com/cardiac"));
                chooser=Intent.createChooser(intent,"Open with..");
                if(intent.resolveActivity(getPackageManager())!=null){
                    startActivity(chooser);
                }
                break;
            case R.id.cardiac2:
                intent= new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.nhf.org.bd/"));


                chooser=Intent.createChooser(intent,"Open with..");
                if(intent.resolveActivity(getPackageManager())!=null){
                    startActivity(chooser);
                }
                break;
            case R.id.cardiac3:
                intent= new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.ibrahimcardiac.org.bd/"));
                chooser=Intent.createChooser(intent,"Open with..");
                if(intent.resolveActivity(getPackageManager())!=null){
                    startActivity(chooser);
                }
                break;

        }


    }

}
