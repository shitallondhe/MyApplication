package com.example.shitalbharatlondhe.machintestfour;

/**
 * Created by Shital Bharat Londhe on 14-Nov-16.
 */
public class Product {

    private String productName;
    private int prizeOfProduct;

    public Product(String cProductName, int cProductPrize)
    {
        productName = cProductName;
        prizeOfProduct = cProductPrize;
    }

    public String getProductName()
    {
        return productName;
    }
    public int getPrizeOfProduct()
    {
        return prizeOfProduct;
    }
    public String toString()
    {
        return productName;
    }
}
