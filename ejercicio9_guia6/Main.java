package ejercicio9_guia6;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        
        int opcion = 0, nodo = 0;
        int prueba = 0; //donde se guarda el ultimo dato eliminado

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
                            int anterior = prueba; // Guardar el valor de prueba como el nodo anterior
                            int actual = miPila.eliminarNodo();
                            System.out.println("Valor anterior: " + anterior); //para verificar 
                            System.out.println("Valor de actual: " + actual); //para verificar x2
                            prueba = actual; // Actualizar el valor de prueba con el nodo actual
                            if (anterior == 0 || actual <= anterior) {
                                JOptionPane.showMessageDialog(null, "Se elimina: " + actual);
                            } else {
                                JOptionPane.showMessageDialog(null, "No se puede eliminar el dato " + actual);
                                miPila.insertarNodo(actual); // Volvet a insertar el dato
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
