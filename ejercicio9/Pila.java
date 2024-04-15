package ejercicio9_guia6;

import javax.swing.JOptionPane;

public class Pila {

    private Nodo UltimoValorIngresado;

    int size = 0;
    String Lista = "";
    
    public Pila(){
        UltimoValorIngresado = null;
        size = 0;
    }

    public void insertarNodo(int nodo){

        Nodo nuevoNodo = new Nodo(nodo);

        nuevoNodo.next = UltimoValorIngresado;
        UltimoValorIngresado = nuevoNodo;
        size++;
    }

    public int eliminarNodo(){

        int auxiliar = UltimoValorIngresado.dato;
        UltimoValorIngresado = UltimoValorIngresado.next;
        size--;

        return auxiliar;
    }

    public void mostrarPila(){

        Nodo recorrer = UltimoValorIngresado;
        //recorrer elementos
        while(recorrer!=null){

            Lista +=recorrer.dato + "\n";
            recorrer = recorrer.next;
        }

        JOptionPane.showMessageDialog(null, Lista);

        Lista = "";
    }

    public boolean estaVacia(){
        return UltimoValorIngresado == null;
    }

}
