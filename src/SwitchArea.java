import java.util.Scanner;

public class SwitchArea {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese un número del 1 al 3");
        int opcion = teclado.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Area del triangulo");
                System.out.println("Valor de la base: ");
                double base = teclado.nextDouble();
                System.out.println("Valor de la altura: ");
                double altura = teclado.nextDouble();
                double area_triangulo = (base * altura)/2;
                System.out.println("El área es: "+ area_triangulo);
                break;
            case 2:
                System.out.println("Area de la circunferencia");
                System.out.println("Valor del Radio: ");
                double radio = teclado.nextDouble();
                double area_circulo = Math.PI * (radio * radio);
                System.out.println("El área es: "+ area_circulo);
                break;
            case 3:
                System.out.println("Area de un cuadrado");
                System.out.println("Valor del lado");
                double lado = teclado.nextDouble();
                double area_cuadrado = lado * lado;
                System.out.println("El área es: "+ area_cuadrado);
                break;
            default:
                System.out.println("Opción Invalida");
                System.out.println ("Por favor ingrese una opción Valida");
        }
    }
}
