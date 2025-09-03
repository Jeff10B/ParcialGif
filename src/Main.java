import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Crear objeto libro1 usando el constructor por defecto y pidiendo datos
        Libro libro1 = new Libro();
        System.out.println("--- Creación del Libro 1 ---");
        System.out.print("Introduce el título: ");
        libro1.setTitulo(sc.nextLine());
        System.out.print("Introduce el autor: ");
        libro1.setAutor(sc.nextLine());
        System.out.print("Introduce el número de ejemplares: ");
        libro1.setNumeroEjemplares(sc.nextInt());
        sc.nextLine(); // Consumir el salto de línea
        libro1.setEjemplaresPrestados(0); // Inicialmente 0 prestados

        // Crear objeto libro2 usando el constructor con parámetros
        System.out.println("\n--- Creación del Libro 2 (con parámetros) ---");
        Libro libro2 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 50, 5);

        // Mostrar información de los libros
        System.out.println("\n--- Información Inicial de los Libros ---");
        System.out.println("Libro 1: " + libro1.toString());
        System.out.println("Libro 2: " + libro2.toString());

        // Probar métodos de préstamo y devolución
        System.out.println("\n--- Probando Métodos ---");
        // Préstamo en libro1
        System.out.println("Intentando prestar un ejemplar de " + libro1.getTitulo() + "...");
        if (libro1.prestamo()) {
            System.out.println("Préstamo exitoso.");
        } else {
            System.out.println("No hay ejemplares disponibles para prestar.");
        }

        // Devolución en libro2
        System.out.println("Intentando devolver un ejemplar de " + libro2.getTitulo() + "...");
        if (libro2.devolucion()) {
            System.out.println("Devolución exitosa.");
        } else {
            System.out.println("No hay ejemplares para devolver.");
        }

        // Mostrar el estado final
        System.out.println("\n--- Estado Final de los Libros ---");
        System.out.println("Libro 1: " + libro1.toString());
        System.out.println("Libro 2: " + libro2.toString());
        
        sc.close();
    }
}
//vamos para el segundo commit
