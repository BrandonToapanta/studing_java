
package clase2bprogramacion;

import java.util.Scanner;

public class Numeros_Pares_y_Impares {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1,num2,condicion;
         System.out.println("Verificador de numeros pares y impares ");
         System.out.println("Ingrese su inicio en numeros entero: ");
         num1 = leer.nextInt();
         System.out.println("Ingrese su fin en numeros enteros: ");
         num2 = leer.nextInt();
         for (condicion = num1; num1 <= num2; num1++) {
             if(num1%2 == 0){
                 System.out.printf("%s es numero par \n" ,num1);
             }else{
                 System.out.printf("%s es numero impar \n", num1);
             }
         }
     }
}
// num1=1
//num2=10
//mientras num1=num2
//si (num1%2 == 0)
// imprimir "num1 es numero par"
//sino
// imprima "num1 es numero impar"
// fin mientars

