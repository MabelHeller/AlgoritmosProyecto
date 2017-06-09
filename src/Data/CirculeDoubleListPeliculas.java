/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Domain.Nodo;
import Domain.Pelicula;

/**
 *
 * @author Heller
 */
public class CirculeDoubleListPeliculas {

    private Nodo head;
    private Nodo tail;
    private Nodo node;
    private int size;

    public CirculeDoubleListPeliculas() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }//constructor

    public void insertInOrder(Pelicula pelicula) {
        Nodo newPtr = new Nodo();
        Nodo node = this.getHead();
        newPtr.setDato(pelicula);
        while (node != null && node.getDato().getTitle().compareTo(newPtr.getDato().getTitle()) < 0) {
            if (node == this.getTail()) {
                break;
            }//if para saber si llego al final de la lista
            node = node.getNext();
        }//while para recorrer la lista
        //preguntar porque se detuvo
        if (getSize() == 0) {
            this.setHead(newPtr);
            this.setTail(newPtr);
            this.getTail().setNext(this.getHead());
            this.getHead().setPreviousPtr(this.getTail());
        } else {
            if (node == this.getHead()) {
                if (node.getDato().getTitle().compareTo(newPtr.getDato().getTitle()) > 0) {
                    newPtr.setNext(this.getHead());
                    newPtr.setPreviousPtr(this.getTail());
                    this.getHead().setPreviousPtr(newPtr);
                    this.setHead(newPtr);
                    this.getTail().setNext(this.getHead());
                    this.getHead().setPreviousPtr(this.getTail());
                } else {
                    newPtr.setPreviousPtr(this.getHead());
                    newPtr.setNext(this.getTail());
                    this.getHead().setNext(newPtr);
                    this.setTail(newPtr);
                    this.getTail().setNext(this.getHead());
                    this.getHead().setPreviousPtr(this.getTail());
                }//if si el nuevo nodo va antes o despues de head
            } else {
                if (node == this.getTail() && node.getDato().getTitle().compareTo(newPtr.getDato().getTitle()) < 0) {
                    newPtr.setPreviousPtr(this.getTail());
                    newPtr.setNext(this.getHead());
                    this.getTail().setNext(newPtr);
                    this.setTail(newPtr);
                    this.getHead().setPreviousPtr(this.getTail());
                    this.getTail().setNext(this.getHead());
                } else {
                    node.getPreviousPtr().setNext(newPtr);
                    newPtr.setPreviousPtr(node.getPreviousPtr());
                    newPtr.setNext(node);
                    node.setPreviousPtr(newPtr);
                }//if para saber si el nuevo nodo va despues de tail o esta en medio de la lista
            }//if el en que posicion va el nuevo nodo
        }//if la lista esta llena o no
        this.setSize(this.getSize() + 1);
    }//fin method
    
  
    public void printList() {
        Nodo temp = this.getHead();
        System.err.print(this.getTail().getDato().getTitle() + "<-->");
        if (this.getSize() > 0) {
            while (temp != this.getTail()) {
                System.err.print(temp.getDato().getTitle() + "<-->");
                temp = temp.getNext();
                if (temp == this.getTail()) {
                    System.err.print(temp.getDato().getTitle() + "<-->");
                }//if
            }//while
        }//if
    }//end Method

    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    public Nodo getTail() {
        return tail;
    }

    public void setTail(Nodo tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Nodo getNode() {
        return node;
    }

    public void setNode(Nodo node) {
        this.node = node;
    }

    @Override
    public String toString() {
        return "CirculeDoubleListPeliculas{" + "head=" + head + ", tail=" + tail + ", node=" + node + ", size=" + size + '}';
    }

}
