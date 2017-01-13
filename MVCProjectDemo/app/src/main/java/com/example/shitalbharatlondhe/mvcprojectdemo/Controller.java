package com.example.shitalbharatlondhe.mvcprojectdemo;

import android.app.Application;

import java.util.ArrayList;


public class Controller extends Application {


    private ArrayList<ModelProducts> myAllProducts = new ArrayList<ModelProducts>();
    private  ModelCart myCart = new ModelCart();

    public ArrayList<ModelProducts> getMyAllProducts() {
        return myAllProducts;
    }


    public void setMyAllProducts(ModelProducts Product) {
        myAllProducts.add(Product);
    }

    public ModelCart getCart() {

        return myCart;

    }



}
