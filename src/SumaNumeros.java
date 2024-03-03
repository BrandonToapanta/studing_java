
import java.util.Scanner;

// sobrecarga funciones 
public class SumaNumeros {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer valor: ");
        double valorUno = leer.nextDouble();
        System.out.println("Ingrese el segundo valor: ");
        double valorDos = leer.nextDouble();
        System.out.println("El resultado de la suma es: "+suma(valorUno,valorDos));
    }
    //funcion para sumar los valores 
    static int suma(int varUno, int varDos){
    return varUno+varDos;
    }
    static double suma(double varUno, double varDos){
    return varUno+varDos;
    }
}
