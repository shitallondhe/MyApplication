package com.example.shitalbharatlondhe.mvcprojectdemo;

import java.util.ArrayList;


public class ModelCart {

    private ArrayList<ModelProducts> mCartProducts = new ArrayList<ModelProducts>();

    public ArrayList<ModelProducts> getmCartProducts() {
        return mCartProducts;
    }

    public void setmCartProducts(ModelProducts Products) {

        mCartProducts.add(Products);

    }
}
