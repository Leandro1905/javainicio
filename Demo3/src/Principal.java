public class Principal {
    public static void main(String[] args) {
        Persona p1 = new Persona(101, "ANA");
        System.out.println(p1.getDni());
        System.out.println(p1.getNombre());

        Empleado e1 = new Empleado();
        e1.setDni(102);;
        e1.setNombre("LUISA");
        e1.setSueldo(350000);
        System.out.println(e1.getDni());
        System.out.println(e1.getNombre());
        System.out.println(e1.getSueldo());




    }
}
