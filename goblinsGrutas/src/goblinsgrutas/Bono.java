
package goblinsgrutas;

/**
 *
 * @author botarga
 */
public class Bono {
    public String nombre;
    public int valor;
    
    public Bono (String nombre, int valor){
        this.nombre = nombre;
        this.valor = valor;
    }
    
    @Override
    public String toString(){
        return "(" + valor + ") " + nombre;
    }
}
