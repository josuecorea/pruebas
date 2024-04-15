package ejercicio8;

public class Pila {

    private Nodo ultimoValorIngresado;

    int size = 0;
    String Lista = "";

    public Pila(){
        ultimoValorIngresado = null;
        size = 0;
    }

    public boolean estaVacio(){
        return ultimoValorIngresado == null;
    }

    public void insertarNodo(int nodo){

        Nodo nuevoNodo = new Nodo(nodo);

        nuevoNodo.next = ultimoValorIngresado;
        ultimoValorIngresado = nuevoNodo;

        size++;
    }

    public boolean esValido(int elemento) {
        // Si la pila está vacía, cualquier elemento es válido.
        if (estaVacio()) {
            return true;
        }
        // Si el elemento es mayor o igual al dato del último nodo ingresado,
        // entonces es válido.
        return ultimoValorIngresado.dato <= elemento;
    }

}
