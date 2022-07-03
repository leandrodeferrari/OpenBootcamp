package ejerciciostema9.entidades;

public class Trabajador extends Persona {
    
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "salario=" + salario + super.toString() + '}';
    }
    
}
