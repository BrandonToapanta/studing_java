
import java.util.Scanner;

//Crear un programa que me permita almacenar los nombres de mis familiares
//más cercanos y me indique el parentesco, el tamaño del arreglo será ingresado 
//por teclado. Mostrar el resultado  pantalla
public class Parentesco {
     public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese el numero de familiares: ");
         int numFamilia = leer.nextInt();
         String[] familia= new String[numFamilia];
         String[] numParentesco= new String[numFamilia];
         for (int i = 0; i < numFamilia; i++) {
             System.out.println("Ingrese el nombre del familiar "+(i+1)+":");
             String nombre = leer.next();
             System.out.println("Ingrese el parentesco que tiene:");
             String parentesco=leer.next();
             familia[i]=nombre;
             numParentesco[i]=parentesco;
         }
         for (int i = 0; i < numFamilia; i++) {
             System.out.print(familia[i]+" - ");
             System.out.println(numParentesco[i]);
         }
        // for(String dato:familia){
        //     System.out.print(dato+(" - "));
        // }
        // System.out.println("");
        // for(String dato:numParentesco){
        //     System.out.print(dato+" - ");
        // }
     }
}
