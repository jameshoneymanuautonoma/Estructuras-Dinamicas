package ArbolesBi;
public class ArbolBin {
    NodArbolBina hoja;
    
    public ArbolBin(){
        hoja = null;
        }

    public NodArbolBina getHoja() {
        return hoja;
        }

    public void setHoja(NodArbolBina hoja) {
        this.hoja = hoja;
        }
     
    public void Arbolestatico(){
        NodArbolBina raiz = new NodArbolBina(1);
        raiz.setIzquierda(new NodArbolBina(2));
        raiz.setDerecha(new NodArbolBina(3));
        raiz.getIzquierda().setIzquierda(new NodArbolBina(4));
        raiz.getIzquierda().setDerecha(new NodArbolBina(5));
        raiz.getDerecha().setIzquierda(new NodArbolBina(6));
        raiz.getDerecha().setDerecha(new NodArbolBina(7));
        RecorreInOrden(raiz);
        System.out.println("");
        RecorrePreOrden(raiz);
      
        }

    public void RecorreInOrden(NodArbolBina hoja){
        if (hoja != null){
            RecorreInOrden(hoja.getIzquierda());
            System.out.print(hoja.getDato() + " ");
            RecorreInOrden(hoja.getDerecha());            
            }
        }

    public void RecorrePreOrden(NodArbolBina hoja){
        if (hoja != null){
            System.out.print(hoja.getDato() + " ");
            RecorrePreOrden(hoja.getIzquierda());
            RecorrePreOrden(hoja.getDerecha());            
            }
        }

  
    
    }