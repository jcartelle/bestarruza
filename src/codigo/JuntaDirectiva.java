package codigo;

/**
 * En la clase JuntaDirectiva() se crea el objeto JuntaDirectiva
 * @author bea
 */
public class JuntaDirectiva {

    /**
     * usuario_app: Atributo que establece el usuario para acceder a la aplicación. De tipo string.
     */
    private String usuario_app;
    
    /**
     * contraseña: Atributo que establece la contraseña de acceso para cada usuairo a la aplicación. De tipo string.
     */
    private String contraseña;
    /**
     * cargo: Atributo que establece el cargo que tiene cada miembro de la junta directiva de la asociación. De tipo string. El cargo es único y está asociado a una única persona. 
     */
    private String cargo;
    
    /**
     * 
     * @param cargo - String, cargo que pertenece al usuario de la aplicación
     */
    public JuntaDirectiva(String cargo){
        this.cargo=cargo;
    }
    
    /**
     * 
     * @param usuario_app - String, usuario de acceso a la aplicación
     * @param contraseña - String, constraseña asociada al usuario de acceso a la aplicación
     */
    public JuntaDirectiva(String usuario_app, String contraseña){
        this.usuario_app=usuario_app;
        this.contraseña=contraseña;
    }
        
    /**
     * Constructor de la clase JuntaDirectiva()
     * @param usuario_app - String, usuario de acceso a la aplicación
     * @param contraseña - String, constraseña asociada al usuario de acceso a la aplicación
     * @param cargo - String, cargo que pertenece al usuario de la aplicación
     */

    public JuntaDirectiva(String usuario_app, String contraseña, String cargo) {
        this.usuario_app = usuario_app;
        this.contraseña = contraseña;
        this.cargo = cargo;
    }

    /**
     * Método get para poder acceder al atributo usuario_app
     * @return String, usuario_app
     */
    public String getUsuario_app() {
        return usuario_app;
    }

    /**
     * Método set del atributo usuario_app para poder modificarlo
     * @param usuario_app - String. Único en base de datos, no se puede repetir.
     */
    public void setUsuario_app(String usuario_app) {
        this.usuario_app = usuario_app;
    }
    
     /**
     * Método get para poder acceder al atributo contraseña
     * @return String, contraseña encriptada con sha256 en base de datos
     */

    public String getContraseña() {
        return contraseña;
    }

     /**
     * Método set del atributo contrseña para poder modificarlo
     * @param contraseña - String. Encriptada con sha256 en base de datos
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

     /**
     * Método get para poder acceder al atributo cargo
     * @return String, cargo. El campo cargo es único en base de datos, no puede haber dos registros con el mismo cargo.
     */
    
    public String getCargo() {
        return cargo;
    }

     /**
     * Método set del atributo cargo para poder modificarlo
     * @param cargo - String. 
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return  cargo;
    }
    
    
    
}
