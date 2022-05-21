package codigo;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;

/**
 *
 * @author bea
 */

/**
 * La clase ImagenFondo servirá para añadir una imagen de fondo a un formulario o ventana de diálogo, en este caso se utilizará para la ventana de Login. Hereda de JLayeredPane para que sean visibles los componentes que se añaden encima del panel, tales como cajas de texto o botones. 
*/

public class ImagenFondo extends JLayeredPane{

     //Se declara el string ruta de la imagen de fondo para poder usar esta misma clase para poner fondo a diferentes ventanas con diferentes imagenes
    
     private String ruta="";
     private Image imagen;

     /**
      * Constructor de la clase ImagenFondo, se le pasa la ruta de la imagen de fondo
      * @param ruta - ruta del archivo de la imagen de fondo (dentro del proyecto)
      */
    public ImagenFondo(String ruta) {
        this.ruta = ruta;
    }  
     //Método para pintar dicha imagen
     
    /**
     * Método paint() se utiliza para establecer el fondo del formulario/dlg 
     * @param g 
     */
       public void paint(Graphics g){
           imagen=new  ImageIcon(getClass().getResource(""+ruta+"")).getImage();
           
          g.drawImage(imagen, 0, 0, getWidth(),getHeight(),this);
            setOpaque(false);
            super.paint(g);
        }
}
