package ejerciciostema9.entidades;

public abstract class Persona {
    
    protected String nombre;
    protected int edad;
    protected String telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return ", nombre=" + nombre + ", edad=" + edad + ", telefono=" + telefono;
    }
    
}
