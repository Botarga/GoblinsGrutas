
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

    /*-----GETTER------*/
    public String getNombre() {
        return nombre;
    }  
    public int getValor() {
        return valor;
    }  
    @Override
    public String toString(){
        return "(" + valor + ") " + nombre;
    }
}
