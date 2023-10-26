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
import javax.swing.JOptionPane;
import newpackageEntidades.Lector;

/**
 *
 * @author Otras
 */
public class LectorData {
     private Connection con = null;
  
    public LectorData() {
        con = Conexion.getConexion();
    }

    public void guardarLector(Lector lector) {

        String sql = "INSERT INTO lector(nombre, dni, domicilio, email, telefono, estado) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, lector.getNombre());
            ps.setInt(2, lector.getDni());
            ps.setString(3, lector.getDomicilio());
            ps.setString(4, lector.getEmail());
            ps.setInt(5, lector.getNumeroTel());
            ps.setBoolean(6, true); // if reducido
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {

                lector.setIdLector(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Lector Guardado con exito");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Lector" + ex.getMessage());

        }

    }

    public Lector buscarLector(int id) {
     
        
        String sql = "SELECT nombre, dni, domicilio, email, telefono, estado FROM lector "
                + "WHERE  idLector = ? AND estado = 1";
   Lector lector = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);//reemplaza en signo de pregunta por el id
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                lector = new Lector();//se utiliza el constructor vacio para crear un nuevo alumno
                lector.setIdLector((id));
                lector.setNombre(rs.getString("nombre"));
                lector.setDni(rs.getInt("dni"));
                lector.setDomicilio(rs.getString("domicilio"));
                lector.setEmail(rs.getString("email"));
                lector.setNumeroTel(rs.getInt("telefono"));
                lector.setEstado(true);

            } else {
                JOptionPane.showMessageDialog(null, "No existe ese lector");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Lector " + ex.getMessage());

        }
        return lector;

    }

    public Lector buscarLectorPorDni(int dni) {

        String sql = "SELECT idLector, nombre, dni, domicilio, email,  telefono, estado FROM lector WHERE dni = ? AND estado = 1";

        Lector lector = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                lector = new Lector();
                lector.setIdLector(rs.getInt("idLector"));
                lector.setNombre(rs.getString("nombre"));
                lector.setDni(rs.getInt("dni"));
                lector.setDomicilio(rs.getString("domicilio"));
                lector.setEmail(rs.getString("email"));
                lector.setNumeroTel(rs.getInt("telefono"));
                lector.setEstado(true);

            } else {
                JOptionPane.showMessageDialog(null, "No existe ese Lector");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Lector " + ex.getMessage());
        }
        return lector;
    }

    public List<Lector> listarLectores() {
        ArrayList<Lector> lectores = new ArrayList<>();
        String sql = "SELECT idLector, nombre, dni, domicilio, email, telefono, estado FROM lector WHERE estado = 1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Lector lector = new Lector();
                lector.setIdLector(rs.getInt("idLector"));
                lector.setNombre(rs.getString("nombre"));
                lector.setDni(rs.getInt("dni"));
                lector.setDomicilio(rs.getString("domicilio"));
                lector.setEmail(rs.getString("email"));
                lector.setNumeroTel(rs.getInt("telefono"));
                lector.setEstado(true);

                lectores.add(lector);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno " + ex.getMessage());
        }
        return lectores;
    }

    public void modificarLector(Lector lector) {

        String sql = "UPDATE lector SET nombre = ? , dni = ? , domicilio = ? , email = ? ,  telefono = ? WHERE idLector = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, lector.getNombre());
            ps.setInt(2, lector.getDni());
            ps.setString(3, lector.getDomicilio());
            ps.setString(4, lector.getEmail());
            ps.setInt(5, lector.getNumeroTel());
            ps.setInt(6, lector.getIdLector());
        

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El Lector no existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Lector " + ex.getMessage());
        }

    }

    public void eliminarLector(int idSocio) {
        String sql = " UPDATE lector SET estado = 0 WHERE idLector = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idSocio);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Lector Eliminado con exito");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Lector" + e.getMessage());
        }

    }
}
