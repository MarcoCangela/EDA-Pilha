/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eda.pilha;

/**
 *
 * @author Marco Cangela Garujo
 */
public class ConversorBinarioPilha {
      public static PilhaVector conversor(int nDecimal, PilhaVector vector){
      vector.inserir(conversorBinaryDecimal(nDecimal));
      return vector;
    }
       public static String conversorBinaryDecimal(int num){
       if(num == 0)
           return "";  
       return conversorBinaryDecimal(num/2) + num%2;
   }
    public static void main(String[] args) {
        PilhaVector<Integer> a = new PilhaVector<>();
        System.out.println(conversor(14, a));
    }
    }

