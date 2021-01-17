/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditional_statement;

import java.util.Scanner;

/**
 *
 * @author S M Arsalan Shah
 */
public class Conditional_statement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner state=new Scanner(System.in);
        
          System.out.println("enter your name");        
           char ch =state.next().charAt(0);
      
         if((ch=='a' || ch=='A') || (ch=='e' || ch=='E')||(ch=='i' || ch=='I')|| (ch=='o' || ch=='O')||(ch=='u' || ch=='U')){
            System.out.println("your name start from vowel");}
        else {System.out.println("its not vowels");}
        
        
        
        
//        System.out.println("Enter your pass ");
//        String pass ;
//        pass=state.nextLine();
//        
//        if(pass.equals("login123")){  
//            
//            
//            System.out.println("sucessful login ");
//            
//              System.out.println("enter your age");
//              int age ;
//              age=state.nextInt();
//             if(age >= 20 ) {
//                System.out.println("valid age");
//                System.out.println("enter your exp");
//                int exp ;
//                exp=state.nextInt();
//                
//                if(exp >= 2){
//                    System.out.println("selected");
//                     if( exp==2 ){
//                     System.out.println("your salary is 20000");
//                 
//                       }else if( exp==3 ){
//                       System.out.println("your salary is 30000");
//                 
//                 }
//                else {System.out.println("your salary is 100000");}
//                }else{System.out.println("sorry! you are not selected");}
//             
//             }
//             else {System.out.println("invalid age");}
//                
//        }else if(pass.equals("")){
//        System.out.println("its required");
//        }
//        else{System.out.println("sorry! incorrect pass ");}
//       
//        System.out.println("Enter any option : Create Account?Y/N");
//        String yesNo ;
//        yesNo = state.nextLine();
//        
//        if(yesNo .equals("Y") || yesNo .equals("y")){
//            
//            System.out.println("you can create account");
//        }else if (yesNo .equals("N") || yesNo .equals("n")){
//            System.out.println("oke bye");
//        }
        
    }
    
}
