package com.example.shitalbharatlondhe.mvcprojectdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CartListActivity extends AppCompatActivity {



    Button mBtnCart;
    ListView mLstCart;
    Controller mController;
    List<String> mCartProductList;
    ArrayAdapter<String> CartProductList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart_list);

        mBtnCart = (Button) findViewById(R.id.btn_Back_To_MainList);
        mLstCart = (ListView) findViewById(R.id.lst_Cart);

        mController = (Controller) getApplicationContext();

        ModelCart modelCart = mController.getCart();

        mCartProductList = new ArrayList<String>();


        for(ModelProducts m: modelCart.getmCartProducts())
        {
            StringBuilder stringBuilder = new StringBuilder();

            stringBuilder.append(m.getmProductName()).append("-")
                    .append(m.getmProductDesc()).append("-")
                    .append(m.getmProductPrice());


            mCartProductList.add(stringBuilder.toString());
        }


        CartProductList = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,mCartProductList);

        mLstCart.setAdapter(CartProductList);


        mBtnCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent prodInt = new Intent(CartListActivity.this,ProductListActivity.class);
                startActivity(prodInt);
                finish();

            }
        });




    }
}
