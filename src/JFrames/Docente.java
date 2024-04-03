/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFrames;

import clases.RellenarComboBox;
import clases.conectar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author bombón
 */
public class Docente extends javax.swing.JFrame {
    RellenarComboBox re = new RellenarComboBox();
    
    Connection con = null;
    Statement stmt = null;

    Docente() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setTitle("Registro de Docente - Scherzzo");
        ImageIcon icono = new ImageIcon("C:\\Users\\Fer\\OneDrive\\Documentos\\NetBeansProjects\\Scherzzo"
                + "\\src\\imagenes\\Scherzzo.jpg"); 
        this.setIconImage(icono.getImage());
         
        re.RellenarCombos("clase", "nombre_clase", CBInstrumentos);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        personita = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        instrumento = new javax.swing.JLabel();
        TXTNombre = new javax.swing.JTextField();
        TXTtelefono = new javax.swing.JTextField();
        TXTAp1 = new javax.swing.JTextField();
        TXTAp2 = new javax.swing.JTextField();
        CBInstrumentos = new javax.swing.JComboBox<>();
        añadir = new javax.swing.JButton();
        apellidoMaterno = new javax.swing.JLabel();
        apellidoPaterno = new javax.swing.JLabel();
        eliminar = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        TXTIdMaestro = new javax.swing.JTextField();
        BTNRegresar = new javax.swing.JButton();
        fondo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(172, 204, 244));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        personita.setBackground(new java.awt.Color(172, 204, 244));
        personita.setForeground(new java.awt.Color(172, 204, 244));
        personita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura_de_pantalla_2023-04-19_094429-removebg-preview.png"))); // NOI18N
        getContentPane().add(personita, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        id.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        id.setText("ID");
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        nombre.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        nombre.setText("Nombre");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        id1.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        id1.setText("MAESTROS");
        getContentPane().add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        telefono.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        telefono.setText("Teléfono");
        getContentPane().add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, -1));

        instrumento.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        instrumento.setText("Instrumento");
        getContentPane().add(instrumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, -1, -1));

        TXTNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TXTNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTNombreActionPerformed(evt);
            }
        });
        getContentPane().add(TXTNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 210, -1));

        TXTtelefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TXTtelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTtelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(TXTtelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 210, -1));

        TXTAp1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TXTAp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTAp1ActionPerformed(evt);
            }
        });
        getContentPane().add(TXTAp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 210, -1));

        TXTAp2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TXTAp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTAp2ActionPerformed(evt);
            }
        });
        getContentPane().add(TXTAp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 210, -1));

        CBInstrumentos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CBInstrumentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBInstrumentosActionPerformed(evt);
            }
        });
        getContentPane().add(CBInstrumentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 160, -1));

        añadir.setBackground(new java.awt.Color(248, 198, 44));
        añadir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        añadir.setText("Añadir");
        añadir.setBorder(null);
        añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirActionPerformed(evt);
            }
        });
        getContentPane().add(añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 70, 30));

        apellidoMaterno.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        apellidoMaterno.setText("Apellido Materno");
        getContentPane().add(apellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        apellidoPaterno.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        apellidoPaterno.setText("Apellido Paterno");
        getContentPane().add(apellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));

        eliminar.setBackground(new java.awt.Color(236, 108, 108));
        eliminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.setBorder(null);
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 70, 30));

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

        TXTIdMaestro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TXTIdMaestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTIdMaestroActionPerformed(evt);
            }
        });
        TXTIdMaestro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTIdMaestroKeyTyped(evt);
            }
        });
        getContentPane().add(TXTIdMaestro, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 210, -1));

        BTNRegresar.setBackground(new java.awt.Color(172, 204, 244));
        BTNRegresar.setForeground(new java.awt.Color(172, 204, 244));
        BTNRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flechita.png"))); // NOI18N
        BTNRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(BTNRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 40));

        fondo.setBackground(new java.awt.Color(172, 204, 244));
        fondo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fondoActionPerformed(evt);
            }
        });
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 690, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_LimpiarActionPerformed

    private void TXTNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTNombreActionPerformed
    }//GEN-LAST:event_TXTNombreActionPerformed

    private void TXTtelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTtelefonoActionPerformed
    }//GEN-LAST:event_TXTtelefonoActionPerformed

    private void añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirActionPerformed
        if ((TXTIdMaestro.getText().equals(""))||(TXTNombre.getText().equals("")) || (TXTAp1.getText().equals("")) ||(TXTAp2.getText().equals("")) 
                ||  (TXTtelefono.getText().equals("")) ||(CBInstrumentos.getSelectedItem().equals(""))){
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos\n","AVISO!...",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            TXTIdMaestro.requestFocus();
        } 

        else{
            try{
                    String cadena2, cadena3, cadena4, cadena5, cadena6, cadena7, cadena8;
                    cadena2 = TXTIdMaestro.getText();
                    cadena3 = TXTNombre.getText();
                    cadena4 = TXTAp1.getText();
                    cadena5 = TXTAp2.getText();
                    //cadena6 = jTextFieldNacimiento.getText();
                    cadena7 = TXTtelefono.getText();
                    cadena8 = CBInstrumentos.getSelectedItem().toString();
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
                //stmt.executeUpdate("INSERT INTO alumno VALUES('" + cadena2 + "','" + cadena3 + "','" + cadena4 + "','" + cadena5 + "','" + cadena6 + "','" + cadena7 + "','" + Clase_idClase + "')");
                stmt.executeUpdate("INSERT INTO docente VALUES('" + cadena2 + "','" + cadena3 + "','" + cadena4 + "','" + cadena5 + "','" + cadena7 + "','" + Clase_idClase + "')");
                //System.out.println("Los valores han sido agregados a la base de datos");       
                Limpiar();
                javax.swing.JOptionPane.showMessageDialog(this, "Se registraron los datos del Maestro\n","AVISO!...", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                    Logger.getLogger(Docente.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Docente.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                 Logger.getLogger(Docente.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                Logger.getLogger(Docente.class.getName()).log(Level.SEVERE, null, ex);
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

    private void CBInstrumentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBInstrumentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBInstrumentosActionPerformed

    private void TXTAp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTAp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTAp1ActionPerformed

    private void TXTAp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTAp2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTAp2ActionPerformed

    private void TXTIdMaestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTIdMaestroActionPerformed

    }//GEN-LAST:event_TXTIdMaestroActionPerformed

    private void TXTIdMaestroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTIdMaestroKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_TXTIdMaestroKeyTyped

    private void fondoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fondoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fondoActionPerformed

    private void BTNRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNRegresarActionPerformed
        this.dispose();
        Menu_Maestros ma= new Menu_Maestros();
        ma.setVisible(true);
    }//GEN-LAST:event_BTNRegresarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
       this.dispose();
       Maestro_Busqueda maestros= new Maestro_Busqueda();
       maestros.setVisible(true);
    }//GEN-LAST:event_eliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Docente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Docente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Docente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(Docente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //<editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Docente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNRegresar;
    private javax.swing.JComboBox<String> CBInstrumentos;
    private javax.swing.JButton Limpiar;
    private javax.swing.JTextField TXTAp1;
    private javax.swing.JTextField TXTAp2;
    private javax.swing.JTextField TXTIdMaestro;
    private javax.swing.JTextField TXTNombre;
    private javax.swing.JTextField TXTtelefono;
    private javax.swing.JLabel apellidoMaterno;
    private javax.swing.JLabel apellidoPaterno;
    private javax.swing.JButton añadir;
    private javax.swing.JButton eliminar;
    private javax.swing.JTextField fondo;
    private javax.swing.JLabel id;
    private javax.swing.JLabel id1;
    private javax.swing.JLabel instrumento;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel personita;
    private javax.swing.JLabel telefono;
    // End of variables declaration//GEN-END:variables

    public void Limpiar(){
        TXTIdMaestro.setText("");
        TXTNombre.setText("");
        TXTAp1.setText("");
        TXTAp2.setText("");   
        //jTextFieldNacimiento.setText("");
        TXTtelefono.setText("");
        CBInstrumentos.setSelectedIndex(0);
        TXTIdMaestro.requestFocus();
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
