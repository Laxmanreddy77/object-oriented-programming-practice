package com.java.oop;

public class Customer {
    int id;
    String name;
    int age;
    String email;
    char gender;
    String phno;

    Customer(){
        System.out.println("Customer() is called");
    }
    Customer(int id,String name, int age, String email,char gender,String phno){
        this.id=id;
        this.name=name;
        this.age=age;
        this.email=email;
        this.gender=gender;
        this.phno=phno;
    }
}
