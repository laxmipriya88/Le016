package com.example;
public class App{
    public static void main(String[] args){
        System.out.println("===CI/CD Pipeline Execution (No Maven!)===");
        System.out.println("Hello World From Raw Jenkins!");
        System.out.println("Calculation Result(5+10):"+add(5,10));
    }
    public static int add(int a,int b){
        return a+b;
    }
}