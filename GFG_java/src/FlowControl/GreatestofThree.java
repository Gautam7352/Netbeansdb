package FlowControl;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Gautam
 */
public class GreatestofThree {
    public static void main(String[] args) {
        int a=5;
        int b=15;
        int c=51;
        
        int temp=Math.max(a, b);
        int ans=Math.max(temp, c);
        
        System.out.println(ans);
    }
}
