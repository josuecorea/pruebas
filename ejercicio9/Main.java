package ejercicio9_guia6;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        
        int opcion = 0, nodo = 0;

        Pila miPila = new Pila();

        do {
            try{

                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"1. Insertar un nodo\n" 
                                    + "2. Mostrar datos de la pila\n"
                                    + "3. Elimminar dato\n" 
                                    + "4. Salir","MENU DE OPCIONES",3));

                switch(opcion){

                    case 1:

                        nodo = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero: ","INSERTANDO NUMERO",3));
                        miPila.insertarNodo(nodo);
                        break;

                    case 2:

                        miPila.mostrarPila();
                        break;
                    
                    case 3:

                        if (!miPila.estaVacia()) {

                            int anterior = miPila.eliminarNodo();

                            JOptionPane.showMessageDialog(null, "Se elimina: " + anterior);

                            int actual = miPila.eliminarNodo();

                            if (actual < anterior) {

                                JOptionPane.showMessageDialog(null, "Se elimina: " + actual);
                                anterior = actual;

                            } else {

                                JOptionPane.showMessageDialog(null, "No se puede eliminar el dato " + actual);
                                miPila.insertarNodo(actual); // Volvemos a insertar el dato
                                break;
                            }

                        } else {
                            
                            JOptionPane.showMessageDialog(null, "La pila está vacía");
                        }
                        break;

                    case 4:

                        JOptionPane.showMessageDialog(null, "\nPROGRAMA FINALIZADO");
                        break;

                    default:

                        JOptionPane.showMessageDialog(null, "\nOPCION INVALIDA");
                }
            }catch(Exception e){

                System.out.println("Error: "+ e);
            }

        } while (opcion!=4);

    }
}
