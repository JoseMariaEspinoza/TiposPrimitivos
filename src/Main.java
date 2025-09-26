package ejerciciosbasicos;

import java.util.Scanner;

public class EjerciciosIfElse {
    public static void main(String[] args) {
//    1. Escribir un programa, de nombre mayorDeEdad, que solicite la edad como entero y muestre
//        un mensaje por pantalla si es mayor de edad o no.
        int edad;
        System.out.println("Introduzca su edad");    
        Scanner sc=new Scanner(System.in);
        edad=sc.nextInt();
        if(edad>=18){
            System.out.println("Si es mayor de edad");
        }else{
            System.out.println("No es mayor de edad");
            }
//    2. Escribir un programa, de nombre mayorQue25, que pida entero al usuario y muestre un
//        mensaje por pantalla que indique si es mayor o menor que 25.
        System.out.println("Introduce un número entero");
        edad=sc.nextInt();
        if(edad>25){
            System.out.println("Es mayor de 25 años");
        }else{
            System.out.println("Es menor de 25 años");
        }
    }
    
}
