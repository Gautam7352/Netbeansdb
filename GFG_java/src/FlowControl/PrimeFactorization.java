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
public class PrimeFactorization {

    public static void main(String[] args) {
        int N = 100;
        while (N > 0) {
            for (int i = 2; i <= N; i++) {
                if (N % i == 0) {
                    System.out.print(i);
                    N = N / i;
                    break;
                }

            }
            System.out.print(" * ");

        }
    }
}
