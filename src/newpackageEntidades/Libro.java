/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackageEntidades;

import java.util.Objects;

/**
 *
 * @author Otras
 */
public class Libro {
     private int Isbn;
    private String titulo;
    private String autor;
    private String genero;
    private String editorial;
    private boolean estado;
    
     public Libro() {
        
    }

    public Libro(int Isbn, String titulo, String autor, String genero, String editorial, boolean estado) {
        this.Isbn = Isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.editorial = editorial;
        this.estado = estado;
    }

    public Libro(String titulo, String autor, String tipo, String editorial, boolean estado) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.editorial = editorial;
        this.estado = estado;
    }

   

    public int getIsbn() {
        return Isbn;
    }

    public void setIsbn(int Isbn) {
        this.Isbn = Isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

  
    public String getGenero() {
        return genero;
    }

    public void setGenero(String tipo) {
        this.genero = genero;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Libro{" + "Isbn=" + Isbn + ", titulo=" + titulo + ", autor=" + autor +" ,genero=" + genero + ", editorial=" + editorial + ", estado=" + estado + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.Isbn;
        hash = 53 * hash + Objects.hashCode(this.titulo);
        hash = 53 * hash + Objects.hashCode(this.autor);
        hash = 53 * hash + Objects.hashCode(this.genero);
        hash = 53 * hash + Objects.hashCode(this.editorial);
        hash = 53 * hash + (this.estado ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (this.Isbn != other.Isbn) {
            return false;
        }
        if (this.estado != other.estado) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.genero, other.genero)) {
            return false;
        }
        if (!Objects.equals(this.editorial, other.editorial)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        return true;
    }
    
   
}
