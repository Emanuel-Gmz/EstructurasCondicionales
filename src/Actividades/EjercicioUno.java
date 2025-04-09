package Actividades;

public class EjercicioUno {
    public static void main(String[] args) {
        //1. Declarar e iniciar 3 variables enteras y comparar cuál  de las 3 es la mayor.
        int var1 = 100;
        int var2 = 200;
        int var3 = 300;

        if (var1 > var2 && var1 > var3){


        System.out.println("La primer variable es mayor");

        }else if (var2 > var1 && var2 > var3) {

            System.out.println("La segunda variable es mayor");

        }else System.out.println("La tercer variable es mayor");
        //A no ser que se cambien los valores, siempre se ejercutará else


    }//fin del main
}//fin de la clase