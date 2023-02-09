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
public class PrintSquare {
    public static void main(String[] args) {
        int S=4;
        
        for(int i=1;i<=S;i++){
            for (int j = 1; j <=S; j++) {
               if((j==1||j==S)||(i==1||i==S))
                    System.out.print("* ");
               else
                    System.out.print("  ");
                                
            }System.out.println("");
        }
    }
}
