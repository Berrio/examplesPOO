package Ejercicio17;

public class Electrodomesticos {

    private Double precioBase;
    private  String color ;
    private char consumoEnergetico;
    private Double peso;

    public Electrodomesticos(){
        this.color="blanco";
        this.consumoEnergetico='F';
        this.precioBase=100.0;
        this.peso=5.0;
    }
    public Electrodomesticos(Double precio,Double peso){
        this.peso=peso;
        this.precioBase=precio;
    }
    public Electrodomesticos(Double precio,Double peso,String color,char consumoEnergetico){
        this.peso=peso;
        this.precioBase=precio;
        this.color=color;
        this.consumoEnergetico=consumoEnergetico;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    public void comprobarConsumoEnergetico(char letra)
    {

        switch (letra){
            case 'A':this.consumoEnergetico=letra;break;
            case 'B':this.consumoEnergetico=letra;break;
            case 'C':this.consumoEnergetico=letra;break;
            case 'D':this.consumoEnergetico=letra;break;
            case 'E':this.consumoEnergetico=letra;break;
            case 'F':this.consumoEnergetico=letra;break;
            default:this.consumoEnergetico='F';break;
        }
    }

    public void comprobarColor(String color){
        color=color.toUpperCase();
        switch (color){
            case "BLANCO":this.color=color;break;
            case "NEGRO":this.color=color;break;
            case "ROJO":this.color=color;break;
            case "AZUL":this.color=color;break;
            case "GRIS":this.color=color;break;
            default:this.color="BLANCO";break;
        }
    }

    public double precioFinal()
    {
        double VarlorconsumoEnergetico=0.0;
        double Varlorpeso=0.0;
        switch (this.consumoEnergetico){
            case 'A':VarlorconsumoEnergetico=100;break;
            case 'B':VarlorconsumoEnergetico=80;break;
            case 'C':VarlorconsumoEnergetico=600;break;
            case 'D':VarlorconsumoEnergetico=50;break;
            case 'E':VarlorconsumoEnergetico=30;break;
            case 'F':VarlorconsumoEnergetico=10;break;
        }


            if(this.peso>=0 && this.peso<=19){
                Varlorpeso=100;
            }
           if(this.peso>=20 && this.peso<=9){
               Varlorpeso=80;
           }
            if(this.peso>0 && this.peso<=9){
                Varlorpeso=600;
            }
           if(this.peso>0 && this.peso<9){
               Varlorpeso=50;
           }
           if(this.peso>0 && this.peso<9){
               Varlorpeso=30;
           }
           if(this.peso>0 && this.peso<9){
               Varlorpeso=10;
        }

    }
}
