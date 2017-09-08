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
public interface InterfacePilha {
    public boolean inserir(Object object);
    public Object removerTopo();
    public Object verificarTopo();
    public boolean estaVazio();
    public int pesquisar(Object object);

    

    
}
