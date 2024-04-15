package ejercicio8_guia6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pila miPila = new Pila();

        System.out.println("Ingrese 10 elementos para la pila (deben ser ingresados de menor a mayor):");

        for (int i = 0; i < 10; i++) {

            System.out.print("Elemento " + (i + 1) + ": ");
            int elemento = scanner.nextInt();

            if (miPila.esValido(elemento)) {

                miPila.insertarNodo(elemento);

                System.out.println("Elemento añadido a la pila.");

            } else {

                System.out.println("El elemento debe ser mayor o igual al último elemento apilado.");
                i--; // Para permitir al usuario ingresar el elemento nuevamente

            }
        }
    }
}
