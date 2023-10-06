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
    private Libro libro;
    private boolean estado;
    private int cantidadEjemplares;

    public Ejemplar() {
    }

    public Ejemplar(int idEjemplar, Libro libro, boolean estado, int cantidadEjemplares) {
        this.idEjemplar = idEjemplar;
        this.libro = libro;
        this.estado = estado;
        this.cantidadEjemplares = cantidadEjemplares;
    }

    public Ejemplar(Libro libro, boolean estado, int cantidadEjemplares) {
        this.libro = libro;
        this.estado = estado;
        this.cantidadEjemplares = cantidadEjemplares;
    }

    public int getIdEjemplar() {
        return idEjemplar;
    }

    public void setIdEjemplar(int idEjemplar) {
        this.idEjemplar = idEjemplar;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public void setCantidadEjemplares(int cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }
    
    

}
