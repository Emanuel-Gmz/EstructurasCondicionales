package Actividades;

import java.util.Scanner;

public class ejercicioDos {
    public static void main(String[] args) {
        //2. Como en el laboratorio anterior, declarar 2 variables que permitan realizar operaciones básicas
        //matemáticas y mostrar el resultado en consola. Esta vez, el usuario debe poder elegir qué operación realizar.
        int var1 = 11;
        int var2 = 10;
        //creamos una variable para los resultados
        int resultado = 0;

        //ponemos un scanner para que el usuario seleccione la opcion
        Scanner scanner = new Scanner(System.in);

        //ponemos un sout para mostrar opciones de operaciones
        System.out.println("Los números son: " + var1 + " y " + var2 + "\nSeleccione la operación a realizar:" +
                "\n1. Suma" + "\n2. Resta" + "\n3. Multiplicación" + "\n4. División" + "\nIngrese el número de la operación: ");

        int opcion = scanner.nextInt();

        if (opcion == 1){
            resultado = (var1 + var2);
            System.out.printf("La suma de los números es: " + resultado);

        } else if (opcion == 2) {
            resultado = var1 - var2;
            System.out.printf("La resta de los números es: " + resultado);

        } else if (opcion == 3) {
            resultado = var1 * var2;
            System.out.printf("La multiplicación de los números es: " + resultado);

        } else if (opcion == 4) {
            //en el caso de que las variables no sean fijas, podriamos poner un bloque que controle la división
            resultado = var1 / var2;
            System.out.println("La división de los números es: " + resultado);

        } else System.out.println("Opción no válida, seleccione otra");

    }//fin del main

}//fin de la clase
