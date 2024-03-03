
import java.util.Scanner;

public class Dia {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un nemero del 1 al 7");
        int dia = leer.nextInt();
        String nombreDia = "";
        switch (dia){
            case 1:
                nombreDia = "Domingo";
                break;
            case 2:
                nombreDia = "Lunes";
                break;
            case 3:
                nombreDia = "Martes";
                break;
            case 4:
                nombreDia = "Miercoles";
                break;
            case 5:
                nombreDia = "Jueves";
                break;
            case 6:
                nombreDia = "Viernes";
                break;
            case 7:
                nombreDia = "Sabado";
                break;
            default:
                System.out.println("Numero de opccion incor");
        }
        System.out.println("El dia es: "+ nombreDia);
    }    
}
