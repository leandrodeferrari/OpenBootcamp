
package ejerciciostema3segundaparte;

import ejerciciostema3segundaparte.entidades.Coche;

public class EjerciciosTema3SegundaParte {

    public static void main(String[] args) {
        
        // Segunda parte:
        // Crear una clase coche.
        // Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
        // Una función que incremente el número de puertas que tiene el coche.
        // Crear un objeto miCoche en el main y añadirle una puerta.
        // Mostrar el número de puertas que tiene el objeto.
        
        Coche miCoche = new Coche(3);
        miCoche.incrementarNumeroDePuertas(miCoche);
        miCoche.mostrarCoche(miCoche);
        
    }

}
