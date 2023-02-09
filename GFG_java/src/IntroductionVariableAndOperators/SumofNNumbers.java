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
public class SumofNNumbers {
    public static void main(String[] args) {
        int N=5;
        int sum=0;
        for(int i=1;i<=N;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
