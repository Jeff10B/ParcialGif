
public class Libro {
    
    private String titulo;
    private String autor;
    private int numeroEjemplares;
    private int ejemplaresPrestados;

    
    public Libro() {
    }

    // Constructor con todos los parámetros
    public Libro(String titulo, String autor, int numeroEjemplares, int ejemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.ejemplaresPrestados = ejemplaresPrestados;
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

    
    public boolean prestamo() {
        if (ejemplaresPrestados < numeroEjemplares) {
            ejemplaresPrestados++;
            return true; 
        }
        return false; 
    }

    public boolean devolucion() {
        if (ejemplaresPrestados > 0) {
            ejemplaresPrestados--;
            return true; 
        }
        return false;
    }

    
    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor +
                ", Ejemplares: " + numeroEjemplares + ", Prestados: " + ejemplaresPrestados;
    }
}
