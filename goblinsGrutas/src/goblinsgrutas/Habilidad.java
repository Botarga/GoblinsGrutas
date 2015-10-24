
package goblinsgrutas;

/**
 *
 * @author botarga
 */
public class Habilidad {
    private String nombre;
    private int valor;
    
    public Habilidad(String nombre, int valor){
        this.nombre = nombre;
        this.valor = valor;
    }
    
    @Override
    public String toString(){
        return nombre + ": " + valor;
    }
}
