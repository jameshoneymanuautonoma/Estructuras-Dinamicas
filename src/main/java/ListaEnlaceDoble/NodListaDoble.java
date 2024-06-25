/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaEnlaceDoble;

/**
 *
 * @author james
 */
public class NodListaDoble {

    private int dato;
    private NodListaDoble siguiente;
    private NodListaDoble anterior;

    public NodListaDoble(int dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodListaDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodListaDoble siguiente) {
        this.siguiente = siguiente;
    }

    public NodListaDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodListaDoble anterior) {
        this.anterior = anterior;
    }

}
