package clase2bprogramacion;

import java.util.Scanner;

public class Perimetro {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la figura que desea calcular el perimetro: ");
        System.out.println("cuadrado, triangulo, rectangulo, paralelogramo, rombo");
        String perimetro = leer.next();
        int lado=0,base=0,altura=0, total=0;
        switch (perimetro) {
            case "cuadrado":
                System.out.println("Ingre un lado:");
                lado = leer.nextInt();
                total=lado+lado+lado+lado;
                break;
            case "triangulo":
                int lado_1,lado_2,lado_3;
                System.out.println("Ingrese el primer lado: ");
                lado_1=leer.nextInt();
                System.out.println("Ingrese el segundo lado: ");
                lado_2=leer.nextInt();
                System.out.println("Ingrese el tercer lado: ");
                lado_3=leer.nextInt();
                total=lado_1+lado_2+lado_3;
                break;
            case "rectangulo":
                System.out.println("Ingrese la bse");
                base=leer.nextInt();
                System.out.println("Ingrese la altura ");
                altura=leer.nextInt();
                total=(altura*2)+(base*2);
                break;
            case "paralelogramo":
                System.out.println("Ingrese la base");
                base=leer.nextInt();
                System.out.println("Ingrese la altura ");
                altura=leer.nextInt();
                total=2*(altura+base);
                break;
            case "rombo":
                System.out.println("Ingrese un lado");
                lado=leer.nextInt();
                total=4*lado;
                break; 
            default:
                System.out.println("La opcion ingresada en incorrecta ");
        }
        System.out.printf("El perimetro del %s es: "+total +"\n",perimetro);
    }
}
