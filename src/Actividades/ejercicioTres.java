package Actividades;

import java.util.Scanner;

public class ejercicioTres {

    public static void main(String[] args) {
        //3. Hacer el punto anterior con switch. Se deberá ingresar el carácter “s” para sumar, “r” para restar, “m” para multiplicar y “d” para dividir.

        //Scanner para ingresar numeros
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        int var1 = scanner.nextInt();

        System.out.println("Ingrese el segundo numero");
        int var2 = scanner.nextInt();

        //variable para resultados
        int resultado = 0;

        System.out.println("Los números son: " + var1 + " y " + var2 + "\nSeleccione la operación a realizar:" +
                "\n s. Suma" + "\n r. Resta" + "\n m. Multiplicación" + "\n d. División" + "\nIngrese el número de la operación: ");

        String opcion = scanner.next();

        switch (opcion){
            case "s":
                resultado = var1 + var2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;

            case "r":
                resultado = var1 - var2;
                System.out.println("El resultado de la a resta es: " + resultado);
                break;

            case "m":
                resultado = var1 * var2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;

            case "d":
                resultado = var1 / var2;
                System.out.println("El resultado de la division es: " + resultado);
                break;
            }
        }
    }
