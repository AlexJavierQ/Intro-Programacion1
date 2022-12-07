package bimestre2.Semana1;

import java.util.Scanner;

public class Convertidor {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escoja un número del 1 al 4");
        System.out.println("1: Convertir valor de mb a kb");
        System.out.println("2: Convertir valor de kb a mb");
        System.out.println("3: Convertir valor de mb a bits");
        System.out.println("4: Salir");
        int avr = teclado.nextInt();
        int t = 1024;
        switch (avr) {
            case 1:
                System.out.println("Digite cantidad a convertir");
                int ca = teclado.nextInt();
                int c = ca;
                int d = (ca * t);
                System.out.print("El resultado es ");
                System.out.print(d);
                System.out.print(" kbs");
                break;
            case 2:
                System.out.println("Digite cantidad a convertir");
                float ca2 = teclado.nextFloat();
                float c2 = ca2;
                float d2 = (ca2 / t);
                System.out.print("El resultado es ");
                System.out.print(d2);
                System.out.print(" mbs");
                break;
            case 3:
                System.out.println("Digite cantidad a convertir");
                int ca3 = teclado.nextInt();
                int c3 = ca3;
                int d3 = (ca3 * t);
                int d4 = (d3 * t);
                System.out.print("El resultado es ");
                System.out.print(d4);
                System.out.print(" bis");
                break;
            case 4:
                System.out.println("Nose vemos luego :)");
                break;
            default:
                System.out.println("Opción invalida");
                System.out.println("Seleccione una opcion corrercata");

        }
    }
}
