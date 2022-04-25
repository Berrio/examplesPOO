package Ejercicio17;

public class Lavadora extends Electrodomesticos{
    private Double Carga=5.0;

    public Lavadora() {
    }

    public Lavadora(Double precio, Double peso, Double carga) {
        super(precio, peso);
        Carga = carga;
    }

    public Lavadora(Double precio, Double peso, String color, char consumoEnergetico, Double carga) {
        super(precio, peso, color, consumoEnergetico);
        Carga = carga;
    }

    public Double getCarga() {
        return Carga;
    }

    @Override
    public double precioFinal() {
        if(this.Carga>30)
        {
            return super.precioFinal()+50.0;
        }
        return super.precioFinal();
    }
}
