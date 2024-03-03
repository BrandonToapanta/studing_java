
import java.util.Scanner;

public class Funciones {
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      char condicion;
        System.out.println("Calculadora de dos numeros");
        do{
            System.out.println("Ingrese el primer numero; ");
            float num1=leer.nextInt();
            System.out.println("Ingrese el segundo numero; ");
            float num2=leer.nextInt();
            System.out.println("Ingrese que poeracion decea realizar: \nsuma=s\nresta=r\nmultiplicacion=m\ndivicion=d");
            System.out.println("ingresar solo la letra minuscula");
            String metodo=leer.next();
            switch (metodo){
                case "s":
                System.out.println("El resultado es: "+suma(num1,num2));
                    break;
                case "r":
                System.out.println("El resultado es: "+resta(num1,num2));
                    break; 
                case "m":
                    System.out.println("El resultado es: "+multiplicacion(num1,num2));
                    break;
                case "d":
                    System.out.println("El resultado es: "+divicion(num1,num2));
                    break;
            }
            System.out.println("Desea realizar otra operacion s/n");
            condicion = leer.next().charAt(0);
        }while(condicion =='s'||condicion =='S');
    }
    public static float suma(float a,float b){
        return a+b;
    }
    public static float resta(float a,float b){
        return a-b;
    }
    public static float multiplicacion(float a,float b){
        return a*b;
    }
    public static float divicion(float a,float b){
        return a/b;
    }
}
