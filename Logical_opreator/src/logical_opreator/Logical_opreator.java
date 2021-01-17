/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logical_opreator;

import java.util.Scanner;

/**
 *
 * @author S M Arsalan Shah
 */
public class Logical_opreator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
//        System.out.println("enter character");        
//        char ch =scan.next().charAt(0);
//        scan.nextLine();
//        if((ch=='a' || ch=='A') || (ch=='e' || ch=='E')||(ch=='i' || ch=='I')|| (ch=='o' || ch=='O')||(ch=='u' || ch=='U')){
//        System.out.println("your name start from vowel");}
//        else {System.out.println("its not vowels");}
//        // pro 2
//        System.out.println("enter character");     
//        char ch1 =scan.next().charAt(0);
//          scan.nextLine();
//        if((ch1 >='a'&& ch1 <='z')||(ch1 >='A'&& ch1 <='Z')){ 
//        System.out.println("Alpahbet");}
//        else  if(ch1 >='0'&& ch1 <='9')
//        {System.out.println("Digit");}
//        else{System.out.println("symbol");}
//        
//        
        
          // pro 3
//        System.out.println("enter character 12");
//        char int1 =10;
//        char ch1 =scan.next().charAt(0);
//        int ch2 = (char) (int1+ch1);
//        if((ch2 >=65 && ch2 <=90)||(ch2 >=97&& ch2 <=122)){ 
//        System.out.println("Alpahbet");}
//        else  if(ch2 >=48 && ch2 <=57)
//        {System.out.println("Digit");}
//        else{System.out.println("symbol");}
//
//        System.out.println("enter your character and check with 10 + :"+ch2);
//        }
  
        System.out.println("enter character 12");
        int int1 =10;
        int ch1 =scan.next().charAt(0);
        int ch2 = int1+ch1;
        if((ch2 >=65 && ch2 <=90)||(ch2 >=97&& ch2 <=122)){ 
        System.out.println("Alpahbet");}
        else  if(ch2 >=48 && ch2 <=57)
        {System.out.println("Digit");}
        else{System.out.println("symbol");}

        System.out.println("enter your character and check with 10 + :"+ch2);
        }      
          
    }
    
