/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlowControl;

/**
 *
 * @author Gautam
 */
public class Factorial {
    public static void main(String[] args) {
        int A=10;
        int fact=1;
        for(int i=1;i<=A;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
