/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.estructurasdinamicas;

/**
 *
 * @author james Honeyman
 */
import ListaEnlaceSimple.ListSimple;
import ListaEnlaceDoble.ListEnlaceDoble;
import Colas.ImpColas;
import Pilas.ImpPilas;
import ArbolesBi.ArbolBin;

public class EstructurasDinamicas {

    public static void main(String[] args) {
        ListSimple lista_simple = new ListSimple();
        //Entrada funciones listas simples

        lista_simple.InsertaInicio(3);
        lista_simple.InsertaInicio(8);
        lista_simple.InsertaInicio(7);
        lista_simple.InsertaFin(140);
        lista_simple.InsertaInicio(7);
        lista_simple.InsertaFin(-150);
        lista_simple.insertaPosicion(8000, 2);
        System.out.println("=================================================");
        System.out.println("Lista enlazada:");
        lista_simple.imprimirLista();
        lista_simple.EliminaElemento(2);
        System.out.println("=================================================");
        System.out.println("Despues de eliminar el elemento en la posicion 2:");
        lista_simple.imprimirLista();
        lista_simple.EditaElemento(1, 99);
        System.out.println("=================================================");
        System.out.println("Despues de editar el elemento en la posicion 1:");
        lista_simple.imprimirLista();
       

        //Salidas funciones listas simples
        ListEnlaceDoble lista_doble = new ListEnlaceDoble();
        // Entradas funciones listas docbles

        lista_doble.InsertaInicio(2);
        lista_doble.InsertaInicio(4);
        lista_doble.InsertaInicio(6);
        lista_doble.InsertaInicio(8);
        lista_doble.InsertaFin(40);
        lista_doble.InsertaFin(200);
        lista_doble.imprimirListaInicioFin();
        lista_doble.insertaPosicion(800, 0);
        lista_doble.insertaPosicion(100, 3);
        lista_doble.insertaPosicion(1900, 6);
        lista_doble.imprimirListaInicioFin();
 
        System.out.println(lista_doble.CuentaElementos());
        lista_doble.EliminaElemento(0);
        lista_doble.EliminaElemento(3);
        lista_doble.imprimirListaInicioFin();
        System.out.println("=================================================");
        System.out.println("Despues de eliminar elementos:");
        lista_doble.imprimirListaInicioFin();
        lista_doble.EditaElemento(1, 99);
        lista_doble.EditaElemento(2, 199);
        System.out.println("=================================================");
        System.out.println("Despues de editar elementos:");
        lista_doble.imprimirListaInicioFin();
        
        System.out.println(lista_doble.CuentaElementos());
        System.out.println("=================================================");

        //Salidas funciones listas docbles
        ImpPilas p = new ImpPilas();
        //Entradas funciones colas

        p.AgregaElemento(11);
        p.AgregaElemento(15);
        p.AgregaElemento(10);
        p.MuestraPila();
        p.MuestraElementoArriba();

        //Salidas funciones pilas        
        ImpColas c = new ImpColas();
        //Entradas  funciones pilas

        c.AgregaElemento(15);
        c.AgregaElemento(12);
        c.AgregaElemento(10);
        c.MuestraCola();
        c.MuestraPrimerElemento();

        //Salidas funciones pilas        
        ArbolBin ab = new ArbolBin();
        ab.Arbolestatico();

    }
}
