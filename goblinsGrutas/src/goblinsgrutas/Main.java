package goblinsgrutas;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author botarga
 */
public class Main {
    private static boolean windows;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private List<Personaje> personajes;
    
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
    
    
    public static void gestionPersonajesMenu(){
        int opcion;
        boolean salir = false;
        
        do{
            clearConsole();
        
            System.out.println("Menu de gestión de personajes");
            System.out.println("1 Cargar personaje de fichero");
            System.out.println("2 Crear personaje desde consola");
            System.out.println("3 Guardar personajes en un directorio");
            System.out.println("0 Volver");
            
            opcion = readInt("Introduce una opcion");
            
            switch(opcion){
                case 0:
                    salir = true;
                    break;
                    
                case 1:
                    break;
                    
                case 2:
                    break;
                    
                case 3:
                    break;
                    
                default:
                    break;               
                      
            }
        }while(!salir);
    }
    
    
    public static String readString(String question){
        String data = null;
        
        System.out.print(question);
        try {
            data = br.readLine();
        }catch(IOException e){
            System.err.println("Error: " + e.getMessage());
        }
        
        return data;
    }
    
    public static int readInt(String question){
        return Integer.parseInt(readString(question));
    }
    
    
    public static void mainMenu(){
        int opcion;
        boolean salir = false;
        
        do{
            clearConsole();
            
            System.out.println("Bienvenido al asistente de Goblins and rutas");
            System.out.println("Que quieres hacer?\n");
            System.out.println("1 Gestión de personajes");
            System.out.println("0 Salir");
            
            opcion = readInt("Introduce una opcion: ");
            
            switch(opcion){
                case 0:
                    salir = true;
                    break;
                    
                case 1:
                    gestionPersonajesMenu();
                    break;
                                      
                default:
                    break;
            }
        }while(!salir);
    }
    
    
    public static void main (String[] args) throws Exception{
        windows = System.getProperty("os.name").startsWith("Win");
        clearConsole();
        
        mainMenu();
        
        System.out.println("Hasta la proxima!");
    }
    
}
