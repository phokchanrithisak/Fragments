//Created on September 23 2017
//Complete on session
//Programmed by PHOK CHANRITHISAK
package com.example.phokchanrithisak.fragementsdemo;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FragmentManager fragmentManager= getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

//        LandscapeClass landscapeClass = new LandscapeClass();
//        fragmentTransaction.replace(android.R.id.content, landscapeClass);
//        fragmentTransaction.commit();

//          (this is optional)
//        PortraitClass portraitClass = new PortraitClass();
//        fragmentTransaction.replace(android.R.id.content, portraitClass);
//        fragmentTransaction.commit();

        //To find the orientation of mobile (whether you are in portrait or landscape mode)
        Configuration config = getResources().getConfiguration();

        if(config.orientation == Configuration.ORIENTATION_LANDSCAPE){
            LandscapeClass landscapeClass = new LandscapeClass();
            fragmentTransaction.replace(android.R.id.content, landscapeClass);
            Toast.makeText(this, "Rithisak! You are in Landscape Mode", Toast.LENGTH_LONG).show();
        }
        else{
            PortraitClass portraitClass = new PortraitClass();
            fragmentTransaction.replace(android.R.id.content, portraitClass);
            Toast.makeText(this, "Rithisak! You are in Portrait Mode", Toast.LENGTH_LONG).show();
        }
            fragmentTransaction.commit();


        //End of program;
    }
}
