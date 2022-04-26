import Ejercicio16.Persona;
import Ejercicio18.Serie;
import Ejercicio18.Videojuego;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
//import org.apache.commons.lang3.StringUtils;

public class main {
    public static void main(String[] args) {
        main po= new main();
//        String ejercicio1=po.ejercicio1(2,1);
//        String ejercicio2=po.ejercicio2();
//        String ejercicio3=po.ejercicio3();
//        String ejercicio4=po.ejercicio4();
//        po.ejercicio5();
//        po.ejercicio6();
//        po.ejercicio7();
//        po.ejercicio8();
//        po.ejercicio9("hola");
//        po.ejercicio10();
//        po.ejercicio11();
//        po.ejercicio12();
//        po.ejercicio13();
//        po.ejercicio14();
//        po.ejercicio15();

//        ejercicio 16

//        Scanner scaner=new Scanner(System.in);
//        System.out.println("Ingresa Nombre");
//        String nombre=scaner.nextLine();
//        System.out.println("Ingresa Edad");
//        int edad=Integer.parseInt(scaner.nextLine());
//        System.out.println("Ingresa Sexo");
//        char sexo=scaner.nextLine().charAt(0);
//        System.out.println("Ingresa Peso");
//        double peso=Double.parseDouble(scaner.nextLine());
//        System.out.println("Ingresa Altura");
//        double altura=Double.parseDouble(scaner.nextLine());
//
//        Persona persona1=new Persona(nombre,edad,sexo,peso,altura);
//
//        Persona persona2=new Persona(nombre,edad,sexo);
//
//        Persona persona3=new Persona();
//        persona3.setAltura(190.0);
//        persona3.setEdad(25);
//        persona3.setSexo('M');
//        persona3.setNombre("areger");
//        persona3.setPeso(50.5);

//        ejercicio 17
//        En la carpeta Ejercicio 17 esta el main

//        ejercicio 18
//        Integer countEntregados=0;
//        Double countJuegoConMasHoras=0.0;
//        Integer countSerieMasTemporadas=0;
//        Serie serieMasTemporadas=new Serie();
//        Videojuego juegoConMasHoras=new Videojuego();
//
//        Serie[] serie=new Serie[5];
//        Videojuego[] videojuego=new Videojuego[5];
//
//        serie[0]=new Serie("batman",5,"Dark","bill gates");
//        serie[1]=new Serie("superman",4,"Heroes","zuckemberg");
//        serie[2]=new Serie("robin",6,"Heroes","Duque");
//        serie[3]=new Serie("Malagan","chepe");
//        serie[4]=new Serie("Mr President","petro");
//
//        videojuego[0]=new Videojuego("Halo",13.0,"Accion","365");
//        videojuego[1]=new Videojuego("Halo2",12.0,"Accion","365");
//        videojuego[2]=new Videojuego("Ball",15.0,"Accion","Miyamoto");
//        videojuego[3]=new Videojuego("Resident evil",5.0);
//        videojuego[4]=new Videojuego("Farcry",8.0);
//
//
//        serie[0].devolver();
//        serie[4].devolver();
//        videojuego[1].devolver();
//        videojuego[2].devolver();
//
//        for(int i=0;i<=4;i++){
//            if(serie[i].isEntregado()){
//                countEntregados++;
//                System.out.println("Titulo: "+serie[i].getTitulo());
//
//            }
//            if(videojuego[i].isEntregado()){
//                countEntregados++;
//                System.out.println("Titulo: "+videojuego[i].getTitulo());
//            }
//            if(serie[i].getNumTemporadas()>countSerieMasTemporadas){
//                countSerieMasTemporadas=serie[i].getNumTemporadas();
//                serieMasTemporadas=serie[i];
//            }
//            if(videojuego[i].getHorasEstimadas()>countJuegoConMasHoras){
//                countJuegoConMasHoras=videojuego[i].getHorasEstimadas();
//                juegoConMasHoras=videojuego[i];
//            }
//
//        }
//        System.out.println("los entregados son: "+countEntregados);
//        System.out.println("Serie con mas temporadas : "+serieMasTemporadas.toString());
//        System.out.println("Juego con mas Horas : "+juegoConMasHoras.toString());


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

        char [] fraseIngresada=leer1.toCharArray();
        char[] caracter= new char[5];
        caracter[0]='a';
        caracter[1]='e';
        caracter[2]='i';
        caracter[3]='o';
        caracter[4]='u';
        System.out.println("La frase contiene "+fraseIngresada.length+" caracteres");
        int totalcaracter=0;
        for(int i=0;i<caracter.length;i++)
        {
            for (int j = 0; j < fraseIngresada.length; j++) {
                if(caracter[i]==fraseIngresada[j])
                {
                    totalcaracter++;
                }

        }
            if (totalcaracter==1){
                System.out.println(caracter[i]+ " aparece " + totalcaracter + " vez en el texto");
            }else{
                System.out.println(caracter[i]+ " aparece " + totalcaracter + " veces en el texto");
            }

            totalcaracter=0;
        }
    }

    public void ejercicio12 (){
        //StringUtils.difference(null,null);
    }

    public void ejercicio13 (){
        //Realizar un algoritmo que permita consulta la fecha y hora actual en el formato (AAAA/MM/DD) (HH:MM:SS)

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("yyyy/MM/dd HH:mm:ss-> "+dtf.format(LocalDateTime.now()));
    }

    public void ejercicio14(){
//        Crear un programa que pida un numero por teclado y que imprima por pantalla los
//        números desde el numero introducido hasta 1000 con saldos de 2 en 2.
        Scanner scaner=new Scanner(System.in);
        System.out.println("Ingrese una numero");
        int num=Integer.parseInt(scaner.nextLine());

        for (int i=num;i<=1000;i=i+2){
            System.out.println(i);
        }
    }

    public void ejercicio15 (){
//        Hacer un programa que muestre el siguiente menú de opciones
        boolean salir = false;
        while (salir==false)
        {
            System.out.println("****** GESTION CINEMATOGRAFICA ********");
            System.out.println("1-NUEVO ACTOR");
            System.out.println("2-BUSCAR ACTOR");
            System.out.println("3-ELIMINAR ACTOR");
            System.out.println("4-MODIFICAR ACTOR");
            System.out.println("5-VER TODOS LOS ACTORES");
            System.out.println("6- VER PELICULAS DE LOS ACTORES");
            System.out.println("7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
            System.out.println("8-SALIR");

            Scanner scaner=new Scanner(System.in);
            System.out.println("Ingrese una ocpcion");
            String res=scaner.nextLine();

        switch (res){
            case "1":
                System.out.println("TO DO");
                break;
            case "2":
                System.out.println("TO DO");
                break;
            case "3":
                System.out.println("TO DO");
                break;
            case "4":
                System.out.println("TO DO");
                break;
            case "5":
                System.out.println("TO DO");
                break;
            case "6":
                System.out.println("TO DO");
                break;
            case "7":
                System.out.println("TO DO");
                break;
            case "8":
                salir=true;
                break;
            default:
                System.out.println("opcion no valida");

        }
        }
        System.out.println("Hasta Luego!!");
    }
}
