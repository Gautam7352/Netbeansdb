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
public class LCM {
    public static void main(String[] args) {
        int a=14;
        int b=8;
        int HCF=1;
        for(int i=1;i<=a&&i<=b;i++){
            if (a%i==0 && b%i==0) {
                HCF=i;
            }
        }
        System.out.println((a*b)/HCF);
    }
}