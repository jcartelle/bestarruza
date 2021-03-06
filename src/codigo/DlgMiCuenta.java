/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package codigo;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static java.lang.String.valueOf;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author bea
 */
public class DlgMiCuenta extends javax.swing.JDialog {
     //Establecemos color de fondo
        Color fondo= new Color(222, 237, 215 );

    /**
     * Creates new form DlgMiCuenta
     */
    //Para guardar el id del usuario recuperado
    String socioRecuperado = "";
    int num_SocioRecup=0;
    
    //Para guardar el login del usuario recuperado
    private String miembroJunta_recu="";
    
    int limite=9;
//    
    public DlgMiCuenta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
        public DlgMiCuenta(java.awt.Frame parent, boolean modal,  Socio socio, JuntaDirectiva miembroJunta)
        {
        super(parent, modal);
        initComponents();
        
               //Pinta el formulario
        this.getContentPane().setBackground(fondo);
        
                //Centramos la ventana
        this.setLocationRelativeTo(null);
        
        txtDni.setText(socio.getDni());
        txtNombre.setText(socio.getNombre());
        txtApellido.setText(socio.getApellido());
        txtEmail.setText(socio.getEmail());
        txtTelefono.setText(valueOf(socio.getTelefono()));
        ((JTextField) dateFechaNacimiento.getDateEditor().getUiComponent()).setText(socio.getFecha_nacimiento());
        txtDireccion.setText(socio.getDireccion());
        
        //Recuperamos socio junta directiva        
            socioRecuperado = socio.getDni();
            
            num_SocioRecup=socio.getNum_socio();
            
        //Recuperamos el login del socio de la junta directiva
            miembroJunta_recu = miembroJunta.getUsuario_app();
            
            System.out.println(miembroJunta_recu);
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

        jPanel2 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnCambiarContra = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblDni = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblFechaNac = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        dateFechaNacimiento = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MI CUENTA");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(222, 237, 215));
        setMinimumSize(new java.awt.Dimension(600, 325));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel2.setBackground(new java.awt.Color(222, 237, 215));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        btnGuardar.setText("GUARDAR");
        btnGuardar.setMaximumSize(new java.awt.Dimension(109, 35));
        btnGuardar.setMinimumSize(new java.awt.Dimension(109, 35));
        btnGuardar.setPreferredSize(new java.awt.Dimension(109, 35));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 50, 50, 0);
        jPanel2.add(btnGuardar, gridBagConstraints);

