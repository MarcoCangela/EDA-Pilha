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
public class PilhaVector<E> implements InterfacePilha{
        Vector vector = new Vector(10);
    
    @Override
    public boolean inserir(Object object) {
        vector.add(object);
        return true;
    }

    @Override
    public Object removerTopo() {
        Object obj;
        obj = vector.get(vector.size()-1);
          if (estaVazio()){      
            throw new NullPointerException("Posicao indisponivel.");
        } else{ 
            vector.remove(vector.size()-1);
            return "O elemento removido foi o: "+obj;
        }
    }

    @Override
    public Object verificarTopo() {
         if(estaVazio()) {
            throw new NullPointerException("Posicao indisponivel.");
        }else{
            return vector.get(vector.size()-1);
    }
    }

    @Override
    public boolean estaVazio() {
        return vector.size()<0;
    }

    @Override
    public int pesquisar(Object object) {
          if (estaVazio()) {
            throw new NullPointerException("Posicao indisponivel");
        } else if(vector.contains(object)){
            return vector.indexOf(object)+1;
        }
        return -1;
    }
       public int elementos(){
        return vector.size();
    }

    @Override
    public String toString() {
        return "{" + "vector=" + vector + '}';
    }
       
       
}
