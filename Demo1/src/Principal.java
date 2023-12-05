public class Principal {

    public static void main(String[] args) {

        String a = "PERRITO CUIDADO CON EL PERRITO";
        String b = "Perrito";
        a = a.toUpperCase();
        b = b.toUpperCase();

        int v1 = a.indexOf(b);
        System.out.println(v1);

        int v2 = a.lastIndexOf(b);
        System.out.println(v2);

        int v3 = a.indexOf("GATITO");
        System.out.println(v3);

        String c = "CUIDADO,CON,EL,MOSQUITO";
        String[] vec = c.split(",");

        for(String dato:vec) {
            System.out.println(dato);
        }

    }
}
