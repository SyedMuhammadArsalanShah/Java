/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nested_loop;

import java.util.Scanner;

/**
 *
 * @author S M Arsalan Shah
 */
public class Nested_loop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                
//            }
//        }
//        int i = 1;
//        
//        while (i <= 5) {
//            int j = 1;
//            while (j <= 3) {
//                System.out.println("i" + i);
//                System.out.println("j" + j);
//                j++;
//            }
//            i++;
//        }
        
        Scanner user =new Scanner(System.in);
        
        
        for (int j = 0; j < 3; j++) {
            System.out.println("enter number");
            int num1 = user.nextInt();
            for (int k = 1; k <=10 ; k++) {
              int num = num1*k;
           System.out.println(num);

            }
            
        }
    }

}
        