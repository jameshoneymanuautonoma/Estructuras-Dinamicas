/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArbolesBi;

/**
 *
 * @author james
 */
public class NodArbolBina {

    private int dato;
    private NodArbolBina derecha;
    private NodArbolBina izquierda;

    public NodArbolBina(int dato) {
        this.dato = dato;
        this.derecha = null;
        this.izquierda = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodArbolBina getDerecha() {
        return derecha;
    }

    public void setDerecha(NodArbolBina derecha) {
        this.derecha = derecha;
    }

    public NodArbolBina getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(NodArbolBina izquierda) {
        this.izquierda = izquierda;
    }

}
