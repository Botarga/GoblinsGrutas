package goblinsgrutas;

import java.util.*;
/**
 *
 * @author botarga
 */
public class Equipo {
    private String nombre;
    private String descripcion;
    private List<Bono> bonos;
    
    public Equipo(String nombre, String descripcion, List<Bono> bonos){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.bonos = bonos;
    }
    
    @Override
    public String toString(){
        String s;
        s = nombre + ": " + descripcion + " Bonos: ";
        for(Bono b : bonos)
            s = s+b;
        return s;
    }
    /*------GETTER-----*/
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public List<Bono> getBonos() {
        return bonos;
    }
}
