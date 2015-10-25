package goblinsgrutas;

import files.FileLoader;
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
    private static List<Personaje> personajes = new ArrayList<>();
    
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
    
    
    public static void mostrarPersonajes(){
        int opcion;
        boolean salir = false;
        
        do{
            clearConsole();
            System.out.println("Elige el personaje que quieres ver");
            for(int i = 0; i < personajes.size(); i++)
                System.out.println("\t" + (i+1) + " " + personajes.get(i).getNombre());
            System.out.println("\t0 Volver");
            
            opcion = readInt("Introduce una opcion");
            if(opcion == 0)
                salir = true;
            else{
                if(opcion > personajes.size() || opcion < 0)
                    System.out.println("Numero incorrecto");
                else
                    personajes.get(opcion-1).mostrarInfo();
            }
            
        }while(!salir);
    }
    
    
    public static void gestionPersonajesMenu(){
        int opcion;
        boolean salir = false;
        
        do{
            clearConsole();
        
            System.out.println("Menu de gestión de personajes");
            System.out.println("1 Cargar personaje de fichero");
            System.out.println("2 Recargar personajes");
            System.out.println("3 Guardar personajes en un directorio");
            System.out.println("4 Mostrar información de un personaje");
            System.out.println("0 Volver");
            
            opcion = readInt("Introduce una opcion: ");
            
            switch(opcion){
                case 0:
                    salir = true;
                    break;
                    
                case 1:
                    Personaje pAux = FileLoader.leerPersonaje(
                        readString("Introduce el nombre del personaje " + 
                            "\"nombre.txt\": "));
                    if(pAux != null){
                        System.out.println("Personaje Cargado!");
                        personajes.add(pAux);
                    }
                    pauseToKey();
                    
                    break;
                    
                case 2:
                    personajes = FileLoader.recargarPersonajes();
                    break;
                    
                case 3:
                    FileLoader.guardarPersonajes(personajes);
                    break;
                    
                case 4:
                    mostrarPersonajes();
                    break;
                    
                default:
                    break;                               
            }
        }while(!salir);
    }
    
    
    public static void pauseToKey(){
        readString("Pulsa INTRO para continuar...");
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
