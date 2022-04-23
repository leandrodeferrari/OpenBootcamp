package ejerciciostema3primeraparte;

public class EjerciciosTema3PrimeraParte {

    public static void main(String[] args) {

        // Primera parte:
        // Crear una función con tres parámetros que sean números que se suman entre sí.
        // Llamar a la función en el main y darle valores.
        
        double suma = sumar3Numeros(4, 3.4, 45);

        System.out.println("Suma: " + suma);

    }

    public static double sumar3Numeros(double numero1, double numero2, double numero3) {

        return numero1 + numero2 + numero3;

    }

}
