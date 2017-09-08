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
public class Teste {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        pilha.inserir("Marco");
        pilha.inserir("Jose");
        pilha.inserir("Garujo");
        pilha.inserir("Cangela");
        pilha.inserir("Rodrigo");
        System.out.println(pilha.elementos());
        
    }
}
