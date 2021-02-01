/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

import java.util.Scanner;

/**
 *
 * @author S M Arsalan Shah
 */
public class Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
//        for (int i = 2001; i <= 2021; i++) {
//
//            if (i % 4 == 0) {
//
//                System.out.println("leap year" + i);
//            }
//        }
//        
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        for (int i = 1; i <= number2; i++) {
            int num = number1;
            System.out.println(number1 + "*" + number2 + "=" + (num * i));
        }
//        int num3 = 0;
//        for (int i = 1; i <= 10; i++) {
//
//            System.out.println(i);
//            num3 += i;
//
//        }
//        System.out.println(num3);
//        int num4 = 0;
//        for (int i = 10; i >= 1; i--) {
//            System.out.println(i);
//            num4 += i;
//        }
//        System.out.println(num4);
//
//        int i, fact = 1, number;
//        number = scan.nextInt();
//        for (i = 1; i <= number; i++) {
//            fact *= i; // fact = fact * i;
//        }
//        System.out.println(fact);
//        System.out.println("enter 1 number");
//        int number1 = scan.nextInt();
//        System.out.println("enter 2 number");
//        int number2 = scan.nextInt();
//        for (int i = number1; i <= number2; i++) {
//          
//            if (i % 2 == 0) {
//
//                System.out.println("even" + i);
//
//            } else {
//                System.out.println("odd" + i);
//            }
//       
//        }
//            int count=3;
//            int count1=0;
//            int count2=0;
//            System.out.println("enter 10 number");
//           for (int i = 1; i <= 10; i++) {
//              number1 = scan.nextInt();
//           
//             
//            if (number1 % 2 == 0) {
//                if (number1==count){
//                count1++;}
//                else{System.out.println("no even numbers" );}
//                
//                System.out.println("even" + number1 );
//
//            } else {
//                if (number1==count){
//                count2++;
//                
//                } else{System.out.println("no even numbers" );}
//               
//               System.out.println("odd" + number1 );
//            }
//            
//     }   System.out.println("odd times"+count1);
//         System.out.println("even times"+count2);
   }
}
