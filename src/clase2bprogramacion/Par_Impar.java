
package clase2bprogramacion;

import java.util.Scanner;

public class Par_Impar {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1,num2,suma=0,pares=0,contador;
        System.out.println("Ingrese un numero: ");
        num1 = leer.nextInt();
        System.out.println("Ingrese su final: ");
        num2 = leer.nextInt();
        for (contador = num1; num1 <= num2; num1++) {
            if(num1%2 == 0){
                pares++;
            }
            if(num1%3 == 0){
                suma=suma+num1;
            }
        }
        System.out.println("La cantidad de numeros pares es: "+ pares);
        System.out.println("La suma de los multiplos de 3 es: "+suma);
    }
}
