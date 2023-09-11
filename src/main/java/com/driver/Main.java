package com.driver;

public class Main {
    public static void main(String[] args) {

        A obj = new B();
        obj.method();
    }
  
}
class A{

    void method(){
        System.out.println("Invoking method from class A");
    }
}
class B extends  A{
    void  method(){
        System.out.println("Method is overridden in Extendend class B");
    }
}