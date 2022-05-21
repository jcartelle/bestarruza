package codigo;

import static java.lang.String.valueOf;

/**
 *
 * @author bea
 */
public class Material {
    private int codigo;
    private String nombre;
    private String categoria;
    private String fecha_compra;
    private String descripcion;
    private int unidades;

    public Material(int codigo, String nombre, String categoria, String fecha_compra, String descripcion, int unidades) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.fecha_compra = fecha_compra;
        this.descripcion = descripcion;
        this.unidades = unidades;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(String fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return valueOf(codigo);
    }
    
    
    
    
}
