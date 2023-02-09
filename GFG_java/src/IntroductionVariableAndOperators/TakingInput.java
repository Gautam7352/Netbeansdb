/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroductionVariableAndOperators;


import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Gautam
 */
public class TakingInput {

    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args)  throws IOException
    {
        //using scanner class
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        Float b=sc.nextFloat();
        Long c=sc.nextLong();
        byte d=sc.nextByte();
        String s=sc.next();
        // using buffer reader class
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        Float B=Float.parseFloat(br.readLine());
        Long C=Long.parseLong(br.readLine());
        byte D=Byte.parseByte(br.readLine());
        String S=br.readLine();
        System.out.println(a+" "+b+" "+c+" "+d+" "+s);
        System.out.println(A+" "+B+" "+C+" "+D+" "+S);
        
    }
}
