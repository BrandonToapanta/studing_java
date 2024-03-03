
package clase2bprogramacion;

import java.util.Scanner;

public class Despacho {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int peso,costo,suma=0,libra=0,condicion = 0,kilos=0;
        float costoKilo,total=0;
        char fin;
        do{
        System.out.println("Ingrese el precio del articulo: ");
        costo = leer.nextInt();
        System.out.println("Ingrese el peso del articulo en libras: ");
        peso = leer.nextInt();
        suma=suma+costo;
        libra=libra+peso;
        kilos=libra*2;
        if(kilos > 4 && suma > 400){
            System.out.println("No se pudo armo el paquete");
        }
        System.out.println("Desea ingresar mas articulos: S/N");
        fin = leer.next().charAt(0);
        if(fin =='n'|| fin =='N'){
            condicion =1;
        }
        }while(condicion < 1);
        costoKilo= (float) (libra*17.5);
        total = costoKilo + suma;
        if(kilos <= 4 && suma <= 400){
            System.out.println("Se armo el paquete");
            System.out.println("Su costo es de: "+suma);
            System.out.println("Su peso en kilo es de: "+kilos);
            System.out.println("El coste de invio es de: "+costoKilo);
            System.out.println("El total a pagar er es de: "+total);
        }else{
            System.out.println("El costo es mayor o los kilos son mayores al paquete de 4x4");
        }
    }
}

