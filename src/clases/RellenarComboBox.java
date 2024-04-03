/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author adria
 */
public class RellenarComboBox {
    public void RellenarCombos(String tabla, String valor, JComboBox combo){
        String sql = "Select * from " + tabla;
        Statement st;
        conectar con = new conectar();
        Connection conexion = con.getConnection(); //establece conexión con la base de datos
        try{
            st= conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                combo.addItem(rs.getString(valor));
            }
        } catch(SQLException ex){
            System.out.println("Error " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error " + ex.getMessage());
        }
    }
    
    public void ConcatenarCombos(String tabla, String colum1, String colum2, String colum3, JComboBox combo){
        conectar con = new conectar();
        Connection conexion = con.getConnection(); //establece conexión con la base de datos
        try{
            Statement stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT CONCAT(" + colum1 + ",' '," + colum2 + ",' '," + colum3 + ") AS resultado FROM " + tabla);
            while(rs.next()){
                String resultado = rs.getString("resultado");
                combo.addItem(resultado);
            }
        } catch(SQLException ex){
            System.out.println("Error " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error " + ex.getMessage());
        }
    }
    
}
