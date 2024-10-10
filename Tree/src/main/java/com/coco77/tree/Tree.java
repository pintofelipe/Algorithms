package com.coco77.tree;

public class Tree {

    static Nodo raiz;
    static Nodo parent;
    static Nodo tem;

    public static void main(String[] args) {
        
        int data[] = {45,30,10,20,12,32,50,18,99};
        
        for (int i : data) {
            InserCode(i);
        }
        
        inorden(raiz);
    }

    public static void InserCode(int value) {
        
        if (raiz == null) {   
            raiz = new Nodo(value);
            return;
        }

        tem = raiz;
        parent = null;

        while (tem != null) {
            parent = tem; 

            if (value < tem.getValue()) {
                tem = tem.getIzq();
            } else {
                tem = tem.getDer();
            }
        }

        Nodo nuevoNodo = new Nodo(value);
        nuevoNodo.setParent(parent);  

        if (value < parent.getValue()) {
            parent.setIzq(nuevoNodo); 
        } else {
            parent.setDer(nuevoNodo);  
        }
    }

    
    public static void inorden(Nodo value) {
        if (value != null) {
            inorden(value.getIzq());
            value.imprimirDato();
            inorden(value.getDer());
        }
    }
    
}