
import java.util.Scanner;

//Crear un programa que me permita elegir una marca de auto y me muestre los
//modelos disponibles y su valor (la cantidad de modelos varía entre marca), 
//utilizar las marcas Kia, Hyunday, Chevrolet. Como ejemplo.

public class MarcasCarros {
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      String[] Kia=new String[]{"Picanto","Soluto","Rio sedan","Rio 5","Cerato","Stinger"};
      int[] valorKia=new int[]{13399,15849,19599,19599,20599,69990};
      String[] Hyunday = new String[]{"Grand I10 HB","Verna","All new accent","New ioniq hybrid"};
      int[] valorHyunday = new int[]{15790,17690,18590,28490};
      String[] Chevrolet =new String[]{"Beat","Sail","Onix turbo sedan"};
      int[] valorChevrolet = new int[]{14799,16990,19999};
      
        System.out.println("Marcas de Carros");
        System.out.println(" 1.- Kia \n 2.- Hyunday \n 3.- Chevrolet");
        System.out.println("Ingrese el numero de la marca de carro que desea visualizar: ");
        int marca = leer.nextInt();
        switch(marca){
            case 1:
                for (int i = 0; i < 6; i++) {
             System.out.print(Kia[i]+" - ");
             System.out.println(valorKia[i]+"$");
         }
                break;
            case 2:
                for (int i = 0; i < 4; i++) {
             System.out.print(Hyunday[i]+" - ");
             System.out.println(valorHyunday[i]+"$");
         }
                break;
            case 3:
                for (int i = 0; i < 3; i++) {
             System.out.print(Chevrolet[i]+" - ");
             System.out.println(valorChevrolet[i]+"$");
         }
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
}
