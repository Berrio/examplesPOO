package Ejercicio18;

public class Serie implements Entregable{

    private String titulo;
    private Integer numTemporadas=3;
    private Boolean entregado=false;
    private String genero;
    private String creador;

    public Serie() {
    }

    public Serie(String titulo, Integer numTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numTemporadas = numTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    @Override
    public void entregar() {
        this.entregado=false;
    }

    @Override
    public void devolver() {
        this.entregado=true;
    }

    @Override
    public Boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public Object compareTo(Object[] t) {
        return null;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getNumTemporadas() {
        return numTemporadas;
    }

    public void setNumTemporadas(Integer numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numTemporadas=" + numTemporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }
}
