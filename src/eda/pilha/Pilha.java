package eda.pilha;

import eda.pilha.InterfacePilha;
import java.util.ArrayList;



public class Pilha implements InterfacePilha {
    ArrayList arrayList = new ArrayList(10);

    public Pilha() {
        
    }

    @Override
    public boolean inserir(Object object) {
        arrayList.add(object);
        return true;
    }

    @Override
    public Object removerTopo() throws NullPointerException {
        Object obj;
        obj = arrayList.get(arrayList.size()-1);
        if (estaVazio()){      
            throw new NullPointerException("Posicao indisponivel.");
        } else{ 
            arrayList.remove(arrayList.size()-1);
            return obj;
        }
   }

    @Override
    public Object verificarTopo( ) throws NullPointerException {
        if(estaVazio()) {
            throw new NullPointerException("Posicao indisponivel.");
        }else{
            return arrayList.get(arrayList.size()-1);
    }
    }

    @Override
    public boolean estaVazio() {
        return arrayList.size() < 0;
    }

    @Override
    public int pesquisar(Object object) throws NullPointerException {
        if (estaVazio()) {
            throw new NullPointerException("Posicao indisponivel");
        } else if(arrayList.contains(object)){
            return arrayList.indexOf(object)+1;
        }
        return -1;
   }
    
    public int elementos(){
        return arrayList.size();
    }
    
    @Override
    public String toString(){
        return "Pilha " + arrayList;
    }
}