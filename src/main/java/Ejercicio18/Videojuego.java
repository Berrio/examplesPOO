package Ejercicio18;

public class Videojuego implements Entregable {
    private String titulo;
    private Double horasEstimadas = 10.0;
    private Boolean entregado = false;
    private String genero;
    private String compania;

    public Videojuego() {

    }

    public Videojuego(String titulo, Double horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public Videojuego(String titulo, Double horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
    }

    @Override
    public void entregar() {
        this.entregado = false;
    }

    @Override
    public void devolver() {
        this.entregado = true;
    }

    @Override
    public Boolean isEntregado() {
        return this.entregado;
    }

    public Object compareTo(Object[] t) {
        return null;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(Double horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compañia='" + compania + '\'' +
                '}';
    }
}
