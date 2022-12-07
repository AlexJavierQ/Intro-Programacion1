package bimestre2.Semana1;

import java.util.Scanner;

public class Numeros_Abundantes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       int a = 0;                 //Variables
       int i = 1;

       System.out.println("Digite un número");             //Pregunta
        int n;
        n = teclado.nextInt();

        while(i < n) {                                //Contador

            if (n % i == 0){                      // Proceso de division
                a = a+i;
            }
            i ++;
       }

       if (a > n ){                                        //Detecta si s abundadnte o no
           System.out.println("Es un número abundante");
       }else{
           System.out.println("No es un número abundante");
       }
    }
}

