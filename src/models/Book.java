package models;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private String titulo;
    private String autor;
    private int anio;

    public Book(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
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

    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public int compareTo(Book otroLibro) {
        // Ordenar por título en orden descendente
        int comparacionTitulo = otroLibro.titulo.compareTo(this.titulo);

        // Si los títulos son diferentes, devuelve el resultado de la comparación de títulos
        if (comparacionTitulo != 0) {
            return comparacionTitulo;
        }

        // Si los títulos son iguales, ordenar por año en orden ascendente
        return Integer.compare(this.anio, otroLibro.anio);
    }

    // Implementación de equals() y hashCode() para la eliminación de duplicados
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return anio == book.anio && Objects.equals(titulo, book.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, anio);
    }

    @Override
    public String toString() {
        return "Book{" +
               "titulo='" + titulo + '\'' +
               ", autor='" + autor + '\'' +
               ", anio=" + anio +
               '}';
    }

    
    
}
