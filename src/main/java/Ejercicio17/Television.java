package Ejercicio17;

public class Television extends Electrodomesticos {
    private Double resolucion = 20.0;
    private Boolean sintonizador = false;

    public Television() {

    }

    public Television(Double precio, Double peso) {
        super(precio, peso);
    }

    public Television(Double precio, Double peso, String color, char consumoEnergetico, Double resolucion, Boolean sintonizador) {
        super(precio, peso, color, consumoEnergetico);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public Double getResolucion() {
        return resolucion;
    }

    public Boolean getSintonizador() {
        return sintonizador;
    }

    @Override
    public double precioFinal() {
        if (this.resolucion > 40) {
            return super.precioFinal() * 1.3;
        }

        if (this.resolucion > 40 && this.sintonizador) {
            return super.precioFinal() * 1.3 + 50;
        }
        return super.precioFinal();
    }
}
