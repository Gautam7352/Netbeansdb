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
public class LeapYear {
    public static void main(String[] args) {
        int a=2020;
        if(a%4==0 && a%100!=0)
            System.out.println("Leap Year");
        else System.out.println("Not a leap year");
    }
}
