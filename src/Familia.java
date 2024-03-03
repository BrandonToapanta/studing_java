
import java.util.Scanner;

// crear un programa que me permita almacenar los nombres de mis familiares mas sercanos 
// y mostrarlos por tantalla, el tamaño del arreglo ingresar por teclado

public class Familia {
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de familiares: ");
        int numFamilia=leer.nextInt();
        // declarar array
        String[] nombres = new String[numFamilia];
        //ingresar datos 
        for (int i = 0; i < numFamilia; i++) {
            System.out.println("Ingresar el nombre del familiar "+(i+1));
            String nombre = leer.next();
            nombres[i]=nombre;
        }
        //mostrar informacion:
        for(String dato:nombres){
            System.out.println(dato);
        }
    }
}
