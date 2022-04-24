import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Persona {

    String nombre;
    Integer edad;
    String dni;
    char sexo;
    Double peso;
    Double altura;

    public Persona(){
        this.nombre="";
        this.edad=0;
        this.sexo='H';
        this.peso=0.0;
        this.altura=0.0;
    }
    public Persona(String nombre, Integer edad, char sexo, Double peso, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(String nombre, Integer edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC(double kg,double altura){
            final int pesoIdeal=-1;
            final int debajoDePesoIdeal=0;
            final int sobrePeso=1;
            int calculo=0;
            double peso =kg/(Math.pow(altura,2));

       if (peso<20){
           calculo= pesoIdeal;
       }
       if (peso>20&&peso<=25){
           calculo= debajoDePesoIdeal;
       }
       if (peso>25){
           calculo= sobrePeso;
       }
       return calculo;
    }

    public boolean esMayorDeEdad(){
        if (this.edad>=18){
            return true;
        }
        return false;
    }

    public  void comprobarSexo(char sexo){
        if (sexo=='M'){
             this.sexo='M';
            return;
        }
        this.sexo='H';
        return;
    }

    public  void generaDNI(){

        String[] dniRandom=new String[8];

        int numero;

        for (int i=0;i<8;i++){
            numero=(int) (Math.random() * 10);
            dniRandom[i]=String.valueOf(numero);
        }

        String dni=String.join(" ",dniRandom);
        this.dni=dni.replace(" ","");
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }


    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}
