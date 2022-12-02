import java.util.Scanner;

public class Desicion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para determinar si una persona es mayor de edad");
        System.out.println("Ingrese su edad: ");
        int edad = teclado.nextInt();
        if (edad >= 18){
            System.out.println("Eres mayor de edad");
            System.out.println("Wuu");
        }else{
            System.out.println("Eres menor de edad");
        }
    }
}

