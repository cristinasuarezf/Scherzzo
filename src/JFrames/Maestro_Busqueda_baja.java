
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


public class Maestro_Busqueda_baja extends javax.swing.JFrame {

    RellenarComboBox re = new RellenarComboBox();
    String strRegistro;
    
    Connection con = null;
    Statement stmt = null;
    public Maestro_Busqueda_baja() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Bajas Maestros - Scherzzo");
        ImageIcon icono = new ImageIcon("C:\\Users\\Fer\\OneDrive\\Documentos\\NetBeansProjects"
                + "\\Scherzzo\\src\\imagenes\\Scherzzo.jpg"); 
        this.setIconImage(icono.getImage());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BTNRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        BTNBuscar = new javax.swing.JButton();
        BTNLimpiar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TXTIdMaestro = new javax.swing.JTextField();
        TXTMaestro = new javax.swing.JTextField();
        TXTelefono = new javax.swing.JTextField();
        eliminar = new javax.swing.JButton();
        apellidoPaterno = new javax.swing.JLabel();
        TXTAp1 = new javax.swing.JTextField();
        apellidoMaterno = new javax.swing.JLabel();
        TXTAp2 = new javax.swing.JTextField();
        TXTInstrumento = new javax.swing.JTextField();
        id1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(701, 470));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(172, 204, 244));
        jPanel1.setMaximumSize(new java.awt.Dimension(701, 470));
        jPanel1.setMinimumSize(new java.awt.Dimension(701, 470));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura_de_pantalla_2023-04-19_094429-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 75, -1, -1));

        BTNRegresar.setBackground(new java.awt.Color(172, 204, 244));
        BTNRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flechita.png"))); // NOI18N
        BTNRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(BTNRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 66, 49));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel2.setText("ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 35, -1));

        BTNBuscar.setBackground(new java.awt.Color(0, 204, 102));
        BTNBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BTNBuscar.setText("Buscar");
        BTNBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(BTNBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 100, 30));

        BTNLimpiar.setBackground(new java.awt.Color(172, 204, 244));
        BTNLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BTNLimpiar.setText("Limpiar");
        BTNLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(BTNLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 390, -1, 30));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel3.setText("Maestro");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel4.setText("Teléfono");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel5.setText("Instrumento");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, -1, -1));

        TXTIdMaestro.setEditable(false);
        TXTIdMaestro.setBackground(new java.awt.Color(204, 204, 255));
        TXTIdMaestro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TXTIdMaestro.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(TXTIdMaestro, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 231, 25));
        TXTIdMaestro.getAccessibleContext().setAccessibleParent(this);

        TXTMaestro.setEditable(false);
        TXTMaestro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TXTMaestro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTMaestroKeyTyped(evt);
            }
        });
        jPanel1.add(TXTMaestro, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 231, -1));

        TXTelefono.setEditable(false);
        TXTelefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(TXTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 231, -1));

        eliminar.setBackground(new java.awt.Color(236, 108, 108));
        eliminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.setBorder(null);
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 80, 30));

        apellidoPaterno.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        apellidoPaterno.setText("Apellido Paterno");
        jPanel1.add(apellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, -1));

        TXTAp1.setEditable(false);
        TXTAp1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TXTAp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTAp1ActionPerformed(evt);
            }
        });
        jPanel1.add(TXTAp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 230, -1));

        apellidoMaterno.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        apellidoMaterno.setText("Apellido Materno");
        jPanel1.add(apellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, -1));

        TXTAp2.setEditable(false);
        TXTAp2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TXTAp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTAp2ActionPerformed(evt);
            }
        });
        jPanel1.add(TXTAp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 230, -1));

        TXTInstrumento.setEditable(false);
        TXTInstrumento.setBackground(new java.awt.Color(204, 204, 255));
        TXTInstrumento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TXTInstrumento.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(TXTInstrumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 230, -1));

        id1.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        id1.setText("Maestros");
        jPanel1.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 100, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNLimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_BTNLimpiarActionPerformed

    private void BTNRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNRegresarActionPerformed
        this.dispose();
        Menu_Maestros ma= new Menu_Maestros();
        ma.setVisible(true);
    }//GEN-LAST:event_BTNRegresarActionPerformed

    private void BTNBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBuscarActionPerformed
        Limpiar();
        strRegistro = javax.swing.JOptionPane.showInputDialog(this, "ID del Maestro a buscar:\n","Buscar al maestro", javax.swing.JOptionPane.QUESTION_MESSAGE);
        try{    
            String url = "jdbc:mysql://127.0.0.1:3306/scherzzo";
            String user = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url, user, password);

                if(con != null){
                   System.out.println("Conexión establecida");
                }

                stmt = con.createStatement();             
                
                //PreparedStatement pst=  con.prepareStatement("SELECT * FROM docente WHERE idDocente = ?");
                PreparedStatement pst=  con.prepareStatement("SELECT idDocente, nombre, apellido1, apellido2, nombre_clase, telefono From docente d, clase c where d.Clase_idClase= c.idClase AND d.idDocente= ?;");
                pst.setString(1, strRegistro);
                
                ResultSet rs= pst.executeQuery();
                if(rs.next()){
                    TXTIdMaestro.setText(rs.getString("idDocente"));
                    TXTMaestro.setText(rs.getString("nombre"));
                    TXTAp1.setText(rs.getString("apellido1"));
                    TXTAp2.setText(rs.getString("apellido2"));
                    TXTelefono.setText(rs.getString("telefono"));
                    TXTInstrumento.setText(rs.getString("nombre_clase"));
                   //CBInstrumentos.setSelectedIndex(Integer.parseInt(rs.getString("Clase_idClase")));
                
                }else{
                    javax.swing.JOptionPane.showMessageDialog(this, "No existe docente\n","AVISO!...",javax.swing.JOptionPane.INFORMATION_MESSAGE);
                }
                
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
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
        
    }//GEN-LAST:event_BTNBuscarActionPerformed

    private void TXTMaestroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTMaestroKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z')&& (c<'A' || c>'Z')&&(c<' ' || c>' ')) evt.consume();
    }//GEN-LAST:event_TXTMaestroKeyTyped

    private void TXTAp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTAp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTAp1ActionPerformed

    private void TXTAp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTAp2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTAp2ActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        try{    
        String url = "jdbc:mysql://127.0.0.1:3306/scherzzo";
                    String user = "root";
                    String password = "";
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    con = DriverManager.getConnection(url, user, password);

                    if(con != null){
                        System.out.println("Conexión establecida");
                    }

                stmt = con.createStatement();             
                //DELETE FROM docente WHERE idDocente = ?
                PreparedStatement pst=  con.prepareStatement("DELETE FROM docente WHERE idDocente = ?");
                pst.setString(1, TXTIdMaestro.getText());
                
                pst.executeUpdate();
                //ResultSet rs= pst.executeQuery();
                Limpiar();
                javax.swing.JOptionPane.showMessageDialog(this, "Eliminación del docente exitosa\n","AVISO!...",javax.swing.JOptionPane.INFORMATION_MESSAGE);
                //System.out.println("Eliminación exitosa");
                
                
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
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
            java.util.logging.Logger.getLogger(Maestro_Busqueda_baja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Maestro_Busqueda_baja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Maestro_Busqueda_baja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Maestro_Busqueda_baja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Maestro_Busqueda_baja().setVisible(true);
            }
        });
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNBuscar;
    private javax.swing.JButton BTNLimpiar;
    private javax.swing.JButton BTNRegresar;
    private javax.swing.JTextField TXTAp1;
    private javax.swing.JTextField TXTAp2;
    private javax.swing.JTextField TXTIdMaestro;
    private javax.swing.JTextField TXTInstrumento;
    private javax.swing.JTextField TXTMaestro;
    private javax.swing.JTextField TXTelefono;
    private javax.swing.JLabel apellidoMaterno;
    private javax.swing.JLabel apellidoPaterno;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel id1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
 public String obtenerIdClase(String nombre, String tabla) throws SQLException {
        String id = null;
        String sql = "SELECT idClase FROM " + tabla + " WHERE nombre_clase = ?";
        try (Connection conexion = obtenerConexion();
             PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, nombre);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    id = rs.getString("idClase");
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
 public void Limpiar(){
    TXTIdMaestro.setText("");
    TXTMaestro.setText("");
    TXTelefono.setText("");
    TXTAp1.setText("");
    TXTAp2.setText("");
    TXTInstrumento.setText("");
    }  
}
