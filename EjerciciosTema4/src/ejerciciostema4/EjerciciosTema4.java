package ejerciciostema4;

import java.util.Scanner;

public class EjerciciosTema4 {

    public static void main(String[] args) {

        /*
        
        En este ejercicio practicarás las estructuras de control, para ello deberás crear:
        
        1. Usando un if, crear una condición que compare si la variable numeroIf es 
        positivo, negativo, o 0.
        Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
        
        2. Crea un bucle While, este bucle tendrá que tener como condición que la variable 
        numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
        a) Incrementar el valor de la variable en uno cada vez que se ejecute.
        b) Mostrarlo por pantalla cada vez que se ejecute.
        
        3. Para el bucle Do While, deberás crear la misma estructura que en el While, pero 
        solo se debe ejecutar una vez.
        
        4. Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 
        y su condición será que la variable sea igual o menor que 3, se irá incrementando en 
        1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
        
        5. Por último, para el Switch, deberás crear la variable estacion, y distintos case para 
        las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá 
        mandar un mensaje por consola informando de la estación en la que está. También habrá 
        que poner un default para cuando el valor de la variable no sea una estación.
        
         */
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        // 1
        double numeroIf;

        System.out.println("Ingrese un número, para el if:");
        numeroIf = leer.nextDouble();

        if (numeroIf == 0) {
            System.out.println("Es cero");
        } else if (numeroIf > 0) {
            System.out.println("Es positivo");
        } else {
            System.out.println("Es negativo");
        }

        // 2
        int numeroWhile;

        System.out.println("Ingrese su número entero, para el while:");
        numeroWhile = leer.nextInt();

        while (numeroWhile < 3) {
            System.out.println("Número while: " + numeroWhile);
            numeroWhile++;
        }

        // 3
        int numeroDoWhile;

        System.out.println("Ingrese su número entero, para el do while:");
        numeroDoWhile = leer.nextInt();

        do {
            System.out.println("Numero DoWhile: " + numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile < numeroDoWhile);

        // 4
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        // 5
        int numeroEstacion;

        System.out.println("Ingrese su número entero (entre el 1 y el 4), para el switch:");
        numeroEstacion = leer.nextInt();

        switch (numeroEstacion) {
            case 1:
                System.out.println("Otoño");
                break;
            case 2:
                System.out.println("Invierno");
                break;
            case 3:
                System.out.println("Primavera");
                break;
            case 4:
                System.out.println("Verano");
                break;
            default:
                System.out.println("Número incorrecto");
        }

    }

}
