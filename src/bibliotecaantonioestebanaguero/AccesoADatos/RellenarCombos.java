/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecaantonioestebanaguero.AccesoADatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Otras
 */
public class RellenarCombos {
    private Connection con = null;
    

    public RellenarCombos() {
      con = Conexion.getConexion();
    }
    public void RellenarComboBox(String tabla, String valor, JComboBox combo){
    String sql = "SELECT * FROM "+tabla;
   
    
        try {
             Statement st=con.createStatement();
            ResultSet rs =st.executeQuery(sql);
            while(rs.next()){
                combo.addItem(rs.getNString(valor));
     
            }
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Error"+ ex.toString());
        }
    
    
    
    } 
}
