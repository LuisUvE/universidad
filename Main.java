public class Main {
    public static void main(String[] args) {
        
        LibroDeTextoUNIAJC libroUNIAJC = new LibroDeTextoUNIAJC("Atlas de anatomia Humana", "Frank H. Netter", 45.65, "Ciencias Humanas", "Facultad de Ciencias");
        Novela novela = new Novela("La condena sangrienta", "Alejandra Pizarnik", 12.66, "Ficcion");

    
        System.out.println("Información del Libro de Texto de la Universidad Antonio José Camacho:");
        libroUNIAJC.imprimirInformacion();
        System.out.println();

        System.out.println("Información de la Novela:");
        novela.imprimirInformacion();
    }
}
