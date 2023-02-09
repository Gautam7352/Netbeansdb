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
public class DaysBeforeNdays {
    public static void main(String[] args) {
        int d=4;
        int n=3;
        
        d=(n%7)-d;
        if(d<0)
            d=d*(-1);
        System.out.println(d);
    }
}
