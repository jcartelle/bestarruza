/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package codigo;

import static codigo.DlgBuscadorMaterial.modeloTabla;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import javax.swing.JTextField;
import java.sql.*;
import java.util.Base64;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author bea
 */
public class DlgModificarMaterial extends javax.swing.JDialog {
 //Establecemos color de fondo
        Color fondo= new Color(222, 237, 215 );
    /**
     * Creates new form DlgNuevoSocio
     */
    //Se crean las variables para recoger la ruta absoluta en el método de elegir imagen. 
    // Se crean en la clase para que cuando sea null en la consulta del insert no se inserte nada
    String ruta = null;
    File fichero = null;
    int codigo = 0;
    Icon iconMaterial=null;
    String nombre_material_recuperado="";
    String categoria_material_recuperado="";

    public DlgModificarMaterial(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

    }

    public DlgModificarMaterial(javax.swing.JDialog parent, boolean modal, Material material) {
        super(parent, modal);
        initComponents();
        //Pinta el formulario
        this.getContentPane().setBackground(fondo);
        
        //Cambiar icono de la barra (no se ve en linux pero si en windows
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/Logo.png")).getImage());
        
                //Centramos la ventana
        this.setLocationRelativeTo(null);

        //Declaración combo box:
        modeloCategoria = new DefaultComboBoxModel<>();

        //Ligar combo box al modelo:
        cmbCategoria.setModel(modeloCategoria);

        //Añadimos elementos al combo
        modeloCategoria.addElement("MONTAÑA");
        modeloCategoria.addElement("ESCALADA");
        modeloCategoria.addElement("CARRERAS");
        modeloCategoria.addElement("OTROS");

        recuperarMaterial(material);
        
        nombre_material_recuperado=material.getNombre();
        categoria_material_recuperado=material.getCategoria();
        
        this.setTitle("MODIFICAR - " + material.getNombre());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPopupMenu1 = new javax.swing.JPopupMenu();
        mnuiEliminar = new javax.swing.JMenuItem();
        mnuiAñadir = new javax.swing.JMenuItem();
        lblNombre = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        lblUdsDisponibles = new javax.swing.JLabel();
        lblFechaCompra = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtUdsDisponibles = new javax.swing.JTextField();
        dateFechaCompra = new com.toedter.calendar.JDateChooser();
        lblDescripcion = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDescripcion = new javax.swing.JTextArea();
        cmbCategoria = new javax.swing.JComboBox<>();
        lblImagen = new javax.swing.JLabel();

        mnuiEliminar.setText("Eliminar imagen");
        mnuiEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiEliminarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mnuiEliminar);

