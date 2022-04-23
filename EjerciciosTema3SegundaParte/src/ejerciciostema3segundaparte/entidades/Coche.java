package ejerciciostema3segundaparte.entidades;

import java.util.Scanner;

public class Coche {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private int numeroDePuertas;

    public Coche() {
    }

    public Coche(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    @Override
    public String toString() {
        return "Coche{" + "Número de puertas = " + numeroDePuertas + '}';
    }
    
    public void incrementarNumeroDePuertas(Coche coche) {

        int puertasParaAgregar;
        
        System.out.println("Ingrese el número de puertas que desea agregarle al coche");
        puertasParaAgregar = leer.nextInt();
        
        coche.setNumeroDePuertas(coche.getNumeroDePuertas() + puertasParaAgregar);        
        
    }

    public void mostrarCoche(Coche coche){
        
        System.out.println(coche);
        
    }
    
}
