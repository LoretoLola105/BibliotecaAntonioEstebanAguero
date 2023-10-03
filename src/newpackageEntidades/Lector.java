/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackageEntidades;

/**
 *
 * @author Otras
 */
public class Lector {
     private int idSocio;
    private String apellido;
    private String nombre;
    private int dni;
    private String domicilio;
    private int numeroTel;
    private String email;
    private boolean estado;

    public Lector(int idSocio, String apellido, String nombre, int dni, String domicilio, int numeroTel, String email, boolean estado) {
        this.idSocio = idSocio;
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.numeroTel = numeroTel;
        this.email = email;
        this.estado = estado;
    }

    public Lector(String apellido, String nombre, int dni, String domicilio, int numeroTel, String email, boolean estado) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.numeroTel = numeroTel;
        this.email = email;
        this.estado = estado;
    }

    public int getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(int idSocio) {
        this.idSocio = idSocio;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(int numeroTel) {
        this.numeroTel = numeroTel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Lector{" + "idSocio=" + idSocio + ", apellido=" + apellido + ", nombre=" + nombre + ", dni=" + dni + ", domicilio=" + domicilio + ", numeroTel=" + numeroTel + ", email=" + email + ", estado=" + estado + '}';
    }

   
}
