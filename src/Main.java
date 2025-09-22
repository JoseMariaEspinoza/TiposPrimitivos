//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         /*Los tipos Primitivos en JAVA
         En JAVA existen 8 tipos primitivos que se podrian clasificar en los de numero entero:
         byte, short, int y long (ordenados del más corto al más largo), los de numeros decimal o de coma flotante:
         float y double (ordenados tambien de menor capacidad a mayor), los caracteres: char,
         y por ultimo los valores lógicos: boolean, a continación declararé e iniciaré uno de cada tipo
          */
        //byte puede contener valores entre -128 por debajo y 127 por arriba
        byte bMenor = -128, bMayor = 127;
        //short puede contener valores entre -32768 por debajo y 32767 por arriba
        short sMenor = -32768, eMayor= 32767;
        //int puede contener valores entre -2147483648 por debajo y 2147483647 por arriba
        int iMenor = -2147483648, iMayor = 2147483647;
        //long puede contener valores entre -9223372036854775808 por arriba y 9223372036854775807 por debajo
        long lMenor = -9223372036854775808L, lMayor = 9223372036854775807L;
        //Al instanciar un float podemos poner tantos decimales como queramos pero a la hora de operar con el, el sistema soolo tomara un maximo de 7, por eso es más preciso usar double
        float decimalPequenio = 0.1234567F; double decimalGrande = 0.123456789;
        //char acepta  un caracter del tipo que sea, inclusive numerico
        char a='a', b='1', c='*', d='.';
        //Y por último está boolean que solo puede contener el valor verdadero o falso
        boolean bVerdadero= true, bFalso= false;

    }
}