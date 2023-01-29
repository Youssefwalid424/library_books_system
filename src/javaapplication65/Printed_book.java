package javaapplication65;

import java.util.Scanner;

public class Printed_book extends Publication {
    private int num_page;
public Printed_book(){
super();
this.num_page=0;
}
public Printed_book(int num_page, float price, String title) {
        super(price, title);
        this.num_page = num_page;
    }
@Override    
public void read_data(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter title :");
      this.title  =sc.next();
        System.out.print("enter price :");
        this.price=sc.nextFloat();
        System.out.print("enter count page of this book :");
       this.num_page =sc.nextInt();
    }
@Override 
 public void print_data(){
        System.out.println("the title :"+this.title+"\tthe price :"+this.price+"EGP"+"\tthe count of page :"+this.num_page+"pages");
   }}
    

