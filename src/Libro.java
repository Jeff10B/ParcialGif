// Libro.java
public class Libro {
    // Atributos privados para encapsulamiento
    private String titulo;
    private String autor;
    private int numeroEjemplares;
    private int ejemplaresPrestados;

    // Constructor por defecto
    public Libro() {
    }

    // Constructor con todos los parámetros
    public Libro(String titulo, String autor, int numeroEjemplares, int ejemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    // Métodos Get y Set
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

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(int ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    // Método prestamo: Incrementa el número de ejemplares prestados
    public boolean prestamo() {
        if (ejemplaresPrestados < numeroEjemplares) {
            ejemplaresPrestados++;
            return true; // Préstamo exitoso
        }
        return false; // No hay ejemplares disponibles
    }

    // Método devolucion: Decrementa el número de ejemplares prestados
    public boolean devolucion() {
        if (ejemplaresPrestados > 0) {
            ejemplaresPrestados--;
            return true; // Devolución exitosa
        }
        return false; // No hay ejemplares para devolver
    }

    // Sobrescritura del método toString para imprimir la información del libro
    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor +
                ", Ejemplares: " + numeroEjemplares + ", Prestados: " + ejemplaresPrestados;
    }
}