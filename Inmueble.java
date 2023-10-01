package inmuebles;

public class Inmueble {

    private int idInmobiliario;
    private int metrosCuadrados;
    private String direccion;

    public Inmueble(int idInmobiliario, int metrosCuadrados, String direccion) {
        this.idInmobiliario = idInmobiliario;
        this.metrosCuadrados = metrosCuadrados;
        this.direccion = direccion;
    }

    public int getIdInmobiliario() {
        return idInmobiliario;
    }

    public void setIdInmobiliario(int idInmobiliario) {
        this.idInmobiliario = idInmobiliario;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}