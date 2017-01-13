package com.example.shitalbharatlondhe.mvcprojectdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText mEdtProductName,mEdtProductDesc,mEdtProductPrice;
    Button mBtnSaveProduct,mBtnDisplay;

    ModelProducts mModelProduct;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEdtProductName = (EditText) findViewById(R.id.edt_Product_Name);
        mEdtProductDesc = (EditText) findViewById(R.id.edt_Product_Desc);
        mEdtProductPrice= (EditText) findViewById(R.id.edt_Product_Price);

        mBtnSaveProduct = (Button) findViewById(R.id.btn_Save_Product);
        mBtnDisplay = (Button) findViewById(R.id.btn_Display);


        mBtnSaveProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               String pName = mEdtProductName.getText().toString();
               String pDesc = mEdtProductDesc.getText().toString();
               int pPrice = Integer.parseInt(mEdtProductPrice.getText().toString());


               mModelProduct = new ModelProducts(pName,pDesc,pPrice);

               Controller controller = (Controller) getApplicationContext();

               controller.setMyAllProducts(mModelProduct);



            }
        });


        mBtnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent displayIntent = new Intent(MainActivity.this,ProductListActivity.class);
                startActivity(displayIntent);
                finish();
            }
        });



    }
}
