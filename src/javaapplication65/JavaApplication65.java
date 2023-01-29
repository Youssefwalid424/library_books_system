package javaapplication65;

import java.util.Scanner;

public class JavaApplication65 {
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("choose operation for storing data");
        System.out.println("1.printed book\n2.soft book");
        System.out.print(" your choice :");
        int input=sc.nextInt();
        Publication p1=new Publication();
        switch(input){
            case 1:      
    p1=new Printed_book();
          p1.read_data();
          p1.print_data();
                break;
            case 2:
    p1=new Soft_book();
           p1.read_data();
           p1.print_data();       
        }}}
       
    
    
    
    

