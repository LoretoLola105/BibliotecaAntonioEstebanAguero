/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecaantonioestebanaguero.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import newpackageEntidades.Libro;

/**
 *
 * @author Otras
 */
public class LibroData {
     private Connection con = null;
    
    
  public LibroData() {
      
      con = Conexion.getConexion();
    
    }  
    
   public void guardarLibro(Libro libro){
   
       String sql= "INSERT INTO libro(titulo, autor,  genero, editorial, estado) VALUES (?, ?, ?, ?, ?) ";
       
        try {
            PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, libro.getTitulo());
            ps.setString(2, libro.getAutor());
            ps.setString(3, libro.getGenero());
            ps.setString(4, libro.getEditorial());
            ps.setBoolean(5, libro.isEstado());
            ps.executeUpdate();
            
            ResultSet rs= ps.getGeneratedKeys();
            
            if(rs.next()){
            libro.setIsbn(rs.getInt(1));
           JOptionPane.showMessageDialog(null, "Libro Guardado Exitosamente"); 
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla libro" + ex.getMessage());
        }
   
   } 
    
public Libro buscarLibro(int idLibro){

    Libro libro=null;
    
    String sql = " SELECT titulo, autor, genero, editorial, estado FROM libro WHERE idLibro = ? AND estado = 1 ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idLibro);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
            libro = new Libro();
            libro.setIsbn(idLibro);
            libro.setTitulo(rs.getString("titulo"));
            libro.setAutor(rs.getString("Autor"));
            libro.setGenero(rs.getString("genero"));
            libro.setEditorial(rs.getString("editorial"));
            libro.setEstado(true);
  
            }else{
            JOptionPane.showMessageDialog(null, "No existe ese Libro");
            }
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Libro. " + ex.getMessage());
        }
        return libro;
}

public Libro buscarLibroPorTitulo(String titulo){

    Libro libro=null;
    
    String sql = "SELECT idLibro, autor, genero, editorial, estado FROM libro WHERE titulo = ? AND estado = 1 ";

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, titulo);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            libro = new Libro();
            libro.setIsbn(rs.getInt("idLibro"));
            libro.setTitulo(titulo);
            libro.setAutor(rs.getString("autor"));
            libro.setGenero(rs.getString("genero"));
            libro.setEditorial(rs.getString("editorial"));
            libro.setEstado(true);
        } else {
            JOptionPane.showMessageDialog(null, "No existe ese Libro");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Libro. " + ex.getMessage());
    }
    return libro;
}

public void modificarLibro(Libro libro){

String sql = "UPDATE libro SET titulo = ? , autor = ? , genero = ? , editorial = ?  WHERE idLibro = ? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, libro.getTitulo());
            ps.setString(2, libro.getAutor());
            ps.setString(3, libro.getGenero());
            ps.setString(4, libro.getEditorial());
            ps.setInt(5, libro.getIsbn());
            
                     int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Libro modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El Libro buscado no existe. ");
            }

            
        } catch (SQLException ex) {
            Logger.getLogger(LibroData.class.getName()).log(Level.SEVERE, null, ex);
        }


}

public List<Libro> listarLibro(){
ArrayList<Libro> libros = new ArrayList<>();

    String sql = "SELECT idLibro, titulo, autor, genero, editorial FROM libro WHERE estado = 1 ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
           Libro libro = new Libro();
           libro.setIsbn(rs.getInt("idLibro"));
           libro.setTitulo(rs.getString("Titulo"));
           libro.setAutor(rs.getString("Autor"));
           libro.setGenero(rs.getString("Genero"));
           libro.setEditorial(rs.getString("Editorial"));
           libro.setEstado(true);
           
           libros.add(libro);
            }
            ps.close();
        } catch (SQLException ex) {
       JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Libro. " + ex.getMessage());
        }
        return libros;
}

public void eliminarLibro(int id){

 String sql = " UPDATE libro SET estado = 0 WHERE idLibro = ? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Libro Eliminado Exitosamente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Libro"+ex.getMessage());
        }

}
}
