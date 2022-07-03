package ejerciciostema9;

import ejerciciostema9.entidades.Cliente;
import ejerciciostema9.entidades.Trabajador;

public class EjerciciosTema9 {

    public static void main(String[] args) {
        
        /*
        
        Crea una clase Persona con las siguientes variables:
        
        La edad 
        El nombre
        El teléfono
        
        Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva 
        clase tendrá la variable credito solo para esa clase.
        
        Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el 
        telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
        
        Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con 
        una variable salario que solo tenga la clase Trabajador.
        
        */
        
        Cliente cliente = new Cliente();
        
        cliente.setNombre("Leandro");
        cliente.setEdad(29);
        cliente.setTelefono("3456-6777");
        cliente.setCredito(234);
        
        Trabajador trabajador = new Trabajador();
        
        trabajador.setNombre("Roberto");
        trabajador.setEdad(56);
        trabajador.setTelefono("3333-4444");
        trabajador.setSalario(23456);
        
        System.out.println("Cliente = " + cliente);
        System.out.println("Trabajador = " + trabajador);
        
    }
    
}
