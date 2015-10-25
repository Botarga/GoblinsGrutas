package goblinsgrutas;

import files.FileLoader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import javax.xml.bind.JAXBException;

/**
 *
 * @author botarga
 */
public class Main {
    private static boolean windows;
    
    public static String[] habilidades = {
        "Combate", "Ataque", "Defensa", "Conocimientos", "Latrocinio", "Magia"
        , "Sociales"
    };
    
    public static void clearConsole(){
        if(windows)
            for(byte i = 0; i < 23; i++)
                System.out.println();
        else
            System.out.printf("\033[2J\033[H");
            
        
    }
    
    public static void main (String[] args) throws Exception{
        windows = System.getProperty("os.name").startsWith("Win");
        clearConsole();
        Personaje p = FileLoader.leerPersonaje("build/personajes/personaje1.txt");
        p.mostrarInfo();
    }
}
