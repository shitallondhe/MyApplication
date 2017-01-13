package com.example.shitalbharatlondhe.mvcprojectdemo;



public class ModelProducts
{

    private String mProductName;
    private String mProductDesc;
    private int mProductPrice;


    public ModelProducts(String mProductName, String mProductDesc, int mProductPrice) {
        this.mProductName = mProductName;
        this.mProductDesc = mProductDesc;
        this.mProductPrice = mProductPrice;
    }


    public String getmProductName() {
        return mProductName;
    }

    public String getmProductDesc() {
        return mProductDesc;
    }

    public int getmProductPrice() {
        return mProductPrice;
    }
}