        mnuiAñadir.setText("Añadir imagen");
        mnuiAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiAñadirActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mnuiAñadir);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(222, 237, 215));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        lblNombre.setText("NOMBRE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(25, 25, 10, 10);
        getContentPane().add(lblNombre, gridBagConstraints);

        lblCategoria.setText("CATEGORIA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 10, 10);
        getContentPane().add(lblCategoria, gridBagConstraints);

        lblUdsDisponibles.setText("UNIDADES DISPONIBLES");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 10, 10);
        getContentPane().add(lblUdsDisponibles, gridBagConstraints);

        lblFechaCompra.setText("FECHA COMPRA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 10, 10);
        getContentPane().add(lblFechaCompra, gridBagConstraints);

        txtNombre.setMinimumSize(new java.awt.Dimension(101, 24));
        txtNombre.setPreferredSize(new java.awt.Dimension(101, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(25, 25, 10, 10);
        getContentPane().add(txtNombre, gridBagConstraints);

        txtUdsDisponibles.setMinimumSize(new java.awt.Dimension(101, 24));
        txtUdsDisponibles.setPreferredSize(new java.awt.Dimension(101, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 10, 10);
        getContentPane().add(txtUdsDisponibles, gridBagConstraints);

        dateFechaCompra.setDateFormatString("yyyy-MM-dd");
        dateFechaCompra.setPreferredSize(new java.awt.Dimension(101, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 10, 10);
        getContentPane().add(dateFechaCompra, gridBagConstraints);

        lblDescripcion.setText("DESCRIPCION");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 10, 10);
        getContentPane().add(lblDescripcion, gridBagConstraints);

        btnModificar.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        btnModificar.setText("MODIFICAR");
        btnModificar.setMaximumSize(new java.awt.Dimension(109, 35));
        btnModificar.setMinimumSize(new java.awt.Dimension(109, 35));
        btnModificar.setPreferredSize(new java.awt.Dimension(109, 35));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 25, 8);
        getContentPane().add(btnModificar, gridBagConstraints);

        btnCancelar.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setMaximumSize(new java.awt.Dimension(109, 35));
        btnCancelar.setMinimumSize(new java.awt.Dimension(109, 35));
        btnCancelar.setPreferredSize(new java.awt.Dimension(109, 35));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 25, 8);
        getContentPane().add(btnCancelar, gridBagConstraints);

        txtAreaDescripcion.setColumns(20);
        txtAreaDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtAreaDescripcion);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 10, 10);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MONTAÑA", "ESCALADA", "CARRERAS", "OTROS" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 10, 10);
        getContentPane().add(cmbCategoria, gridBagConstraints);

        lblImagen.setBackground(new java.awt.Color(186, 222, 65));
        lblImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagen (2).png"))); // NOI18N
        lblImagen.setToolTipText("Doble click para añadir imagen");
        lblImagen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lblImagen.setComponentPopupMenu(jPopupMenu1);
        lblImagen.setMaximumSize(new java.awt.Dimension(200, 250));
        lblImagen.setMinimumSize(new java.awt.Dimension(200, 250));
        lblImagen.setOpaque(true);
        lblImagen.setPreferredSize(new java.awt.Dimension(200, 250));
        lblImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImagenMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        getContentPane().add(lblImagen, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

        boolean verificarFecha(){
        java.util.Date dat = new java.util.Date();
        if(dateFechaCompra.getDate().getTime()<=dat.getTime()){
            return true;
        }
        return false;
    }
        
    public static BufferedImage decodeToImage(String imageString) {
        //Se declara esta variable para poder recuperar la imagen 
        BufferedImage image = null;

        byte[] imageByte;
//        byte[] imageDecode=null;
        try {
            Base64.Decoder decoder = Base64.getDecoder();
            //Se guarda en bytes una vez se decodifique la imagen de la BD que está en formato texto largo
            imageByte = decoder.decode(imageString);
            //Se instancia para poder leer los bytes
            ByteArrayInputStream bis = new ByteArrayInputStream(imageByte);
            //Se vuelve a covertir a imagen
            image = ImageIO.read(bis);
            bis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return image;
    }

    public static String encodeToString(BufferedImage image) {
//        String imageString = null; //Se crea la variable para guardar como string la foto una vez se convierta a texto
        //Se instancia para almacenar la salida de datos en bytes
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        //Se declara la variable para guardar en bytes la imagen una vez que se codifique
        byte[] imageEncode = null;

        try {
            //Lee las imagenes con las diferentes extensiones 
            ImageIO.write(image, "jpg", bos);
            ImageIO.write(image, "png", bos);
            ImageIO.write(image, "gif", bos);
            byte[] imageBytes = bos.toByteArray();

            Base64.Encoder encoder = Base64.getEncoder();
            //Se codifica la imagen 
            imageEncode = encoder.encode(imageBytes);

            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Devuelve la codificación de la imagen en un string para poder guardarlo en la base de datos como un texto largo
        return new String(imageEncode);
    }

    private void recuperarMaterial(Material material) {
        txtNombre.setText(material.getNombre());

//RECUPERAR IMAGEN DE LA BASE DE DATOS 
        txtUdsDisponibles.setText(String.valueOf(material.getUnidades()));
        ((JTextField) dateFechaCompra.getDateEditor().getUiComponent()).setText(material.getFecha_compra());
        txtAreaDescripcion.setText(material.getDescripcion());
        cmbCategoria.setSelectedItem(material.getCategoria());

        codigo = material.getCodigo();

        try {
            Statement stmt = Conexion.getConexion().createStatement(); //Devuelve el puntero de la BD y crea una zona de trabajo donde se puede colocar dentro la consulta
            ResultSet rs = stmt.executeQuery("SELECT IMAGEN FROM MATERIAL WHERE CODIGO='" + material.getCodigo() + "'");
            while (rs.next()) {
                String imagen_string = rs.getString(1);
//          System.out.println("'"+imagen_string+"'");

                if (imagen_string.equals("null")) {
                    System.out.println("imagen es null");
                } else {
                    BufferedImage img = decodeToImage(imagen_string);
//                System.out.println("buffer "+img);
                    ImageIcon icon = new ImageIcon(img);
                    System.out.println("icon " + icon);
                    Icon icono = new ImageIcon(icon.getImage().getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_DEFAULT));

                    lblImagen.setIcon(icono);
                }

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error recuperando la imagen de la BD");
            dispose();
        }
    }

    private boolean existeMaterial(String nombre, String categoria, String nombre_material_recuperado, String categoria_material_recuperado) {
        //Metodo para comprobar que el material no exista en la base de datos cuando damos de alta un nuevo material

        String nombreMaterial = "";
        String categoriaMaterial = "";

        try {
            //Crear un statement. Statement significa que en la conexion que tengo abierta me cree una zona de trabajo 
            Statement stmt = Conexion.getConexion().createStatement();
            //Generamos la consulta como en SQL PARA UN SELECT
            String consulta = "SELECT nombre, categoria FROM MATERIAL WHERE NOMBRE='" + nombre + "'AND CATEGORIA='" + categoria + "'";
            //Sacamos por pantalla la consulta para ver posibles errores
            System.out.println(consulta);
            //Para lanzar la consulta SELECT
            ResultSet rs = stmt.executeQuery(consulta);

            while (rs.next()) {
                nombreMaterial = rs.getString(1); //rs.getString devuelve un entero; hay que indicar el número de columna
                categoriaMaterial = rs.getString(2);

            }

        } catch (SQLException e1) {
            e1.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error recuperando datos de usuario");

        }
                
        System.out.println(nombreMaterial);
        System.out.println(nombre_material_recuperado);
        
        
        if(nombre.equals(nombre_material_recuperado)
                && categoria.equals(categoria_material_recuperado)
                || (!nombre.equals(nombreMaterial)
                || !categoria.equals(categoriaMaterial))
                ){

            return true;

        } else {
            return false;
        }

    }

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        //Recuperamos los valores de las cajas de texto y del campo para fechas.
        String nombre = txtNombre.getText().trim();
        String unidades_disponiblesS = txtUdsDisponibles.getText().trim();
        String fecha_compra = ((JTextField) dateFechaCompra.getDateEditor().getUiComponent()).getText();
        String descripcion = txtAreaDescripcion.getText().trim();

        //índice del combo
        int indice = cmbCategoria.getSelectedIndex();
        String categoria = modeloCategoria.getElementAt(indice);

        //Recoger imagen de la etiqueta
        String image_string = null;

        //Si ruta es diferente de nulo significa que se ha elegido una imagen, entonces recoge su valor
        if (ruta != null) {
            try {
                //Se guarda el fichero de la imagen en un buffer
                BufferedImage img = ImageIO.read(new File(fichero.toString()));
                //Se codifica la imagen a texto utilizando el método 
                image_string = encodeToString(img);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {

            //Validaciones
            if (nombre.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Campo nombre obligatorio");
                return;
            }

            if (fecha_compra.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debes indicar la fecha de compra");
                return;
            }

            int unidades_disponibles = 0;

            try {
                unidades_disponibles = Integer.parseInt(unidades_disponiblesS);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Las unidades deben ser un número entero");
            }

            if (unidades_disponibles < 0) {
                JOptionPane.showMessageDialog(this, "Las unidades deben ser superiores a 1.");
                return;
            }

            if (existeMaterial(nombre, categoria, nombre_material_recuperado, categoria_material_recuperado ) == false) {
                JOptionPane.showMessageDialog(this, "Ya existe el material");
                
            } else if (verificarFecha()==false){
                JOptionPane.showMessageDialog(this, "La fecha de compra no puede ser superior al día de hoy");
            
            } else if (ruta == null && iconMaterial == null) {
                //Crear un statement. Statement significa que en la conexion que tengo abierta me cree una zona de trabajo 
                Statement statement = Conexion.getConexion().createStatement();
                //Generamos la consulta como en SQL para insertar los datos del nuevo socio en la base de datos
                String consulta = "UPDATE MATERIAL SET NOMBRE = '" + nombre + "' , CATEGORIA= '" + categoria + "', DESCRIPCION= '"
                        + descripcion + "', UNIDADES= '" + unidades_disponibles + "', FECHA_COMPRA= '" + fecha_compra + "' WHERE CODIGO='" + codigo + "'";

                //Imprimimos por pantalla
                System.out.println(consulta);
                statement.executeUpdate(consulta);

                JOptionPane.showMessageDialog(this, "Material guardado correctamente");
                limpiarImagen();
//                recargarTabla();
//                dispose();

            } else {
                //Crear un statement. Statement significa que en la conexion que tengo abierta me cree una zona de trabajo 
                Statement statement = Conexion.getConexion().createStatement();
                //Generamos la consulta como en SQL para insertar los datos del nuevo socio en la base de datos
                String consulta = "UPDATE MATERIAL SET NOMBRE = '" + nombre + "' , CATEGORIA= '" + categoria + "', DESCRIPCION= '"
                        + descripcion + "', IMAGEN= '" + image_string + "', UNIDADES= '" + unidades_disponibles + "', FECHA_COMPRA= '" + fecha_compra + "' WHERE CODIGO='" + codigo + "'";

                //Imprimimos por pantalla
                System.out.println(consulta);
                statement.executeUpdate(consulta);

                JOptionPane.showMessageDialog(this, "Material guardado correctamente");
                limpiarImagen();

            }

            recargarTabla();
            dispose();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error insertando datos");

        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void recargarTabla() {
        modeloTabla.setRowCount(0);
        try {
            Statement stmt = Conexion.getConexion().createStatement(); //Devuelve el puntero de la BD y crea una zona de trabajo donde se puede colocar dentro la consulta
            String consulta = "SELECT CODIGO,NOMBRE,CATEGORIA,DESCRIPCION, UNIDADES, FECHA_COMPRA FROM MATERIAL";
            System.out.println(consulta); //Imprime por pantalla la consulta para ver posibles errores
            ResultSet rs = stmt.executeQuery(consulta); //Ejecuta la consulta

            while (rs.next()) { //Recorrer fila a fila mientras existan datos

                //Se declaran variables para ir recuperando cada campo(columna) dependiento del tipo de dato de la BD
                int codigo = rs.getInt(1); //Primera columna
                String nombre_material = rs.getString(2); //Segunda columna
                String categoria = rs.getString(3); //Tercera columna
                String descripcion = rs.getString(4);
                int unidades = rs.getInt(5);
                String fecha_compra = rs.getString(6);

                //Creamos un nuevo objeto de tipo Material
                Material material = new Material(codigo, nombre_material, categoria, fecha_compra, descripcion, unidades);

                modeloTabla.setRowCount(modeloTabla.getRowCount() + 1);

                //Añadimos el objeto "material" en la primera columna de la tabla 
                modeloTabla.setValueAt(material, modeloTabla.getRowCount() - 1, 0);

                //Rellenamos las columnas con los datos del material
                modeloTabla.setValueAt(material.getNombre(), modeloTabla.getRowCount() - 1, 1);
                modeloTabla.setValueAt(material.getCategoria(), modeloTabla.getRowCount() - 1, 2);
                modeloTabla.setValueAt(material.getFecha_compra(), modeloTabla.getRowCount() - 1, 3);
                modeloTabla.setValueAt(material.getDescripcion(), modeloTabla.getRowCount() - 1, 4);
                modeloTabla.setValueAt(material.getUnidades(), modeloTabla.getRowCount() - 1, 5);

//                //Alinear a la izquierda los datos en las columnas
//                 DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer(); //Se crea la alineación
//                 leftRenderer.setHorizontalAlignment( JLabel.LEFT );
//
//                //Se utiliza el bucle para ir añadiendo la alineación
//                 for(int x=0;x<8;x++){
//                 tblMaterial.getColumnModel().getColumn(x).setCellRenderer( leftRenderer );
//                 }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error actualizando tabla");
            dispose();
        }
    }

    private void limpiarImagen() {
        ruta = null;
        fichero = null;
    }

    private void elegirImagen() {
        //Se crea para poder elegir un archivo del pc
        JFileChooser elegirImagen = new JFileChooser();

        //Se filtra para que solo se puedan seleccionar archivos de tipo imagen
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");

        //Se le asigna el filtrado al file chooser
        elegirImagen.setFileFilter(filtro);

        //Se obtiene el valor del botón que se selecciona -> 1 abrir, 0 cancelar
        int resultado = elegirImagen.showOpenDialog(this);

        if (resultado == JFileChooser.APPROVE_OPTION) {
            //Se guarda la imagen seleccionada como un fichero
            fichero = elegirImagen.getSelectedFile();
            //Se guarda en la variable ruta la ruta del elemento seleccionado
            ruta = fichero.getAbsolutePath();

            //Se instancia la imagen y se recoge dicha imagen de la ruta
            ImageIcon imagenMaterial = new ImageIcon(fichero.toString());

            //Se pasa la imagen a icon y se eligen las dimensiones de dicha imagen
             iconMaterial = new ImageIcon(imagenMaterial.getImage().getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_SMOOTH));

            //Se introduce la imagen dentro de la etiqueta
            lblImagen.setIcon(iconMaterial);
        }
    }

    private void lblImagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImagenMouseClicked
        //REVISAR METODO COPYPASTE DE AINHOA   

        if (evt.getClickCount() == 2) {

            elegirImagen();
        }


    }//GEN-LAST:event_lblImagenMouseClicked

    private void eliminarImagen(){
        ruta = null;
        fichero = null;
        lblImagen.setIcon(null);
    
}
    private void mnuiEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiEliminarActionPerformed
        // TODO add your handling code here:
        eliminarImagen();
    }//GEN-LAST:event_mnuiEliminarActionPerformed

    private void mnuiAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiAñadirActionPerformed
        // TODO add your handling code here:
        elegirImagen();
    }//GEN-LAST:event_mnuiAñadirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DlgModificarMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgModificarMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgModificarMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgModificarMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgModificarMaterial dialog = new DlgModificarMaterial(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cmbCategoria;
    private com.toedter.calendar.JDateChooser dateFechaCompra;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblFechaCompra;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblUdsDisponibles;
    private javax.swing.JMenuItem mnuiAñadir;
    private javax.swing.JMenuItem mnuiEliminar;
    private javax.swing.JTextArea txtAreaDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUdsDisponibles;
    // End of variables declaration//GEN-END:variables
    //Declaramos el combo box
    private DefaultComboBoxModel<String> modeloCategoria;
}