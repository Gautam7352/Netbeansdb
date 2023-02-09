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
public class StepByStepCondition {
    public static void main(String[] args) {
        int N=1;
        if(N%2==0)
            System.out.println("Two");
        else if(N%3==0)
            System.out.println("Three");
        else if(N%11==0)
            System.out.println("Eleven");
        else System.out.println("-1");
        }
    }