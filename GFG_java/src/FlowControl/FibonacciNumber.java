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
public class FibonacciNumber {
    public static void main(String[] args) {
      int n=6;
      int a=1;
      int b=1;
      int c=0;
        
      for (int i = 0; i < n-2; i++) {
            c=a+b;
            a=b;
            b=c;
        }
      
      
        switch (n) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(1); 
                break;
            default:
                System.out.println(c);
                break;
        }
    }
}
