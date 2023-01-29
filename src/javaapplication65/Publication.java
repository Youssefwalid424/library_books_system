package javaapplication65;

import java.util.*;

public class Publication {
    protected float price;
    protected  String title;

 public Publication(){
price=0;
title="";
}
public Publication(float price, String title){
this.price=price;
this.title=title;
}
  public void read_data(){
     Scanner sc=new Scanner(System.in);
      System.out.println("enter title");
        this.title  =sc.next();
      System.out.println("enter price");
        this.price=sc.nextFloat();
    }
    public void print_data(){
        System.out.println("the title :"+this.title+"\the price :"+this.price+"EGP");    
    }}
