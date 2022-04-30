package ventanas;

import javax.swing.JOptionPane;

public class Cola {

    private Nodo inicioCola, finalCola;
    String cola = "";

    public Cola() {
        inicioCola = null;
        finalCola = null;
    }

    //Método para saber si la cola esta vacia
    public boolean colaVacia() {
        if (inicioCola == null) {
            return true;
        } else {
            return false;
        }
    }

    //Método para insertar dato a la cola
    public void insertar(int informacion) {
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.informacion = informacion;
        nuevoNodo.siguiente = null;

        if (colaVacia()) {
            inicioCola = nuevoNodo;
            finalCola = nuevoNodo;
        } else {
            finalCola.siguiente = nuevoNodo;
            finalCola = nuevoNodo;
        }
    }

    //Metodo para extraer dato en la cola
    public int Extraer() {
        if (!colaVacia()) {
            int informacion = inicioCola.informacion;

            if (inicioCola == finalCola) {
                inicioCola = null;
                finalCola = null;

            } else {
                inicioCola = inicioCola.siguiente;
            }
            return informacion;
        } else {
            return Integer.MAX_VALUE;
        }
    }

    //Método para mostrar contenido de la cola min9:22
    public String mostrarContenido() {
        Nodo recorrido = inicioCola;
        String colaInvertida = "";

        while (recorrido != null) {
            cola += recorrido.informacion + " ";
            recorrido = recorrido.siguiente;
        }

        String cadena[] = cola.split(" ");

        for (int i = 0; i <= cadena.length - 1; i++) {
            colaInvertida += " " + cadena[i];
        }
        cola = "";
        return colaInvertida;
    }
}
