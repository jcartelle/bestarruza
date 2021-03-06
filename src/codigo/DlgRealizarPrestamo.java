/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package codigo;


/**
 *
 * @author bea
 */


import static codigo.DlgBuscadorMaterial.modeloTabla;
import java.awt.Color;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DlgRealizarPrestamo extends javax.swing.JDialog {
     //Establecemos color de fondo
        Color fondo= new Color(222, 237, 215 );

    /**
     * Creates new form DlgRealizarPrestamo
     */
        

    Material materialRecuperado=null;
    
    public DlgRealizarPrestamo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
    }
    
        public DlgRealizarPrestamo(javax.swing.JDialog parent, boolean modal, Material material_Recuperado) {
        super(parent, modal);
        initComponents();
        //Pinta el formulario
        this.getContentPane().setBackground(fondo);
        
                //Centramos la ventana
        this.setLocationRelativeTo(null);
        
        //Decarar y ligar tabla al modelo
        modeloListaRealizarPrestamo = new DefaultListModel();
        lstRealizarPrestamo.setModel(modeloListaRealizarPrestamo);
        
        //Recogemos la fecha local del sistema
        LocalDate fechaActual= LocalDate.now();
       
        
        //Actualizamos el calendario de la fecha desde con la fecha local
        DateDesde.setDate(Date.valueOf(fechaActual));
               
        
        //Sumamos 15 días a la fecha inicial del préstamo, ya que es tiempo que va a durar un préstamo.
        fechaActual=fechaActual.plusDays(15);
        
          //Actualizamos el calendario de la fecha hasta 
        DateHasta.setDate(Date.valueOf(fechaActual));       
        
        recargarLista();
        
        materialRecuperado=material_Recuperado;
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

        lblDNI = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        lblDesde = new javax.swing.JLabel();
        lblHasta = new javax.swing.JLabel();
        DateDesde = new com.toedter.calendar.JDateChooser();
        DateHasta = new com.toedter.calendar.JDateChooser();
        btnBuscar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstRealizarPrestamo = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnRealizarPrestamo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("REALIZAR PRÉSTAMO");
        setBackground(new java.awt.Color(222, 237, 215));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        lblDNI.setText("DNI");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(50, 50, 0, 0);
        getContentPane().add(lblDNI, gridBagConstraints);

        lblNombre.setText("NOMBRE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 50, 4, 0);
        getContentPane().add(lblNombre, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(50, 20, 0, 70);
        getContentPane().add(txtDNI, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 70);
        getContentPane().add(txtNombre, gridBagConstraints);

        lblDesde.setText("DESDE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 50, 4, 0);
        getContentPane().add(lblDesde, gridBagConstraints);

        lblHasta.setText("HASTA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 50, 4, 0);
        getContentPane().add(lblHasta, gridBagConstraints);

        DateDesde.setDateFormatString("yyyy-MM-dd");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 70);
        getContentPane().add(DateDesde, gridBagConstraints);

        DateHasta.setDateFormatString("yyyy-MM-dd");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 70);
        getContentPane().add(DateHasta, gridBagConstraints);

        btnBuscar.setText("BUSCAR");
        btnBuscar.setMaximumSize(new java.awt.Dimension(109, 35));
        btnBuscar.setMinimumSize(new java.awt.Dimension(109, 35));
        btnBuscar.setPreferredSize(new java.awt.Dimension(109, 35));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(50, 0, 0, 0);
        getContentPane().add(btnBuscar, gridBagConstraints);

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setMaximumSize(new java.awt.Dimension(109, 35));
        btnLimpiar.setMinimumSize(new java.awt.Dimension(109, 35));
        btnLimpiar.setPreferredSize(new java.awt.Dimension(109, 35));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        getContentPane().add(btnLimpiar, gridBagConstraints);

        jScrollPane1.setViewportView(lstRealizarPrestamo);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(30, 50, 30, 50);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        btnCancelar.setText("CANCELAR");
        btnCancelar.setMaximumSize(new java.awt.Dimension(109, 35));
        btnCancelar.setMinimumSize(new java.awt.Dimension(109, 35));
        btnCancelar.setPreferredSize(new java.awt.Dimension(109, 35));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnRealizarPrestamo.setText("REALIZAR PRESTAMO");
        btnRealizarPrestamo.setMaximumSize(new java.awt.Dimension(109, 35));
        btnRealizarPrestamo.setMinimumSize(new java.awt.Dimension(190, 35));
        btnRealizarPrestamo.setPreferredSize(new java.awt.Dimension(109, 35));
        btnRealizarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarPrestamoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnRealizarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(13, 13, 13)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnRealizarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 50, 50);
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        filtrar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRealizarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarPrestamoActionPerformed
        // TODO add your handling code here:
        
      int indice =lstRealizarPrestamo.getSelectedIndex();
      int posiciones[]= lstRealizarPrestamo.getSelectedIndices();
        
      if(posiciones.length==0){
            JOptionPane.showMessageDialog(this, "Debe seleccionar un elemento");
            return;
        }       
      if(posiciones.length>1){
            JOptionPane.showMessageDialog(this, "Solo se puede seleccionar un elemento");
            return;
        }
       
      //Guardamos el codigo del socio en una variable ya que en la primera columna no guardamos el objeto, sino el codigo solo.
       Socio socio = (Socio) modeloListaRealizarPrestamo.getElementAt(indice);
       
      
       //Recoger fechas de los elementos JDateChooser
        String FechaInicio =((JTextField)DateDesde.getDateEditor().getUiComponent()).getText();         
        String FechaFin =((JTextField)DateHasta.getDateEditor().getUiComponent()).getText();
        
        try{
            System.out.println(materialRecuperado.getUnidades());
            //Declaramos el número total de unidades
          int unidades=materialRecuperado.getUnidades();
          
          if(unidades<1){
              JOptionPane.showMessageDialog(this,"No quedan unidades de "+materialRecuperado.getNombre()+" en este momento para realizar el préstamo.");
              return;
          }
          //Declaramos la resta de las copias al realizar el préstamo
          int unidadesDisponibles=unidades-1;
          
            Statement stmt=Conexion.getConexion().createStatement(); //Devuelve el puntero de la BD y crea una zona de trabajo donde se puede colocar dentro la consulta
            String consulta="INSERT INTO PRESTAMO_MATERIAL(CODIGO_MATERIAL, NUM_SOCIO, FECHA_PRESTAMO, FECHA_LIMITE_DEVOLUCION) values('"+materialRecuperado.getCodigo()+"','"+socio.getNum_socio()+"','"+FechaInicio+"','"+FechaFin+"')";
            System.out.println(consulta); //Imprime por pantalla la consulta para ver posibles errores            
            stmt.executeUpdate(consulta); //Ejecuta la consulta en la BD
            
            String UpdateUnidades="UPDATE MATERIAL SET UNIDADES="+unidadesDisponibles+" WHERE CODIGO="+materialRecuperado.getCodigo();
            stmt.executeUpdate(UpdateUnidades);
            
            
            JOptionPane.showMessageDialog(this,"Préstamo realizado correctamente");
            
            
            recargarLista();
            recargarTablaMaterial(); //recargamos la tabla del buscador de materiales para actualizar las unidades disponibles 
           
            //Cerramos la ventana Prestamo Material para que haga correctamente la actualización de las unidades
            dispose();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this,"Error realizando el préstamo");
            e.printStackTrace();
        }
      
    }//GEN-LAST:event_btnRealizarPrestamoActionPerformed

    
    private void recargarTablaMaterial() {
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
                String descripcion = rs.getString(4); //cuarta columna
                int unidades = rs.getInt(5); //quinta columna
                String fecha_compra = rs.getString(6); //sexta columna

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
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    
    private void recargarLista(){
        try{ 
            Statement stmt=Conexion.getConexion().createStatement(); //Devuelve el puntero de la BD y crea una zona de trabajo donde se puede colocar dentro la consulta
            String consulta= "SELECT NUM_SOCIO, DNI, NOMBRE, APELLIDO FROM SOCIO";
            System.out.println(consulta); //Imprime por pantalla la consulta para ver posibles errores
            ResultSet rs=stmt.executeQuery(consulta); //Ejecuta la consulta
            
            while(rs.next()){ //Recorrer fila a fila mientras existan datos
                
                //Se declaran variables para ir recuperando cada campo(columna) dependiento del tipo de dato de la BD
               int num_socio=rs.getInt(1);
               String dni=rs.getString(2); 
               String nombre=rs.getString(3); 
               String apellido=rs.getString(4);
               
                
                //Creo socio
                Socio socio = new Socio(num_socio, dni, nombre, apellido);
                
                //Meto en el modelo
                 modeloListaRealizarPrestamo.addElement(socio);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this,"Error actualizando lista");
            dispose();
        }
       
       }
    
    private void filtrar(){
        String dni_socio = txtDNI.getText().trim().toUpperCase();
        String nombre_socio = txtNombre.getText().trim().toUpperCase();
        
        //Borrar lista entera antes de nada para que se pueda recargar cuando filtramos
        modeloListaRealizarPrestamo.removeAllElements();
        
        String consulta=null;
        
        try{
            //Se establece la conexión
            Statement stmt = Conexion.getConexion().createStatement(); //Devuelve el puntero de la BD y crea una zona de trabajo donde se puede colocar dentro la consulta
            if(dni_socio.isEmpty()){
                consulta="SELECT NUM_SOCIO, DNI, NOMBRE, APELLIDO FROM SOCIO WHERE NOMBRE LIKE '%"+nombre_socio+"%' ";
                       System.out.println(consulta);
            } 
            else if(nombre_socio.isEmpty()){
                consulta="SELECT NUM_SOCIO, DNI, NOMBRE, APELLIDO FROM SOCIO WHERE DNI="+dni_socio;
                       System.out.println(consulta);
            }
            else if(dni_socio.isEmpty()==false && nombre_socio.isEmpty()==false){
                consulta="SELECT NUM_SOCIO, DNI, NOMBRE, APELLIDO FROM SOCIO WHERE DNI ="+dni_socio+" AND NOMBRE LIKE '%"+nombre_socio+"%' ";
                System.out.println(consulta);
            }
            
            if(consulta!=null){
                ResultSet resultset = stmt.executeQuery(consulta); //Ejecuta la consulta

            
            while (resultset.next()) { 
                 //Se declaran variables para ir recuperando cada campo(columna) dependiento del tipo de dato de la BD
               int num_socio=resultset.getInt(1);
               String dni=resultset.getString(2); 
               String nombre=resultset.getString(3); 
               String apellido=resultset.getString(4);
               
                
                //Creo Usuario
                Socio socio = new Socio(num_socio, dni, nombre, apellido);
                
                //Meto en el modelo
                  modeloListaRealizarPrestamo.addElement(socio.getDni()+" - "+socio.getNombre()+" "+socio.getApellido());

            }
            } else {
                recargarLista();
            }
            
        }catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error consultando datos");
        }
        
    }
    
    private void limpiar(){
        txtDNI.setText("");
        txtNombre.setText("");
    }
    
    
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
            java.util.logging.Logger.getLogger(DlgRealizarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgRealizarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgRealizarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgRealizarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgRealizarPrestamo dialog = new DlgRealizarPrestamo(new javax.swing.JFrame(), true);
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
    private com.toedter.calendar.JDateChooser DateDesde;
    private com.toedter.calendar.JDateChooser DateHasta;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRealizarPrestamo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblDesde;
    private javax.swing.JLabel lblHasta;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JList<String> lstRealizarPrestamo;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
    public static DefaultListModel modeloListaRealizarPrestamo;

}
