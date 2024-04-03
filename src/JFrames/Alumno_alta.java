
package JFrames;

import clases.RellenarComboBox;
import clases.conectar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;


/**
 *
 * @author bombón
 */
public class Alumno_alta extends javax.swing.JFrame {
    RellenarComboBox re = new RellenarComboBox();
    
    Connection con = null;
    Statement stmt = null;
    
    /**
     * Creates new form alumno
     */
    public Alumno_alta() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setTitle("Registro de alumno - Scherzzo");
        re.RellenarCombos("clase", "nombre_clase", jComboBoxInstrumentos);
        ImageIcon icono = new ImageIcon("C:\\Users\\Fer\\OneDrive\\Documentos\\NetBeansProjects\\Scherzzo"
                + "\\src\\imagenes\\Scherzzo.jpg"); 
        this.setIconImage(icono.getImage());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        personita = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        instrumento = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldApellido1 = new javax.swing.JTextField();
        fechaNac = new com.toedter.calendar.JDateChooser();
        regresar = new javax.swing.JButton();
        id1 = new javax.swing.JLabel();
        lupa = new javax.swing.JButton();
        jTextFieldApellido2 = new javax.swing.JTextField();
        jComboBoxInstrumentos = new javax.swing.JComboBox<>();
        fechaNacimiento = new javax.swing.JLabel();
        añadir = new javax.swing.JButton();
        apellidoMaterno = new javax.swing.JLabel();
        apellidoPaterno = new javax.swing.JLabel();
        Limpiar = new javax.swing.JButton();
        fondo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(172, 204, 244));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        personita.setBackground(new java.awt.Color(172, 204, 244));
        personita.setForeground(new java.awt.Color(172, 204, 244));
        personita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura_de_pantalla_2023-04-19_094429-removebg-preview.png"))); // NOI18N
        getContentPane().add(personita, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        id.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        id.setText("ID:");
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        nombre.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        nombre.setText("Nombre:");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));

        telefono.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        telefono.setText("Teléfono:");
        getContentPane().add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, -1));

        instrumento.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        instrumento.setText("Instrumento:");
        getContentPane().add(instrumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, -1));

        jTextFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 160, -1));

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 160, -1));

        jTextFieldTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 160, -1));

        jTextFieldApellido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApellido1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 160, -1));
        getContentPane().add(fechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 160, -1));

        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flechita.png"))); // NOI18N
        regresar.setBorderPainted(false);
        regresar.setContentAreaFilled(false);
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        getContentPane().add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 40));

        id1.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        id1.setText("ALUMNOS");
        getContentPane().add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 5, -1, 40));

        lupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busqueda22.png"))); // NOI18N
        lupa.setBorderPainted(false);
        lupa.setContentAreaFilled(false);
        lupa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lupaActionPerformed(evt);
            }
        });
        getContentPane().add(lupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jTextFieldApellido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApellido2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 160, -1));

        jComboBoxInstrumentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxInstrumentosActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxInstrumentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 160, -1));

        fechaNacimiento.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        fechaNacimiento.setText("Fecha de Nacimiento:");
        getContentPane().add(fechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, -1, -1));

        añadir.setBackground(new java.awt.Color(248, 198, 44));
        añadir.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        añadir.setText("Añadir");
        añadir.setBorder(null);
        añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirActionPerformed(evt);
            }
        });
        getContentPane().add(añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 70, 30));

        apellidoMaterno.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        apellidoMaterno.setText("Apellido Materno:");
        getContentPane().add(apellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, -1));

        apellidoPaterno.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        apellidoPaterno.setText("Apellido Paterno:");
        getContentPane().add(apellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, -1, -1));

        Limpiar.setBackground(new java.awt.Color(172, 204, 244));
        Limpiar.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        Limpiar.setText("Limpiar");
        Limpiar.setBorder(null);
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 70, 30));

        fondo.setEditable(false);
        fondo.setBackground(new java.awt.Color(172, 204, 244));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_LimpiarActionPerformed

    private void jTextFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDActionPerformed
    }//GEN-LAST:event_jTextFieldIDActionPerformed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoActionPerformed
    }//GEN-LAST:event_jTextFieldTelefonoActionPerformed

    private void añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirActionPerformed
        if ((jTextFieldID.getText().equals(""))||(jTextFieldNombre.getText().equals("")) || (jTextFieldApellido1.getText().equals("")) ||(jTextFieldApellido2.getText().equals("")) 
                || (fechaNac.getDate() == null) || (jTextFieldTelefono.getText().equals("")) ||(jComboBoxInstrumentos.getSelectedItem().equals(""))){
            
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos\n","AVISO!...",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            jTextFieldID.requestFocus();
        
        } 
        else{
            try{
                    // Obtener la fecha seleccionada del JDateChooser
                    Date date = fechaNac.getDate();

                    // Crear un formato de fecha que sea compatible con SQL
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                
                    String cadena2, cadena3, cadena4, cadena5, cadena6, cadena7, cadena8;
                    cadena2 = jTextFieldID.getText();
                    cadena3 = jTextFieldNombre.getText();
                    cadena4 = jTextFieldApellido1.getText();
                    cadena5 = jTextFieldApellido2.getText();
                    cadena6 = dateFormat.format(date);
                    cadena7 = jTextFieldTelefono.getText();
                    cadena8 = jComboBoxInstrumentos.getSelectedItem().toString();
                    int Clase_idClase = obtenerIdClase(cadena8, "clase");

        
                    String url = "jdbc:mysql://127.0.0.1:3306/scherzzo";
                    String user = "root";
                    String password = "";
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    con = DriverManager.getConnection(url, user, password);

                    if(con != null){
                        System.out.println("Conexión establecida");
                    }

                stmt = con.createStatement();
                stmt.executeUpdate("INSERT INTO alumno VALUES('" + cadena2 + "','" + cadena3 + "','" + cadena4 + "','" + cadena5 + "','" + cadena6 + "','" + cadena7 + "','" + Clase_idClase + "')");
                //stmt.executeUpdate("INSERT INTO docente VALUES('" + cadena2 + "','" + cadena3 + "','" + cadena4 + "','" + cadena5 + "','" + cadena7 + "','" + Clase_idClase + "')");
                //System.out.println("Los valores han sido agregados a la base de datos");            
                
                javax.swing.JOptionPane.showMessageDialog(this, "Se registraron los datos del alumno\n","AVISO!...", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                
                Limpiar();
            
            } catch (SQLException ex) {
                    Logger.getLogger(Alumno_alta.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Alumno_alta.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(Alumno_alta.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(Alumno_alta.class.getName()).log(Level.SEVERE, null, ex);
                }
            finally{
                //conexion.desconectar();
                if(con != null){
                    try{
                        con.close();
                        stmt.close();
                    } catch (Exception e){
                        System.out.println("Conexión terminada: " + e.getMessage());
                    }
                }
            }
        }

    }//GEN-LAST:event_añadirActionPerformed

    private void jComboBoxInstrumentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxInstrumentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxInstrumentosActionPerformed

    private void jTextFieldApellido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApellido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldApellido1ActionPerformed

    private void jTextFieldApellido2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApellido2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldApellido2ActionPerformed

    private void lupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lupaActionPerformed
        this.dispose();
        Alumno_consulta_baja consulta = new Alumno_consulta_baja();
        consulta.setVisible(true);
    }//GEN-LAST:event_lupaActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        this.dispose();
        Menu_alumno menu = new Menu_alumno();
        menu.setVisible(true);
    }//GEN-LAST:event_regresarActionPerformed

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
            java.util.logging.Logger.getLogger(Alumno_alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alumno_alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alumno_alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alumno_alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alumno_alta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Limpiar;
    private javax.swing.JLabel apellidoMaterno;
    private javax.swing.JLabel apellidoPaterno;
    private javax.swing.JButton añadir;
    private com.toedter.calendar.JDateChooser fechaNac;
    private javax.swing.JLabel fechaNacimiento;
    private javax.swing.JTextField fondo;
    private javax.swing.JLabel id;
    private javax.swing.JLabel id1;
    private javax.swing.JLabel instrumento;
    private javax.swing.JComboBox<String> jComboBoxInstrumentos;
    private javax.swing.JTextField jTextFieldApellido1;
    private javax.swing.JTextField jTextFieldApellido2;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    private javax.swing.JButton lupa;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel personita;
    private javax.swing.JButton regresar;
    private javax.swing.JLabel telefono;
    // End of variables declaration//GEN-END:variables

    public void Limpiar(){
        jTextFieldID.setText("");
        jTextFieldNombre.setText("");
        jTextFieldApellido1.setText("");
        jTextFieldApellido2.setText("");   
        fechaNac.setDate(null);
        jTextFieldTelefono.setText("");
        jComboBoxInstrumentos.setSelectedIndex(0);
        jTextFieldID.requestFocus();
    }     

    public int obtenerIdClase(String nombre, String tabla) throws SQLException {
        int id = 0;
        String sql = "SELECT idClase FROM " + tabla + " WHERE nombre_clase = ?";
        try (Connection conexion = obtenerConexion();
             PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, nombre);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    id = rs.getInt("idClase");
                }
            }
        }
        return id;
    }
    
    private Connection obtenerConexion(){
        conectar con = new conectar();
        Connection conexion = con.getConnection();
        return conexion;
    }
}
