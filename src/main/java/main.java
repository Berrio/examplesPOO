import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        main po= new main();
        //String ejercicio1=po.ejercicio1(2,1);
        //String ejercicio2=po.ejercicio2();
        //String ejercicio3=po.ejercicio3();
        //String ejercicio4=po.ejercicio4();
        //po.ejercicio5();
        //po.ejercicio6();
        //po.ejercicio7();
        //po.ejercicio8();
        //po.ejercicio9("hola");
        po.ejercicio10();

    }

    public String ejercicio1 (int num1,int num2){
        /*"Declara 2 variables numéricas (con el valor que desees),
           he indica cual es mayor de los dos. Si son iguales indicarlo también.
           Ve cambiando los valores para comprobar que funciona."*/
        if(num1==num2){
            System.out.println("Los numeros son iguales");
            return "Los numeros son iguales";
        }
        if(num1>num2){
            System.out.println("el numero mayor es: "+num1);
            return "el numero mayor es: "+num1;
        }
        System.out.println("el numero mayor es: "+num2);
        return "el numero mayor es: "+num2;
    }

    public String ejercicio2 (){
        /*Al ejercicio anterior agregar entrada por consola de dos valores e
        indicar si son mayores, menores o iguales.*/

        Scanner scaner=new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        String leer1=scaner.nextLine();
        System.out.println("ingrese el segundo numero");
        String leer2=scaner.nextLine();
        int num1=Integer.parseInt(leer1);
        int num2=Integer.parseInt(leer2);

        if(num1==num2){
            System.out.println("Los numeros son iguales");
            return "Los numeros son iguales";
        }
        if(num1>num2){
            System.out.println("el numero mayor es: "+num1);
            return "el numero mayor es: "+num1;
        }
        System.out.println("el numero mayor es: "+num2);
        return "el numero mayor es: "+num2;
    }

    public String ejercicio3 (){
        /*Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado
        (recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el método pow de Math.
         */
        Scanner scaner=new Scanner(System.in);
        System.out.println("ingrese el radio del circulo");
        String leer1=scaner.nextLine();
        double radio=Double.parseDouble(leer1);

        System.out.println("El area del circulo es: "+Math.PI*Math.pow(radio,2));
        return "El area del circulo es: "+Math.PI*Math.pow(radio,2);
    }

    public String ejercicio4 (){
        /* Lee un número por teclado que pida el precio de un producto (puede tener decimales)
        y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.*/
        Scanner scaner=new Scanner(System.in);
        System.out.println("ingrese el precio del producto");
        String leer1=scaner.nextLine();
        double valorProducto=Double.parseDouble(leer1);

        System.out.println("El Valor final del Producto es: "+valorProducto*1.21);
        return "El Valor final del Producto es: "+valorProducto*1.21;
    }

    public void ejercicio5 (){
        /* Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa un bucle while.*/
        ArrayList pares=new ArrayList<>();
        ArrayList impares=new ArrayList<>();;
        int num=1;
        while (num<100){
            if (num % 2==0 ){
                pares.add(num);
            }
            if (num % 2!=0 ){
                impares.add(num);
            }
            num++;
        }
        System.out.println("Lista Numeros Pares");
        pares.forEach((x)-> System.out.println(x));

        System.out.println("Lista Numeros Impares");
        impares.forEach((x)-> System.out.println(x));
    }

    public void ejercicio6 (){
        /* Realiza el ejercicio anterior usando un ciclo for.*/
        ArrayList pares=new ArrayList<>();
        ArrayList impares=new ArrayList<>();;

        for (int i=1;i<100;i++){
            if (i % 2==0 ){
                pares.add(i);
            }
            if (i % 2!=0 ){
                impares.add(i);
            }

        }
        System.out.println("Lista Numeros Pares");
        pares.forEach((x)-> System.out.println(x));

        System.out.println("Lista Numeros Impares");
        impares.forEach((x)-> System.out.println(x));
    }

    public void ejercicio7 (){
        /* Lee un número por teclado y comprueba que este numero es mayor o igual que cero,
        si no lo es lo volverá a pedir (do while), después muestra ese número por consola.*/
        int num=-1;
        while(num<0) {
            Scanner scaner=new Scanner(System.in);
            System.out.println("ingrese un Numero Mayor o igual que Cero");
            num=Integer.parseInt(scaner.nextLine());
        }
        System.out.println("EL numero ingresado es: "+num);

    }

    public void ejercicio8(){
        Scanner scaner=new Scanner(System.in);
        System.out.println("ingrese un dia");
        String dia=scaner.nextLine().toLowerCase();

        switch (dia){
            case "lunes":
                System.out.println("Es un dia laboral");
                break;
            case "martes":
                System.out.println("Es un dia laboral");
                break;
            case "miercoles":
                System.out.println("Es un dia laboral");
                break;
            case "jueves":
                System.out.println("Es un dia laboral");
                break;
            case "sabado":
                System.out.println("Es un dia laboral");
                break;
            case "domingo":
                System.out.println("Es un dia laboral");
                break;
            default:
                System.out.println("no es un dia valido");

        }

    }

    public String ejercicio9(String frase){
        /*//Del texto, La sonrisa sera la mejor arma contra la tristeza Reemplaza todas las a
        //del String anterior por una e, adicionalmente concatenar a esta frase una adicional que
        //ustedes quieran incluir por consola y las muestre luego unidas.*/

        String texto ="La sonrisa sera la mejor arma contra la tristeza";
        String newtexto=texto.replace("a","e");
        System.out.println(newtexto+" "+frase);
        return newtexto+" "+frase;
    }

    public String ejercicio10 (){
        /*Realizar una aplicación de consola, que al ingresar una frase por teclado
         elimine los espacios que esta contenga.*/

        Scanner scaner=new Scanner(System.in);
        System.out.println("ingrese la frase");
        String leer1=scaner.nextLine();
        String Newfrase=leer1.replace(" ","");
        System.out.println(Newfrase);
        return Newfrase;
    }

    public void ejercicio11 (){
        /*Realizar la construcción de un algoritmo que permita de acuerdo a una frase pasada
        por consola, indicar cual es la longitud de esta frase, adicionalmente
        cuantas vocales tiene de a,e,i,o,u.*/

        Scanner scaner=new Scanner(System.in);
        System.out.println("ingrese la frase");
        String leer1=scaner.nextLine();


        char[] temp={"a","e","i","o","u"};
        int totalcaracter=0;
        for (int i = 0; i < leer1.length(); i++) {

            temp = leer1.charAt(i);
            if (temp[] == 'i')
                totalcaracter++;
        }

        System.out.println(temp+ " aparece " + totalcaracter + " en el texto");
    }
    }
}
