package com.java.oop;

public class Product {
    //state
    //id,name,maxRetailPrice, discountPercentage,rating,isAvailable
    int id;
    String name;
    int maxRetailPrice;
    float discountPercentage;
    float rating;
    boolean isAvailable;

    Product() {
        System.out.println("product() is called ");
    }

    Product(int id,String name,int maxRetailPrice, float discountPercentage, float rating, boolean isAvailable){
        this.id=id;
        this.name=name;
        this.maxRetailPrice=maxRetailPrice;
        this.discountPercentage=discountPercentage;
        this.rating=rating;
        this.isAvailable=isAvailable;
    }

}
