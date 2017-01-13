package com.example.shitalbharatlondhe.firebasefacebook;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity  {

    Button btnG,btnF;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ProjectPackageKeyHashUtility projectPackageKeyHashUtility = new ProjectPackageKeyHashUtility(MainActivity.this);
        projectPackageKeyHashUtility.getPackageInfo();


        btnG = (Button) findViewById(R.id.btn1);
        btnF= (Button)findViewById(R.id.btn2);
        //btnF =(Button)findViewById(R.id.login_facebook_button);

        btnG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, GoogleSigninActivity.class);
                startActivity(i);
            }
        });
        btnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, FaceBookActivity.class);
                startActivity(i);

            }
        });

    }


    }




