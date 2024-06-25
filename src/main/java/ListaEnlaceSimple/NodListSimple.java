/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaEnlaceSimple;

/**
 *
 * @author james
 */
public class NodListSimple {

    private int dato;
    private NodListSimple siguiente;

    public NodListSimple(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodListSimple getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodListSimple siguiente) {
        this.siguiente = siguiente;
    }

}
