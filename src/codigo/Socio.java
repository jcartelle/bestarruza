package codigo;

import static java.lang.String.valueOf;

/**
 * 
 * @author bea
 */
public class Socio {
    private int num_socio;
    private String dni;
    private String nombre;
    private String apellido;
    private String email;
    private String fecha_nacimiento;
    private int telefono;
    private String direccion;
    private int junta_directiva;

    public Socio(int num_socio, String dni, String nombre, String apellido, String email, String fecha_nacimiento, int telefono, String direccion, int junta_directiva) {
        this.num_socio = num_socio;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.fecha_nacimiento = fecha_nacimiento;
        this.telefono = telefono;
        this.direccion = direccion;
        this.junta_directiva=junta_directiva;
    }
    
    public Socio(int num_socio, String dni, String nombre, String apellido, String email, String fecha_nacimiento, int telefono, String direccion) {
        this.num_socio = num_socio;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.fecha_nacimiento = fecha_nacimiento;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    
        public Socio(int num_socio, String dni, String nombre, String apellido) {
        this.num_socio = num_socio;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        
    }


    public int getNum_socio() {
        return num_socio;
    }

    public void setNum_socio(int num_socio) {
        this.num_socio = num_socio;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getJunta_directiva() {
        return junta_directiva;
    }

    public void setJunta_directiva(int junta_directiva) {
        this.junta_directiva = junta_directiva;
    }

    
    @Override
    public String toString() {
        return dni+" - "+nombre+" "+apellido;
    }
    

}
