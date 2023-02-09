/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlowControl;

import java.util.Scanner;

/**
 *
 * @author Gautam
 */
public class Calculator {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter value 1");
        int a = sc.nextInt();
            System.out.println("Enter value 2");
        int b = sc.nextInt();
        
        System.out.println("Enter operation you want to perform");
            String op=sc.next();
        switch(op)
        {
            case"+":System.out.println(a+b);
             break;
             
            case"-":System.out.println(a-b);
             break;
        
            case"*":System.out.println(a*b);
             break;
        
            case"/":System.out.println(a/b);
             break;
             
            case"%":System.out.println(a%b);
             break;
             
             default:System.out.println("Invalid input");
        }
    }
}
