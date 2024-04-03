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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author bombón
 */
public class Alumno_modificar extends javax.swing.JFrame {   
    String titulos[] = {"idAlumno","nombre","apellido1","apellido2","fechaNacimiento","numeroCelularTutor","Clase_idClase"};
    
    RellenarComboBox re = new RellenarComboBox();

    Connection con = null;
    Statement stmt = null;

    String var, var2, strRegistro;

    /**
     * Creates new form alumno
     */
    public Alumno_modificar() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setTitle("Actualizar alumno - Scherzzo");
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
        id1 = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        instrumento = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        regresar = new javax.swing.JButton();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldApellido1 = new javax.swing.JTextField();
        jTextFieldApellido2 = new javax.swing.JTextField();
        fechaNacimiento = new javax.swing.JLabel();
        consulta = new javax.swing.JButton();
        apellidoMaterno = new javax.swing.JLabel();
        apellidoPaterno = new javax.swing.JLabel();
        jFechaNac = new com.toedter.calendar.JDateChooser();
        modificar = new javax.swing.JButton();
        jComboBoxClase = new javax.swing.JComboBox<>();
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

        id1.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        id1.setText("ALUMNOS");
        getContentPane().add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 5, -1, 40));

        telefono.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        telefono.setText("Teléfono:");
        getContentPane().add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, -1));

        instrumento.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        instrumento.setText("Instrumento:");
        getContentPane().add(instrumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, -1));

        jTextFieldID.setEditable(false);
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

        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flechita.png"))); // NOI18N
        regresar.setBorderPainted(false);
        regresar.setContentAreaFilled(false);
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        getContentPane().add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 40));

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

        jTextFieldApellido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApellido2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 160, -1));

        fechaNacimiento.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        fechaNacimiento.setText("Fecha de Nacimiento:");
        getContentPane().add(fechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, -1, -1));

        consulta.setBackground(new java.awt.Color(0, 204, 102));
        consulta.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        consulta.setText("Buscar");
        consulta.setBorder(null);
        consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaActionPerformed(evt);
            }
        });
        getContentPane().add(consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 70, 30));

        apellidoMaterno.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        apellidoMaterno.setText("Apellido Materno:");
        getContentPane().add(apellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, -1));

        apellidoPaterno.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        apellidoPaterno.setText("Apellido Paterno:");
        getContentPane().add(apellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, -1, -1));
        getContentPane().add(jFechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 160, -1));

        modificar.setBackground(new java.awt.Color(0, 204, 204));
        modificar.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        modificar.setText("Actualizar");
        modificar.setBorder(null);
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        getContentPane().add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 90, 30));

        jComboBoxClase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxClase.setEnabled(false);
        getContentPane().add(jComboBoxClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 160, -1));

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
            conectar con = new conectar();
            Connection conn = con.getConnection();
            
            try {
                ArrayList<String> clases = con.obtenerClases();

                // Cargar las clases en el JComboBox
                for (String nombreClase : clases) {
                    jComboBoxClase.addItem(nombreClase);
                }
            } catch (SQLException ex) {
                System.out.println("Error al obtener las clases de la base de datos: " + ex.getMessage());
            }

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
                jFechaNac.setDate(fechaNacimientoUtil);
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
                jComboBoxClase.setSelectedItem(nombreClase);
                
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

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        actualizar();
    }//GEN-LAST:event_modificarActionPerformed

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
            java.util.logging.Logger.getLogger(Alumno_modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alumno_modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alumno_modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alumno_modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alumno_modificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Limpiar;
    private javax.swing.JLabel apellidoMaterno;
    private javax.swing.JLabel apellidoPaterno;
    private javax.swing.JButton consulta;
    private javax.swing.JLabel fechaNacimiento;
    private javax.swing.JTextField fondo;
    private javax.swing.JLabel id;
    private javax.swing.JLabel id1;
    private javax.swing.JLabel instrumento;
    private javax.swing.JComboBox<String> jComboBoxClase;
    private com.toedter.calendar.JDateChooser jFechaNac;
    private javax.swing.JTextField jTextFieldApellido1;
    private javax.swing.JTextField jTextFieldApellido2;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    private javax.swing.JButton modificar;
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
        jFechaNac.setDate(null);
        jTextFieldTelefono.setText("");
        jComboBoxClase.setSelectedIndex(0);
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
                
                
                //PreparedStatement pst=  con.prepareStatement("SELECT * FROM docente WHERE idDocente = ?");
                PreparedStatement pst=  con.prepareStatement("SELECT idAlumno, nombre, apellido1, apellido2, fechaNacimiento, numeroCelularTutor, Clase_idClase From alumno a, clase c where a.Clase_idClase= c.idClase AND a.idAlumno= ?;");
                pst.setString(1, strRegistro);
                
                rs= pst.executeQuery();
                if(rs.next()){
                    jTextFieldID.setText(rs.getString("idAlumno"));
                    jTextFieldNombre.setText(rs.getString("nombre"));
                    jTextFieldApellido1.setText(rs.getString("apellido1"));
                    jTextFieldApellido2.setText(rs.getString("apellido2"));   
                    String fechaStr = rs.getString("fechaNacimiento");
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    Date fecha = dateFormat.parse(fechaStr);
                    jFechaNac.setDate(fecha);
                    jTextFieldTelefono.setText(rs.getString("numeroCelularTutor"));
                    jComboBoxClase.setSelectedItem(rs.getString("Clase_idClase"));
                   //CBInstrumentos.setSelectedIndex(Integer.parseInt(rs.getString("Clase_idClase")));
                
                }else{
                    javax.swing.JOptionPane.showMessageDialog(this, "No existe alumno\n","AVISO!...",javax.swing.JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (SQLException ex) {
              ex.printStackTrace();
            } catch (InstantiationException | IllegalAccessException | ClassNotFoundException ex) {
                Logger.getLogger(Alumno_modificar.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                // Manejar cualquier excepción que pueda ocurrir al analizar la cadena de caracteres
                ex.printStackTrace();
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
    
    public void actualizar(){
        if (jTextFieldID.getText().equals("")){
            javax.swing.JOptionPane.showMessageDialog(this, "Actualice los datos correspondientes\n","AVISO!...", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else {
            try{
                    // Obtener la fecha seleccionada del JDateChooser
                    Date date = jFechaNac.getDate();

                    // Crear un formato de fecha que sea compatible con SQL
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    
                    String cadena2, cadena3, cadena4, cadena5, cadena6, cadena7, cadena8;
                    cadena2 = jTextFieldID.getText();
                    cadena3 = jTextFieldNombre.getText();
                    cadena4 = jTextFieldApellido1.getText();
                    cadena5 = jTextFieldApellido2.getText();
                    cadena6 = dateFormat.format(date);
                    cadena7 = jTextFieldTelefono.getText();
                    cadena7 = jTextFieldTelefono.getText();
                    cadena8 = jComboBoxClase.getSelectedItem().toString();
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
                //stmt.executeUpdate("UPDATE alumno SET idAlumno='"+cadena2+ "', nombre='"+cadena3+"', apellido1='"+cadena4+"', apellido2='"+cadena5+"', fechaNacimiento='"+cadena6+"', numeroCelularTutor='"+cadena7+"', Clase_IdClase='"+Clase_idClase+"' WHERE idAlumno='"+jTextFieldID.getText()+"' || nombre='"+jTextFieldNombre.getText()+"' || apellido1='"+jTextFieldApellido1.getText()+"' || apellido2='"+jTextFieldApellido2.getText()+"' || fechaNacimiento='"+jTextFieldNacimiento.getText()+"' || numeroCelularTutor='"+jTextFieldTelefono.getText()+"' || Clase_idClase='"+jComboBoxInstrumentos.getSelectedItem().toString()+"'");                                                                                                                                         
                
                stmt.executeUpdate("UPDATE IGNORE alumno SET idAlumno='"+cadena2+ "', nombre='"+cadena3+"', apellido1='"+cadena4+"', apellido2='"+cadena5+"', fechaNacimiento='"+cadena6+"', numeroCelularTutor='"+cadena7+"' WHERE idAlumno='"+jTextFieldID.getText()+"' || nombre='"+jTextFieldNombre.getText()+"' || apellido1='"+jTextFieldApellido1.getText()+"' || apellido2='"+jTextFieldApellido2.getText()+"' || "
                    + "fechaNacimiento='"+dateFormat.format(date)+"' || numeroCelularTutor='"+jTextFieldTelefono.getText()+"'");

                javax.swing.JOptionPane.showMessageDialog(this, "Los datos del alumno han sido actualizados\n","AVISO!...", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Alumno_modificar.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(Alumno_modificar.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(Alumno_modificar.class.getName()).log(Level.SEVERE, null, ex);
                }
            finally{
                if(con != null){
                    try{
                        con.close();
                        stmt.close();
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }
            }
                //javax.swing.JOptionPane.showMessageDialog(this, "Actualizado correctamente\n","AVISO!...", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
    }    
}

