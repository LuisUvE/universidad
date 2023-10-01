package inmuebles;

public class CasaRural extends Casa {

    private int distanciaCabeceraMunicipal;
    private int altitudNivelMar;

    public CasaRural(int idInmobiliario, int metrosCuadrados, String direccion, int numeroHabitaciones, int numeroBaños, int cantidadPisos, int distanciaCabeceraMunicipal, int altitudNivelMar) {
        super(idInmobiliario, metrosCuadrados, direccion, numeroHabitaciones, numeroBaños, cantidadPisos);
        this.distanciaCabeceraMunicipal = distanciaCabeceraMunicipal;
        this.altitudNivelMar = altitudNivelMar;
    }

    public int getDistanciaCabeceraMunicipal() {
        return distanciaCabeceraMunicipal;
    }

    public void setDistanciaCabeceraMunicipal(int distanciaCabeceraMunicipal) {
        this.distanciaCabeceraMunicipal = distanciaCabeceraMunicipal;
    }

    public int getAltitudNivelMar() {
        return altitudNivelMar;
        
    }
}