        btnCambiarContra.setText("CAMBIAR CONTRASE??A");
        btnCambiarContra.setMaximumSize(new java.awt.Dimension(200, 24));
        btnCambiarContra.setMinimumSize(new java.awt.Dimension(200, 35));
        btnCambiarContra.setPreferredSize(new java.awt.Dimension(200, 35));
        btnCambiarContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarContraActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 50, 0);
        jPanel2.add(btnCambiarContra, gridBagConstraints);

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
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 50, 50);
        jPanel2.add(btnCancelar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 0, 0);
        getContentPane().add(jPanel2, gridBagConstraints);

        jPanel1.setBackground(new java.awt.Color(222, 237, 215));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        lblDni.setText("DNI");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 50, 0, 0);
        jPanel1.add(lblDni, gridBagConstraints);

        lblNombre.setText("NOMBRE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 10, 0);
        jPanel1.add(lblNombre, gridBagConstraints);

        lblApellido.setText("APELLIDO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 10, 0);
        jPanel1.add(lblApellido, gridBagConstraints);

        lblEmail.setText("EMAIL");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 10, 0);
        jPanel1.add(lblEmail, gridBagConstraints);

        lblFechaNac.setText("FECHA NACIMIENTO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 10, 0);
        jPanel1.add(lblFechaNac, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(30, 10, 10, 0);
        jPanel1.add(txtDni, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 0);
        jPanel1.add(txtNombre, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 0);
        jPanel1.add(txtEmail, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 0);
        jPanel1.add(txtApellido, gridBagConstraints);

        lblTelefono.setText("TEL??FONO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(30, 20, 10, 0);
        jPanel1.add(lblTelefono, gridBagConstraints);

        lblDireccion.setText("DIRECCI??N");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        jPanel1.add(lblDireccion, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(30, 10, 10, 40);
        jPanel1.add(txtTelefono, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 40);
        jPanel1.add(txtDireccion, gridBagConstraints);

        dateFechaNacimiento.setBackground(new java.awt.Color(222, 237, 215));
        dateFechaNacimiento.setDateFormatString("YYYY-MM-DD");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 0);
        jPanel1.add(dateFechaNacimiento, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCambiarContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarContraActionPerformed
        // TODO add your handling code here:
        DlgCambioPassword cambioPassword = new DlgCambioPassword(this, true, miembroJunta_recu);
        cambioPassword.setVisible(true);
    }//GEN-LAST:event_btnCambiarContraActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void comprobarTelefono() {
        //Metodo para que la caja de texto de telefono no deje insertar m??s de 9 digitos. 
        JTextField txtTelefono = this.txtTelefono;
        txtTelefono.addKeyListener(new KeyListener() {
            //keyTyped(KeyEvent e): Se ejecuta cuando el usuario presiona una tecla, pero solo cuando la tecla corresponde a caract??res, teclas especiales como F1, F2 entre otras no son identificadas.
            public void keyTyped(KeyEvent e) {
                if (txtTelefono.getText().length() == limite) {
                    e.consume();
                }
            }

            @Override
            //keyPressed(KeyEvent e): Se ejecuta cuando el usuario presiona una tecla.
            public void keyPressed(KeyEvent ke) {
            }

            //keyReleased(KeyEvent e): Se ejecuta cuando el usuario libera una tecla
            @Override
            public void keyReleased(KeyEvent ke) {
            }

        });
    }

    private void comprobarDNI() {
        //Metodo para que la caja de texto de dni no deje insertar m??s de 9 digitos. 
        JTextField txtDNI = this.txtDni;
        txtDNI.addKeyListener(new KeyListener() {
            //keyTyped(KeyEvent e): Se ejecuta cuando el usuario presiona una tecla, pero solo cuando la tecla corresponde a caract??res, teclas especiales como F1, F2 entre otras no son identificadas.
            public void keyTyped(KeyEvent e) {
                if (txtDNI.getText().length() == limite) {
                    e.consume();
                }
            }

            @Override
            //keyPressed(KeyEvent e): Se ejecuta cuando el usuario presiona una tecla.
            public void keyPressed(KeyEvent ke) {
            }

            //keyReleased(KeyEvent e): Se ejecuta cuando el usuario libera una tecla
            @Override
            public void keyReleased(KeyEvent ke) {
            }

        });
    }
    
    
    private boolean existeDNI(String dni,String dniRecuperado){
        //M??todo que comprueba si existe o no un socio con el mismo DNI. En caso de que exista no podremos crear un nuevo socio con dicho DNI.
            
        String dniSocio="";
      
               
        try {
            //Crear un statement. Statement significa que en la conexion que tengo abierta me cree una zona de trabajo 
            Statement statement = Conexion.getConexion().createStatement();
            //Generamos la consulta SELECT
            String consulta = "SELECT DNI FROM SOCIO WHERE DNI='"+dni+"'";
            //Imprimimos en consola la consulta por si hay errores.
            System.out.println(consulta);
            //Ejecutamos la consulta SELECT
            ResultSet resultSet = statement.executeQuery(consulta);

            
            while (resultSet.next()) {                 
                dniSocio = resultSet.getString(1);          
     
            }

        } catch (SQLException e1) {
            e1.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error recuperando datos de usuario");

        }
        if (dni.equals(dniSocio) && !dniSocio.equals(dniRecuperado)) {
            return true;

        } else {
            return false;
        }

    }
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
       String dni = txtDni.getText().trim();
        String nombre = txtNombre.getText().trim();
        String apellido = txtApellido.getText().trim();
        String fecha_nacimiento = ((JTextField) dateFechaNacimiento.getDateEditor().getUiComponent()).getText();
        String telefonoS = txtTelefono.getText().trim();
        String direccion = txtDireccion.getText().trim();
        String email = txtEmail.getText().trim();
        int telefono = 0;
               
        try {
           //Validaciones
            if (dni.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Campo DNI obligatorio");
                return;
            }

            if (nombre.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Campo nombre obligatorio");
                return;
            }
            if (apellido.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Campo apellido obligatorio");
                return;
            }

            //FALTA VALIDAR QUE LA FECHA DE NACIMIENTO NO SEA SUPERIOR A LA FECHA ACTUAL
            if (fecha_nacimiento.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Campo fecha nacimiento obligatorio");
                return;
            }
            if (telefonoS.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Campo telefono obligatorio");
                return;
            }
            if (direccion.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Campo direccion obligatorio");
                return;
            }
           
                telefono = 0;
             try {
                telefono = Integer.parseInt(telefonoS);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "El tel??fono debe ser un n??mero entero");
                return;
            }

            if (existeDNI(dni, socioRecuperado)) {
                JOptionPane.showMessageDialog(this, "Ya existe el dni");
                
            } else {

                Statement statement = Conexion.getConexion().createStatement(); //Devuelve el puntero de la BD y crea una zona de trabajo donde se puede colocar dentro la consulta
                String consulta_update = "UPDATE SOCIO SET DNI='" + dni + "', NOMBRE ='" + nombre + "', APELLIDO ='" + apellido + "', FECHA_NACIMIENTO='" + fecha_nacimiento + "', DIRECCION='" + direccion + "', TELEFONO='" + telefono + "', EMAIL='" + email + "' WHERE NUM_SOCIO='" + num_SocioRecup + "'";
                //Imprimimos por pantalla por si hay errores
                System.out.println(consulta_update);
                //Ejecutamos la actualizaci??n de los datos de la base de datos 
                statement.executeUpdate(consulta_update);


            dispose();
            }
          
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error insertando datos");
            System.out.println(e.getErrorCode());
            e.printStackTrace();
            dispose();

        }
    }//GEN-LAST:event_btnGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(DlgMiCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgMiCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgMiCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgMiCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgMiCuenta dialog = new DlgMiCuenta(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCambiarContra;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private com.toedter.calendar.JDateChooser dateFechaNacimiento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFechaNac;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
