package javaapplication65;

import java.util.Scanner;

public class Soft_book extends Publication {
 private float time;
public Soft_book() {
        super();
        this.time=0;     
    }
    public Soft_book(float time, float price, String title) {
        super(price, title);
        this.time = time;
    }
    @Override    
public void read_data(){
    Scanner sc=new Scanner(System.in);
     System.out.println("enter title :");
      this.title  =sc.next();
     System.out.println("enter price :");
        this.price=sc.nextFloat();
     System.out.println("enter time of book :");
        this.time =sc.nextFloat();
    }
@Override 
 public void print_data(){
        System.out.println("the title :"+this.title+"\tthe price :"+this.price+" EGP"+"\tthe time :"+this.time+" min");
 }}  

