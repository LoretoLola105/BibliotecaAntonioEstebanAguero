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
public class Ejemplar {
        private int idEjemplar;
    private Libro idIsbn;
    private String estado;
    
    public Ejemplar() {
    }
   
    public Ejemplar(int idEjemplar, Libro idIsbn, String estado) {
        this.idEjemplar = idEjemplar;
        this.idIsbn = idIsbn;
        this.estado = estado;
    }

    public Ejemplar(Libro idIsbn, String estado) {
        this.idIsbn = idIsbn;
        this.estado = estado;
    }

    public int getIdEjemplar() {
        return idEjemplar;
    }

    public void setIdEjemplar(int idEjemplar) {
        this.idEjemplar = idEjemplar;
    }

    public Libro getIdIsbn() {
        return idIsbn;
    }

    public void setIdIsbn(Libro idIsbn) {
        this.idIsbn = idIsbn;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        //return "Ejemplar{" + "idEjemplar=" + idEjemplar + ", idIsbn=" + idIsbn + ", estado=" + estado + '}';
        return idEjemplar+", "+idIsbn+", "+estado;
   
}
}