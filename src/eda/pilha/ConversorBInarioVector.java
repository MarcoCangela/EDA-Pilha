/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eda.pilha;

import java.util.Vector;

/**
 *
 * @author Marco Cangela Garujo
 */
public class ConversorBInarioVector {
    
    public static Vector conversor(int nDecimal, Vector vector){
      vector.add(conversorBinaryDecimal(nDecimal));
      return vector;
    }
       public static String conversorBinaryDecimal(int num){
       if(num == 0)
           return "";  
       return conversorBinaryDecimal(num/2) + num%2;
   }
   
    
    public static void main(String[] args) {
        Vector a = new Vector();
        System.out.println(conversor(14, a));
    }
}
