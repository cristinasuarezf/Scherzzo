
package JFrames;

import clases.conectar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author bombón
 */
public class Alumno_consulta_baja extends javax.swing.JFrame {   
    String titulos[] = {"idAlumno","nombre","apellido1","apellido2","fechaNacimiento","numeroCelularTutor","Clase_idClase"};
    Connection con = null;
    Statement stmt = null;
    PreparedStatement ps;

    String var, var2, strRegistro;

    /**
     * Creates new form alumno
     */
    public Alumno_consulta_baja() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setTitle("Consulta de alumno - Scherzzo");
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
        lapiz = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        id1 = new javax.swing.JLabel();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldApellido1 = new javax.swing.JTextField();
        jTextFieldApellido2 = new javax.swing.JTextField();
        fechaNac = new com.toedter.calendar.JDateChooser();
        fechaNacimiento = new javax.swing.JLabel();
        jTextFieldClase = new javax.swing.JTextField();
        consulta = new javax.swing.JButton();
        apellidoMaterno = new javax.swing.JLabel();
        apellidoPaterno = new javax.swing.JLabel();
        eliminar = new javax.swing.JButton();
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
        instrumento.setText("Clase:");
        getContentPane().add(instrumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, -1));

        jTextFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 160, -1));

        jTextFieldNombre.setEditable(false);
        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 160, -1));

        lapiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lapiz.png"))); // NOI18N
        lapiz.setBorderPainted(false);
        lapiz.setContentAreaFilled(false);
        lapiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lapizActionPerformed(evt);
            }
        });
        getContentPane().add(lapiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, -1));

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

        jTextFieldTelefono.setEditable(false);
        jTextFieldTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 160, -1));

        jTextFieldApellido1.setEditable(false);
        jTextFieldApellido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApellido1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 160, -1));

        jTextFieldApellido2.setEditable(false);
        jTextFieldApellido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApellido2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 160, -1));
        getContentPane().add(fechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 160, -1));

        fechaNacimiento.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        fechaNacimiento.setText("Fecha de Nacimiento:");
        getContentPane().add(fechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, -1, -1));

        jTextFieldClase.setEditable(false);
        jTextFieldClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldClaseActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 160, -1));

        consulta.setBackground(new java.awt.Color(0, 204, 102));
        consulta.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        consulta.setText("Buscar");
        consulta.setBorder(null);
        consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaActionPerformed(evt);
            }
        });
        getContentPane().add(consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 70, 30));

        apellidoMaterno.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        apellidoMaterno.setText("Apellido Materno:");
        getContentPane().add(apellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, -1));

        apellidoPaterno.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        apellidoPaterno.setText("Apellido Paterno:");
        getContentPane().add(apellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, -1, -1));

        eliminar.setBackground(new java.awt.Color(236, 108, 108));
        eliminar.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
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

    private void jTextFieldApellido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApellido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldApellido1ActionPerformed

    private void jTextFieldApellido2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApellido2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldApellido2ActionPerformed

    private void consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaActionPerformed
    //inicializa los jTextField en blanco
    Limpiar();
      
    // Mostrar un diálogo para que el usuario ingrese el ID del alumno
    String idAlumnoString = JOptionPane.showInputDialog("Ingrese el ID del alumno:");
    
    // Verificar que el usuario ingresó un valor válido
    if (idAlumnoString != null && !idAlumnoString.isEmpty()) {
        try {
            // Convertir el ID ingresado a un entero
            int idAlumno = Integer.parseInt(idAlumnoString);

            // Consulta para buscar al alumno correspondiente al ID ingresado
            String consulta = "SELECT * FROM alumno WHERE idAlumno = " + idAlumno;

            // Establecer la conexión a la base de datos
            conectar conexion = new conectar();
            Connection conn = conexion.getConnection();

            // Ejecutar la consulta y obtener el resultado
            Statement sentencia = conn.createStatement();
            ResultSet resultado = sentencia.executeQuery(consulta);

            // Si se encontró el alumno, mostrar sus datos en los campos de texto correspondientes
            if (resultado.next()) {
                jTextFieldID.setText(resultado.getString("idAlumno"));
                jTextFieldNombre.setText(resultado.getString("nombre"));
                jTextFieldApellido1.setText(resultado.getString("apellido1"));
                jTextFieldApellido2.setText(resultado.getString("apellido2"));
                // Convertir la fecha de nacimiento a un objeto java.sql.Date
                java.sql.Date fechaNacimiento = resultado.getDate("fechaNacimiento");

                // Convertir la fecha de nacimiento a un objeto java.util.Date
                java.util.Date fechaNacimientoUtil = new java.util.Date(fechaNacimiento.getTime());

                // Establecer la fecha de nacimiento en el JDateChooser correspondiente
                fechaNac.setDate(fechaNacimientoUtil);
                jTextFieldTelefono.setText(resultado.getString("numeroCelularTutor"));
                
                // Obtener el id de clase del resultado de la consulta
                int idClase = resultado.getInt("Clase_idClase");

                // Consultar la tabla de clases para obtener el nombre de la clase correspondiente al id de clase
                String nombreClase = null;
                String consultaNombreClase = "SELECT nombre_clase FROM clase WHERE idClase = " + idClase;
                PreparedStatement statement2 = conn.prepareStatement(consultaNombreClase);
                ResultSet resultadoNombreClase = statement2.executeQuery();
                if (resultadoNombreClase.next()) {
                    nombreClase = resultadoNombreClase.getString("nombre_clase");
                }

                // Establecer el nombre de la clase en el campo de texto correspondiente
                jTextFieldClase.setText(nombreClase);
                
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ningún alumno con ese ID.");
            }

            // Cerrar la conexión a la base de datos
            conn.close();
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar al alumno.");
            System.out.println("Error al conectar: " + e);
        }
    }
     
    }//GEN-LAST:event_consultaActionPerformed

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
                PreparedStatement pst=  con.prepareStatement("DELETE FROM alumno WHERE idAlumno = ?");
                pst.setString(1, jTextFieldID.getText());
                
                pst.executeUpdate();
                //ResultSet rs= pst.executeQuery();
                Limpiar();
                javax.swing.JOptionPane.showMessageDialog(this, "Eliminación del alumno exitosa\n","AVISO!...",javax.swing.JOptionPane.INFORMATION_MESSAGE);
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

    private void lapizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lapizActionPerformed
        this.dispose();
        Alumno_modificar modificar = new Alumno_modificar();
        modificar.setVisible(true);

    }//GEN-LAST:event_lapizActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        this.dispose();
        Menu_alumno menu = new Menu_alumno();
        menu.setVisible(true);
    }//GEN-LAST:event_regresarActionPerformed

    private void jTextFieldClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldClaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldClaseActionPerformed

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
            java.util.logging.Logger.getLogger(Alumno_consulta_baja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alumno_consulta_baja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alumno_consulta_baja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alumno_consulta_baja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alumno_consulta_baja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Limpiar;
    private javax.swing.JLabel apellidoMaterno;
    private javax.swing.JLabel apellidoPaterno;
    private javax.swing.JButton consulta;
    private javax.swing.JButton eliminar;
    private com.toedter.calendar.JDateChooser fechaNac;
    private javax.swing.JLabel fechaNacimiento;
    private javax.swing.JTextField fondo;
    private javax.swing.JLabel id;
    private javax.swing.JLabel id1;
    private javax.swing.JLabel instrumento;
    private javax.swing.JTextField jTextFieldApellido1;
    private javax.swing.JTextField jTextFieldApellido2;
    private javax.swing.JTextField jTextFieldClase;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    private javax.swing.JButton lapiz;
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
        jTextFieldClase.setText("");
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
    
    public void consulta() throws ParseException{
        String cap = "";
        ResultSet rs = null;
        var2 = var;

        String sql2 ="SELECT idAlumno,nombre,apellido1,apellido2,fechaNacimiento,numeroCelularTutor,Clase_idClase FROM alumno WHERE idAlumno = '"+var2+"'";
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
                rs = stmt.executeQuery(sql2);
                
                int i=1;
                    while (rs.next()){
                        String id = rs.getString("idAlumno");
                        String inom = rs.getString("nombre");
                        String iap1 = rs.getString("apellido1");
                        String iap2 = rs.getString("apellido2");
                        String ifnac = rs.getString("fechaNacimiento");
                        String inumcel = rs.getString("numeroCelularTutor");
                        String idclase = rs.getString("Clase_idClase");
                        
                        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                        Date dfechaNac = dateFormat.parse(ifnac);
                        
                        jTextFieldID.setText(id);
                        jTextFieldNombre.setText(inom);
                        jTextFieldApellido1.setText(iap1);
                        jTextFieldApellido2.setText(iap2);   
                        fechaNac.setDate(dfechaNac);
                        jTextFieldTelefono.setText(inumcel);
                        jTextFieldClase.setText(idclase);

                        
                    }
            } catch (SQLException ex) {
              ex.printStackTrace();
            } catch (InstantiationException | IllegalAccessException | ClassNotFoundException ex) {
                Logger.getLogger(Alumno_consulta_baja.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            finally{
                if(rs != null){
                    try{
                        rs.close();
                    } catch (SQLException ex){
                        System.out.println(ex.getMessage());
                        ex.printStackTrace();
                    }
                }
                if (stmt != null){
                    try{
                        stmt.close();
                    } catch (SQLException ex){
                        System.out.println(ex.getMessage());
                        ex.printStackTrace();
                    }
                }
                if (con != null){
                    try{
                        con.close();
                    } catch (SQLException ex){
                        System.out.println(ex.getMessage());
                        ex.printStackTrace();
                    }
                }
                
            }
    }

    public int eliminar(String idAlumno){
        int res =0;
        try{
            ps = con.prepareStatement("DELETE FROM alumno WHERE idAlumno=?");
            ps.setString(1,idAlumno);
            res=ps.executeUpdate();
            System.out.println("Usuario eliminado correctamente");
        } catch (Exception e){
            System.out.println("Error al eliminar alumno");
        }
        return res;
    }
}
