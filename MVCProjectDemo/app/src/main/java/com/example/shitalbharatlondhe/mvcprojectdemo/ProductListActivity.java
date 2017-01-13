package com.example.shitalbharatlondhe.mvcprojectdemo;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ProductListActivity extends AppCompatActivity {


    ArrayList<ModelProducts> mModelProductses;

    List<String> mAllProductList;
    ArrayAdapter<String> allProductList;
    Controller controller;
    Button mBtnShowCart;
    ListView mAllList;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);


        mBtnShowCart = (Button) findViewById(R.id.btn_Show_Cart);

        mAllList = (ListView) findViewById(R.id.lst_AllItems);


        controller = (Controller) getApplicationContext();

        mModelProductses = controller.getMyAllProducts();

        mAllProductList = new ArrayList<String>();




        for(ModelProducts m: mModelProductses)
        {
            StringBuilder stringBuilder = new StringBuilder();

            stringBuilder.append(m.getmProductName()).append("-")
                    .append(m.getmProductDesc()).append("-")
                    .append(m.getmProductPrice());


            mAllProductList.add(stringBuilder.toString());
        }

        allProductList = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,mAllProductList);

        mAllList.setAdapter(allProductList);



        mAllList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                ModelCart modelCart = controller.getCart();

                modelCart.setmCartProducts(mModelProductses.get(position));

                mAllProductList.remove(position);

                allProductList.notifyDataSetChanged();




            }
        });




        mBtnShowCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myCart = new Intent(ProductListActivity.this,CartListActivity.class);
                startActivity(myCart);
                finish();

            }
        });



    }



}
