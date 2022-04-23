
package ventanas;

import javax.swing.JOptionPane;


public class Cola {
    private Nodo inicioCola, finalCola;
    String cola = "";
    
    public Cola(){
        inicioCola = null;
        finalCola = null;
    }
    
    //Método para saber si la cola esta vacia
    public boolean colaVacia(){
        if(inicioCola == null) {
            return true;
        } else {
            return false;
        }
    }
    
    //Método para insertar dato a la cola
    public void insertar(int informacion){
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
    
    //Método para mostrar contenido de la cola min9:22
    public void mostrarContenido(){
         Nodo recorrido = inicioCola;
         String colaInvertida = "";
         
         while(recorrido != null){
             cola += recorrido.informacion + " ";
             recorrido = recorrido.siguiente;
         }
         
         String cadena[] = cola.split(" ");
    
         for (int i = cadena.length -1 ; i >=0; i--){
             colaInvertida += " ";
         }
         JOptionPane.showMessageDialog(null, colaInvertida);
         cola = "";
    }
}
