package codigo;

import static java.lang.String.valueOf;

/**
 *
 * @author bea
 */
public class Prestamo {
    private int id_prestamo;
    private int codigo_material;
    private int num_socio;
    private String fecha_prestamo;
    private String fecha_limite;
    private String fecha_devolucion;
    private boolean devuelto;

    public Prestamo(int id_prestamo, int codigo_material, int num_socio, String fecha_prestamo, String fecha_limite, String fecha_devolucion, boolean devuelto) {
        this.id_prestamo = id_prestamo;
        this.codigo_material = codigo_material;
        this.num_socio = num_socio;
        this.fecha_prestamo = fecha_prestamo;
        this.fecha_limite = fecha_limite;
        this.fecha_devolucion = fecha_devolucion;
        this.devuelto=devuelto;
    }

    public int getId_prestamo() {
        return id_prestamo;
    }

    public void setId_prestamo(int id_prestamo) {
        this.id_prestamo = id_prestamo;
    }

    public int getCodigo_material() {
        return codigo_material;
    }

    public void setCodigo_material(int codigo_material) {
        this.codigo_material = codigo_material;
    }

    public int getNum_socio() {
        return num_socio;
    }

    public void setNum_socio(int num_socio) {
        this.num_socio = num_socio;
    }

    public String getFecha_prestamo() {
        return fecha_prestamo;
    }

    public void setFecha_prestamo(String fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }

    public String getFecha_limite() {
        return fecha_limite;
    }

    public void setFecha_limite(String fecha_limite) {
        this.fecha_limite = fecha_limite;
    }

    public String getFecha_devolucion() {
        return fecha_devolucion;
    }

    public void setFecha_devolucion(String fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    public boolean isDevuelto() {
        return devuelto;
    }

    public void setDevuelto(boolean devuelto) {
        this.devuelto = devuelto;
    }

    
    @Override
    public String toString() {
        return  valueOf(id_prestamo);
    }
    
    
    
}
