public class Pelicula {
    private String titulo;
    private String fechaDeLanzamiento;
    private String duracion;
    private String pais;
    private String descripcion;
    private int stock;
    private int prestamos;

    private String audiencia;

    public Pelicula() {
    }

    public Pelicula(String titulo, String fechaDeLanzamiento, String duracion, String pais, String descripcion, int stock, int prestamos, String audiencia) {
        this.titulo = titulo;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
        this.duracion = duracion;
        this.pais = pais;
        this.descripcion = descripcion;
        this.stock = stock;
        this.prestamos = prestamos;
        this.audiencia=audiencia;
    }
}
