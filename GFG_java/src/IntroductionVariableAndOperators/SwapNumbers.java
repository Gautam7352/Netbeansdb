/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroductionVariableAndOperators;

/**
 *
 * @author Gautam
 */
public class SwapNumbers {
    public static void main(String[] args) {
        int a=3;
        int b=4;
        int temp;   temp=a;   a=b;b=temp;
        System.out.println(a+" "+b);
        
        int c=3;
        int d=4;
        int temp1;  
        c=c+d;
        d=c-d;
        c=c-d;
        System.out.println(c+" "+d);
        
        
    }
}
