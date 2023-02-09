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
public class BitwiseOperators {
    public static void main(String[] args) {
    int a=9;
    int b=5;
    int c=7;
    
    System.out.println(a^a);
    System.out.println(c^b);
    System.out.println(a&b);
    System.out.println(c|(a^a));
    System.out.println(~a);
    }
}
