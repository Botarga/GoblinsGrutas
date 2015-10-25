package files;

import java.util.*;
import goblinsgrutas.*;
import java.io.*;
import java.nio.file.Paths;

/**
 *
 * @author botarga
 */
public class FileLoader {
    public static Personaje leerPersonaje(String r){
        Personaje p = null;
        String path = "personajes/" + r;
        String linea;
        String[] data;
        String[] dataBon;
        String nombre, raza, profesion;
        int[] dat = new int[12];
        List<Equipo> equipo = new ArrayList<>();
        List<Bono> bonoAux;
        List<Habilidad> habilidades = new ArrayList<>();
        
        try(BufferedReader bf = new BufferedReader(new FileReader(path))){
            nombre = bf.readLine();
            raza = bf.readLine();
            profesion = bf.readLine();
            for(int i = 0; i < dat.length; i++)
                dat[i] = Integer.parseInt(bf.readLine());
            for(int i = 0; i < Main.habilidades.length; i++)
                habilidades.add(new Habilidad(Main.habilidades[i], dat[i+5]));
            
            
            if((linea = bf.readLine()).compareTo("<") != 0){
                System.err.println("Error en formato de personaje");
                return p;
            }
            do{
                linea = bf.readLine();
                bonoAux = new ArrayList<>();
                if(linea.compareTo(">") != 0){
                    //Leer equipo
                    data = linea.split(";");
                  
                    //Leer bonos
                    dataBon = bf.readLine().split(";");
                    for(int i = 0; i < dataBon.length - 1; i+=2)
                        bonoAux.add(new Bono(dataBon[i]
                            , Integer.parseInt(dataBon[i+1])));
                    equipo.add(new Equipo(data[0], data[1], bonoAux));               
                }
            }while(linea.compareTo(">") != 0);
            p = new Personaje(nombre, raza, profesion, dat[0], dat[1], dat[2]
                    , dat[3], dat[4], habilidades, equipo);
            
        }catch(FileNotFoundException e){
            System.err.println("El fichero " + path + " no existe");
            System.err.println("Error: " + e.getMessage());
        }catch(IOException e){
            System.err.println("Error: " + e.getMessage());
        }
        
        return p;
    }
    
    public static List<Personaje> recargarPersonajes(){
        List<Personaje> r = new ArrayList<>();
        
        return r;
    }

}
