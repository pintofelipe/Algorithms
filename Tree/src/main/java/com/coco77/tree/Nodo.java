package com.coco77.tree;

public class Nodo {
    private int value;
    private Nodo izq;
    private Nodo der;
    private Nodo parent;

    public Nodo(int value) {
        
        this.value = value;
    }
    
    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * @return the izq
     */
    public Nodo getIzq() {
        return izq;
    }

    /**
     * @param izq the izq to set
     */
    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    /**
     * @return the der
     */
    public Nodo getDer() {
        return der;
    }

    /**
     * @param der the der to set
     */
    public void setDer(Nodo der) {
        this.der = der;
    }

    /**
     * @return the parent
     */
    public Nodo getParent() {
        return parent;
    }

    /**
     * @param parent the parent to set
     */
    public void setParent(Nodo parent) {
        this.parent = parent;
    }
    
    
    public void imprimirDato() {
      System.out.print("{ "+this.getValue()+" }");
    }
    
    
}
