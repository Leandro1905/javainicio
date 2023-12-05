
import java.io.*;

public class Archivo {

    public void leer(String earchivo, String sarchivo, String servidor) {

        String linea="";

        try {

            BufferedReader br = new BufferedReader(new FileReader(earchivo));
            BufferedWriter bw = new BufferedWriter(new FileWriter(sarchivo));

            linea = br.readLine();
            while(linea != null) {
                String[] vec = linea.split(",");
                int pos = vec[2].indexOf(servidor);
                if(pos != -1) {
                    bw.write(vec[1] + " - " + vec[2]);
                    bw.newLine();
                    //System.out.println(vec[1] + " - " + vec[2]);
                }
                //System.out.println(linea);
                linea = br.readLine();
            }
            bw.close();
            br.close();
        }catch(Exception ex) {

        }
    }
}
