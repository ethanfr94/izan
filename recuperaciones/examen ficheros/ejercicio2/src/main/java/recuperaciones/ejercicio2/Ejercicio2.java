/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recuperaciones.ejercicio2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Izan Franco Anduaga
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        File f = new File(args[0]);        
        File d = new File("datos.txt");
        String texto = "";
        
        try (BufferedReader br = new BufferedReader(new FileReader(f)); BufferedWriter bw = new BufferedWriter(new FileWriter(d));) {
            texto = br.readLine();
            StringTokenizer st = new StringTokenizer(texto, "*");
            while (st.hasMoreTokens()) {
                String linea = st.nextToken();
                System.out.println(linea);
                bw.write(linea);
                bw.newLine();
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejercicio2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio2.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        f.delete();
        d.renameTo(f);
        
        
    }
}
