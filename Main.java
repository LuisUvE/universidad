public class Main {
    public static void main(String[] args) {
        
        LibroDeTextoUNIAJC libroUNIAJC = new LibroDeTextoUNIAJC("Matemáticas Avanzadas", "Profesor X", 45.99, "Matemáticas", "Facultad de Ciencias");
        Novela novela = new Novela("Cien años de soledad", "Gabriel García Márquez", 12.99, "Realista");

    
        System.out.println("Información del Libro de Texto de la Universidad Antonio José Camacho:");
        libroUNIAJC.imprimirInformacion();
        System.out.println();

        System.out.println("Información de la Novela:");
        novela.imprimirInformacion();
    }
}
