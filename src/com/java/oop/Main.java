package com.java.oop;

public class Main {
    public static void main(String[] args) {
        //Product object
        Product product;//no object exists product is just a reference variable
        product= new Product(1,"samsung",120000,10.0F,4.5F,true); //new constructor()
        //initialize
        product.id=1;
        product.name="samsung";
        product.discountPercentage=10.0F;
        product.maxRetailPrice=120000;
        product.rating=4.5F;
        product.isAvailable=true;

        System.out.println("Id : "+product.id);
        System.out.println("Name : "+product.name);
        System.out.println("MRP : "+product.maxRetailPrice);
        System.out.println("Discount : "+product.discountPercentage);
        System.out.println("Rating : "+product.rating);
        System.out.println("Available : "+product.isAvailable);

        Product product2=new Product(2,"oppo",20000,10.0F,4.5F,false);
        System.out.println("Id : "+product2.id);
        System.out.println("Name : "+product2.name);
        System.out.println("MRP : "+product2.maxRetailPrice);
        System.out.println("Discount : "+product2.discountPercentage);
        System.out.println("Rating : "+product2.rating);
        System.out.println("Available : "+product2.isAvailable);


        Customer customer;
        customer= new Customer(1,"Laxman",21,"laxmanreddy4728@gmail.com",'M',"7993481960");
        System.out.println("Id : "+customer.id);
        System.out.println("Name : "+customer.name);
        System.out.println("Age : "+customer.age);
        System.out.println("e-mail : "+customer.email);
        System.out.println("Gender : "+customer.gender);
        System.out.println("phno : "+customer.phno);

        Customer customer2;
        customer2= new Customer(2,"vishnu",21,"vishnu28@gmail.com",'M',"9652083960");
        System.out.println("Id : "+customer2.id);
        System.out.println("Name : "+customer2.name);
        System.out.println("Age : "+customer2.age);
        System.out.println("e-mail : "+customer2.email);
        System.out.println("Gender : "+customer2.gender);
        System.out.println("phno : "+customer2.phno);


    }
}