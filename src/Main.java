package ejerciciosifelse;

import java.util.Scanner;

public class EsFechaValida {
    public static void main(String[] args) {
//        6. Escribe un método, de nombre esFechaValida, que pida al usuario tres valores enteros con el
//            día, mes y año de una fecha y devuelva un valor booleano que indique si se trata de valores
//            válidos para una fecha. (Se piden los tres datos uno después de otro y se evalúan si son
//            correctos posteriormente).
        Scanner sc=new Scanner(System.in);
        int dia, mes, año;
        System.out.println("Introduzca el dia en numero entero");
        dia=sc.nextInt();
        System.out.println("Introduzca el mes en numero entero");
        mes=sc.nextInt();
        System.out.println("Introduzca el año en numero entero");
        año=sc.nextInt();
        //Primero lo separamos en los dias de 31 dias y los de 30 dias y luego 
        //un caso especial para el mes de febrero que tiene 28 o 29 dias en 
        //funcion de si el año es bisiesto
        boolean dValido=false, mValido=false, aValido=false;
             
        if(año>0){
            aValido=true;
            if(mes>0 && mes<=12){
                mValido=true;
                if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
                    if(dia>0 && dia<=31){
                        dValido=true;
                    }
                }else if(mes==4 || mes==6 || mes==9 || mes==11){
                    if(dia>0 && dia<=30){
                        dValido=true;
                    }
                }else if(mes==2){
                    if(año%4==0 && dia>0 && dia<=29){
                        dValido=true;
                    }else if(año%4!=0 && dia>0 && dia<=28){
                        dValido=true;
                    }                     
                }  
            }
            if(año>2025){
                aValido=false;
            }else if(año==2025 && mes>10){
                mValido=false;
            }else if(año==2025 && mes==10 && dia>1){
                dValido=false;                    
            }
        }
        
        if(dValido && mValido && aValido){
            System.out.println("La fecha " + dia + "/" + mes + "/" + año + " es válida");
        }else{
            System.out.println("La fecha " + dia + "/" + mes + "/" + año + " no es válida");
            if(aValido==false){
                if(año<0){
                    System.out.println("El valor de año no puede ser negativo");
                }else{
                    System.out.println("El valor de año es superior al año actual");
                }
            }
            if(mValido==false){
                if(mes<0){
                    System.out.println("El valor de mes");
                }else if(año==2025 && mes>10){
                    System.out.println("La fecha no puede ser superior al actual");
                }else if (mes>12){
                    System.out.println("El valor mes no puede ser superior a 12");
                }
            }
            if(dValido==false){
                if(dia<0){
                System.out.println("El valor dia no acepta numeros negativos");
                }else if(año==2025 && mes==10 && dia>1){
                    System.out.println("La fecha no puede ser superior al actual");
                    
                }else{
                System.out.println("El valor dia es superior al numero de dias del mes");
                }
            }
        }
        
    }
}
