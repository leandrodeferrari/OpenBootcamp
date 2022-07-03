package ejerciciostema9.entidades;

public class Cliente extends Persona {
    
    private int credito;

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    @Override
    public String toString() {
        return "Cliente{" + "credito=" + credito + super.toString() + '}';
    }
    
}
