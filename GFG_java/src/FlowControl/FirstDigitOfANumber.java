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
public class FirstDigitOfANumber {
    public static void main(String[] args) {
        int N=123;
        int length=(int)(Math.log10(N));
        System.out.println((int)(N/Math.pow(10, length)));
    }
}
