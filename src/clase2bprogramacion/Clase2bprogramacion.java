package clase2bprogramacion;

import java.util.Scanner;

public class Clase2bprogramacion {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un caracter :");
        char c = leer.next().charAt(0);
        if (c >= 'a' || c == 'A') {
            System.out.printf("%s es vocal \n", c);
        }else{
            System.out.printf("%s es numerico \n", c);
        }
    }
    
}
