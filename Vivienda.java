package inmuebles;

public class Vivienda extends Inmueble {

    private int numeroHabitaciones;
    private int numeroBaños;

    public Vivienda(int idInmobiliario, int metrosCuadrados, String direccion, int numeroHabitaciones, int numeroBaños) {
        super(idInmobiliario, metrosCuadrados, direccion);
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBaños = numeroBaños;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public int getNumeroBaños() {
        return numeroBaños;
    }

    public void setNumeroBaños(int numeroBaños) {
        this.numeroBaños = numeroBaños;
    }

}