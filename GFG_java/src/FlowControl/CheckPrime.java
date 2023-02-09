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
public class CheckPrime {
    public static void main(String[] args) {
        int n=56;
        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.println("Not prime");
                return;
            }
            
        }System.out.println("Prime");
    }
}
