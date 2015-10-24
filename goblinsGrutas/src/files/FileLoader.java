package files;

import java.util.*;
import goblinsgrutas.Personaje;
import java.io.*;

/**
 *
 * @author botarga
 */
public class FileLoader {
    public static Personaje leerPersonaje(String path){
        Personaje p = null;
        
        try(BufferedReader bf = new BufferedReader(new FileReader(path))){
            
        }catch(IOException e){
            System.err.println("Error: " + e.getMessage());
        }
        
        return p;
    }
}
