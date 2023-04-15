import java.time.LocalDate;

public class Alquiler {
    private Pelicula pelicula;
    private Cliente cliente;
    private LocalDate fechaDeAlquiler;
    private LocalDate fechaDeDevolucion;
    private Boolean devuelto;
    private int id;
    private static int cantAlquileres=0;

    public Alquiler(){}

    public Alquiler(Pelicula pelicula, Cliente cliente, LocalDate fechaDeAlquiler, LocalDate fechaDeDevolucion, Boolean devuelto, int id) {
        this.pelicula = pelicula;
        this.cliente = cliente;
        this.fechaDeAlquiler = LocalDate.now();
        this.fechaDeDevolucion = fechaDeDevolucion;
        this.devuelto = false;
        this.id = cantAlquileres;
        cantAlquileres++;
    }
}
