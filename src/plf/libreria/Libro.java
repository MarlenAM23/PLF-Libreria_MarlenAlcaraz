/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plf.libreria;

import java.util.Objects;

/**
 *
 * @author LMC Alumno
 */
public class Libro {

    private String titulo;
    private String editorial;
    private String edicion;
    private Autor autor;
    private String isbn;
    private int anio;

    public Libro(String titulo, String editorial, String edicion, Autor autor, String isbn, int anio) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.edicion = edicion;
        this.autor = autor;
        this.isbn = isbn;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getEdicion() {
        return edicion;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getAnio() {
        return anio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.titulo);
        hash = 29 * hash + Objects.hashCode(this.editorial);
        hash = 29 * hash + Objects.hashCode(this.edicion);
        hash = 29 * hash + Objects.hashCode(this.autor);
        hash = 29 * hash + Objects.hashCode(this.isbn);
        hash = 29 * hash + this.anio;
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
        if (this.anio != other.anio) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.editorial, other.editorial)) {
            return false;
        }
        if (!Objects.equals(this.edicion, other.edicion)) {
            return false;
        }
        if (!Objects.equals(this.isbn, other.isbn)) {
            return false;
        }
        return Objects.equals(this.autor, other.autor);
    }
    
    

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", editorial=" + editorial + ", edicion=" + edicion + ", autor=" + autor + ", isbn=" + isbn + ", anio=" + anio + '}';
    }

}
