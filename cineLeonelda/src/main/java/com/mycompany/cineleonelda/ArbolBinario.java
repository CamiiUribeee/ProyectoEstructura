
package com.mycompany.cineleonelda;

import javax.swing.JOptionPane;


public class ArbolBinario {
    
    // Nodo raíz del árbol binario
    private Nodo raiz;

    public ArbolBinario() {
        raiz = null;
    }

    public void insertar(Persona persona) {
        Nodo nuevoNodo = new Nodo(persona);
        if (raiz == null) {
            raiz = nuevoNodo;
        } else {
            insertarRecursivo(raiz, nuevoNodo);
        }
    }

    private void insertarRecursivo(Nodo actual, Nodo nuevoNodo) {
        // Si la edad de la persona del nuevo nodo es menor que la del nodo actual, va a la izquierda
        if (nuevoNodo.getPersona().calcularEdad() < actual.getPersona().calcularEdad()) {
            if (actual.getIzquierdo() == null) {
                actual.setIzquierdo(nuevoNodo);
            } else {
                insertarRecursivo(actual.getIzquierdo(), nuevoNodo);
            }
        }
        // Si la edad es mayor o igual, va a la derecha
        else {
            if (actual.getDerecho() == null) {
                actual.setDerecho(nuevoNodo);
            } else {
                insertarRecursivo(actual.getDerecho(), nuevoNodo);
            }
        }
    }

    public void mostrarEnOrden() {
        mostrarEnOrdenRecursivo(raiz);
    }

    private void mostrarEnOrdenRecursivo(Nodo nodo) {
        if (nodo != null) {
            mostrarEnOrdenRecursivo(nodo.getIzquierdo());
        JOptionPane.showMessageDialog(null, nodo.getPersona().getNombre() + " - Edad: " + nodo.getPersona().calcularEdad());
            mostrarEnOrdenRecursivo(nodo.getDerecho());
        }
    }

    
}
