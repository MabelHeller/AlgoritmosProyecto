/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author Heller
 */
public class Nodo {

    private Pelicula dato;
    private Nodo next;
    private Nodo previousPtr;
    private int size;

    public Nodo() {
        this.dato = new Pelicula();
        this.next = null;
        this.previousPtr = null;
        this.size=0;
    }
    
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Nodo getPreviousPtr() {
        return previousPtr;
    }

    public void setPreviousPtr(Nodo previousPtr) {
        this.previousPtr = previousPtr;
    }

    public Pelicula getDato() {
        return dato;
    }

    public void setDato(Pelicula dato) {
        this.dato = dato;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

     
}
