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

    private Nodo headNode;
    private Nodo tailNode;
    private Nodo tempPtr;
    private int size;

    public CirculeDoubleListPeliculas() {
        this.headNode = null;
        this.tailNode = null;
        this.size = 0;
    }

    public void insertInOrder(Pelicula pelicula) {
        Nodo newPtr = new Nodo();
        Nodo tempPtr = this.getHeadNode();
        newPtr.setDato(pelicula);
        while (tempPtr != null && tempPtr.getDato().getTitle().compareTo(newPtr.getDato().getTitle()) < 0) {
            if (tempPtr == this.getTailNode()) {
                break;
            }//if para saber si llego al final de la lista
            tempPtr = tempPtr.getNext();
        }//while para recorrer la lista
        //preguntar porque se detuvo
        if (getSize() == 0) {
            this.setHeadNode(newPtr);
            this.setTailNode(newPtr);
            this.getTailNode().setNext(this.getHeadNode());
            this.getHeadNode().setPreviousPtr(this.getTailNode());
        } else {
            if (tempPtr == this.getHeadNode()) {
                if (tempPtr.getDato().getTitle().compareTo(newPtr.getDato().getTitle()) > 0) {
                    newPtr.setNext(this.getHeadNode());
                    newPtr.setPreviousPtr(this.getTailNode());
                    this.getHeadNode().setPreviousPtr(newPtr);
                    this.setHeadNode(newPtr);
                    this.getTailNode().setNext(this.getHeadNode());
                    this.getHeadNode().setPreviousPtr(this.getTailNode());
                } else {
                    newPtr.setPreviousPtr(this.getHeadNode());
                    newPtr.setNext(this.getTailNode());
                    this.getHeadNode().setNext(newPtr);
                    this.setTailNode(newPtr);
                    this.getTailNode().setNext(this.getHeadNode());
                    this.getHeadNode().setPreviousPtr(this.getTailNode());
                }//if si el nuevo nodo va antes o despues de head
            } else {
                if (tempPtr == this.getTailNode() && tempPtr.getDato().getTitle().compareTo(newPtr.getDato().getTitle()) < 0) {
                    newPtr.setPreviousPtr(this.getTailNode());
                    newPtr.setNext(this.getHeadNode());
                    this.getTailNode().setNext(newPtr);
                    this.setTailNode(newPtr);
                    this.getHeadNode().setPreviousPtr(this.getTailNode());
                    this.getTailNode().setNext(this.getHeadNode());
                } else {
                    tempPtr.getPreviousPtr().setNext(newPtr);
                    newPtr.setPreviousPtr(tempPtr.getPreviousPtr());
                    newPtr.setNext(tempPtr);
                    tempPtr.setPreviousPtr(newPtr);
                }//if para saber si el nuevo nodo va despues de tail o esta en medio de la lista
            }//if el en que posicion va el nuevo nodo
        }//if la lista esta llena o no
        this.setSize(this.getSize() + 1);
    }//fin method

    public void printList() {
        Nodo temp = this.getHeadNode();
        System.out.print(this.getTailNode().getDato().getTitle() + "<-->");
        if (this.getSize() > 0) {
            while (temp != this.getTailNode()) {
                System.out.print(temp.getDato().getTitle() + "<-->");
                temp = temp.getNext();
                if (temp == this.getTailNode()) {
                    System.out.print(temp.getDato().getTitle() + "<-->");
                }//if
            }//while
        }//if
    }//end Method

    public Nodo getHeadNode() {
        return headNode;
    }

    public void setHeadNode(Nodo headNode) {
        this.headNode = headNode;
    }

    public Nodo getTailNode() {
        return tailNode;
    }

    public void setTailNode(Nodo tail) {
        this.tailNode = tailNode;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Nodo getTempPtr() {
        return tempPtr;
    }

    public void setTempPtr(Nodo tempPtr) {
        this.tempPtr = tempPtr;
    }

    @Override
    public String toString() {
        return "CirculeDoubleListPeliculas{" + "head=" + headNode + ", tail=" + tailNode + ", node=" + tempPtr + ", size=" + size + '}';
    }

}
