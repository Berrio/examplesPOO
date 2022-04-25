package Ejercicio17;

public class Main {
     public static void main(String[] args) {
         Electrodomesticos[] electrodomesticos=new Electrodomesticos[10];
         electrodomesticos[0] = new Television(80.0,50.0);
         electrodomesticos[1]= new Television(20.0,35.5,"AMARILLO",'G',50.0,true);
         electrodomesticos[2]= new Television(30.0,25.5,"BLANCO",'A',20.0,false);
         electrodomesticos[3]= new Television(60.0,15.5,"VERDE",'B',80.0,true);
         electrodomesticos[4]= new Television(100.0,85.5,"ROJO",'C',100.0,true);
         electrodomesticos[5]=new Lavadora(50.0,20.0,80.0);
         electrodomesticos[6]=new Lavadora(60.0,30.0,80.0);
         electrodomesticos[7]=new Lavadora(70.0,40.0,80.0);
         electrodomesticos[8]=new Lavadora(80.0,50.0,80.0);
         electrodomesticos[9]=new Lavadora(100.0,60.0,80.0);

         for (int i=0;i<electrodomesticos.length;i++)
         {
             System.out.println(electrodomesticos[i].precioFinal());
         }
    }
}
