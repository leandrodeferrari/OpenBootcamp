package ejerciciostema8;

import ejerciciostema8.entidades.Persona;

public class EjerciciosTema8 {

    public static void main(String[] args) {
        
        /*
        
        Crear clase Persona.
        Crear variables privadas edad, nombre y telefono de la clase Persona.
        Crear gets y sets de cada propiedad.
        Crear un objeto persona en el main.
        Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, 
        por último muéstralas por consola.
        
        */
        
        Persona persona = new Persona();
        
        persona.setEdad(29);
        persona.setNombre("Leandro");
        persona.setTelefono("3345-6787");
        
        System.out.println("Nombre: " + persona.getNombre() +", Edad: " + persona.getEdad() 
                + " Teléfono: " + persona.getTelefono());
        
    }
    
}
