import java.util.Scanner;

public class Condicional_Anidada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("PROGRAMA PARA DETERMINAR LA MAYORIA DE EDAD");
        System.out.println("Ingrese su edad: ");
        int edad = teclado.nextInt ();
        if (edad > 0 && edad <= 150) {
            if (edad > 0 && edad < 18) {
                System.out.println("Eres menor de edad");
            } else if (edad >= 18 && edad <= 65) {
                System.out.println("Eres mayor de edad");
            } else if (edad > 65 && edad <= 100) {
                System.out.println("Eres de la tercera edad");
            } else if (edad > 100 && edad <= 150) {
                System.out.println("Eres una Persona Sabia");
            } else {
                System.out.println("Edad Invalida");
            }
        } else
            System.out.println("Edad invalida");
            System.out.println("Por Favor digite una edad valida");
    }
}
