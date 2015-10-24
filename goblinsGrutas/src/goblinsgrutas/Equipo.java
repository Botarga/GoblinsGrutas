package goblinsgrutas;

/**
 *
 * @author botarga
 */
public class Equipo {
    private String nombre;
    private String descripcion;
    private int bonificacionAtaque;
    private String bonHabilidad;
    private int valorBonHabilidad;
    private int penAtaque;
    private int valorPenHabilidad;
    private String penHabilidad;
    
    private Equipo(String nombre, String descripcion, int bonificacionAtque
            , String bonHabilidad, int valorBonHabilidad, int penAtaque
            , int valorPenHabilidad, String penHabilidad){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.bonificacionAtaque = bonificacionAtaque;
        this.bonHabilidad = bonHabilidad;
        this.valorBonHabilidad = valorBonHabilidad;
        this.penAtaque = penAtaque;
        this.valorPenHabilidad = valorPenHabilidad;
        this.penHabilidad = penHabilidad;
    }
}
