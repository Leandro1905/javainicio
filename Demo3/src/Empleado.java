public class Empleado extends Persona {
    private float sueldo;

    public Empleado() {
    }

    public Empleado(float sueldo) {
        this.sueldo = sueldo;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
}
