package goblinsgrutas;

import java.util.*;
import static java.lang.System.out;

/**
 *
 * @author botarga
 */

public class Personaje {
    private String nombre;
    private String raza;
    private String profesion;
    private int vida, fuerza, agilidad, inteligencia, carisma;
    private List<Habilidad> habilidades;
    private List<Equipo> equipos;
    
    
    
    public Personaje(String nombre, String raza, String profesion, int vida
            , int fuerza, int agilidad, int inteligencia, int carisma
            , List<Habilidad> habilidades, List<Equipo> equipos){
        this.nombre = nombre;
        this.raza = raza;
        this.profesion = profesion;
        this.vida = vida;
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.inteligencia = inteligencia;
        this.carisma = carisma;
        this.habilidades = habilidades;
        this.equipos = equipos;
    }
    
    public void mostrarInfo(){
        out.println("Nombre: " + nombre);
        out.println("Raza: " + raza);
        out.println("Profesion: " + profesion);
        out.println("Vida: " + vida);
        out.println("CARACTERISTICAS:");
        out.println("\tFuerza: " + fuerza);
        out.println("\tAgilidad: " + agilidad);
        out.println("\tInteligencia: " + inteligencia);
        out.println("\tCarisma: " + carisma);
        out.println("HABILIDADES");
        for(Habilidad a : habilidades)
            out.println("\t" + a);
        out.println("EQUIPO");
        for(Equipo e : equipos)
            out.println("\t" + e);
        
        
    }
}
