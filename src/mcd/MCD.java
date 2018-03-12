/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcd;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author lazarod
 */
public class MCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      BigInteger m, n;
      System.out.println("Digite el primer numero");
      m = sc.nextBigInteger();
      System.out.println("Digite el segundo numero");
      n = sc.nextBigInteger();
      System.out.println(mcd(m,n));
    }
    
    public static BigInteger mcd(BigInteger m, BigInteger n){
        BigInteger i;
        BigInteger resta = new BigInteger("-1");
        if(m.compareTo(n) > 0){
            i = n.add(BigInteger.ONE);
        }else{
            i = m.add(BigInteger.ONE);
        }
        do{
            i = i.add(resta);
        }while(!((m.mod(i)).compareTo(BigInteger.ZERO) == 0 && (n.mod(i)).compareTo(BigInteger.ZERO) == 0));
        return i;
    }
}
