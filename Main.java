package inmuebles;

public class Main {

    public static void main(String[] args) {

        // Creamos un inmueble
        Inmueble inmueble = new Inmueble(1, 100, "Calle 123");

        // Imprimimos los datos del inmueble
        System.out.println("ID Inmobiliario: " + inmueble.getIdInmobiliario());
        System.out.println("Metros cuadrados: " + inmueble.getMetrosCuadrados());
        System.out.println("Dirección: " + inmueble.getDireccion());

        // Creamos una vivienda
        Vivienda vivienda = new Vivienda(2, 200, "Calle 456", 3, 2);

        // Imprimimos los datos de la vivienda
        System.out.println("ID Inmobiliario: " + vivienda.getIdInmobiliario());
        System.out.println("Metros cuadrados: " + vivienda.getMetrosCuadrados());
        System.out.println("Dirección: " + vivienda.getDireccion());
        System.out.println("Número de habitaciones: " + vivienda.getNumeroHabitaciones());
        System.out.println("Número de baños: " + vivienda.getNumeroBaños());

        // Creamos una casa
        Casa casa = new Casa(3, 300, "Calle 789", 4, 3, 2);

        // Imprimimos los datos de la casa
        System.out.println("ID Inmobiliario: " + casa.getIdInmobiliario());
        System.out.println("Metros cuadrados: " + casa.getMetrosCuadrados());
        System.out.println("Dirección: " + casa.getDireccion());
        System.out.println("Número de habitaciones: " + casa.getNumeroHabitaciones());
        System.out.println("Número de baños: " + casa.getNumeroBaños());
        System.out.println("Cantidad de pisos: " + casa.getCantidadPisos());

        // Creamos una casa rural
        CasaRural casaRural = new CasaRural(4, 400, "Calle 012", 5, 4, 2, 10, 1000);

        // Imprimimos los datos de la casa rural
        System.out.println("ID Inmobiliario: " + casaRural.getIdInmobiliario());
        System.out.println("Metros cuadrados: " + casaRural.getMetrosCuadrados());
        System.out.println("Dirección: " + casaRural.getDireccion());
        System.out.println("Número de habitaciones: " + casaRural.getNumeroHabitaciones());
        System.out.println("Número de baños: " + casaRural.getNumeroBaños());
        System.out.println("Cantidad de pisos: " + casaRural.getCantidadPisos());
        System.out.println("Distancia a la cabecera municipal: " + casaRural.getDistanciaCabeceraMunicipal());
        System.out.println("Altitud sobre el nivel del mar: " + casaRural.getAltitudNivelMar());
    }
}
