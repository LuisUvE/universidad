package inmuebles;

public class Casa extends Vivienda {

    private int cantidadPisos;

    public Casa(int idInmobiliario, int metrosCuadrados, String direccion, int numeroHabitaciones, int numeroBaños, int cantidadPisos) {
        super(idInmobiliario, metrosCuadrados, direccion, numeroHabitaciones, numeroBaños);
        this.cantidadPisos = cantidadPisos;
    }

    public int getCantidadPisos() {
        return cantidadPisos;
    }

    public void setCantidadPisos(int cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }

}