
import java.util.Scanner;

//recursividad 
public class Factorial {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero:");
        int numero = leer.nextInt();
        System.out.println("El factorial es: "+factorial(numero));
     }
     //funcion 
    static int factorial(int num){
        if(num > 1){
            num = num *factorial(num -1);
        }
      return num;  
     }
}
