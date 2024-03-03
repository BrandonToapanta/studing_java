
package clase2bprogramacion;

import java.util.Scanner;

public class UtilidadPVP {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float precioCompra, precioVenta;
        System.out.println("Caltulo para saber la utilidad.");
        do{
            System.out.println("Ingrese el precio de compra mayor a 0: ");
            precioCompra = leer.nextFloat();
        }while (precioCompra <= 0);
        
        do{
            System.out.println("Ingrese el precio de venta mayor al precio de compra");
            precioVenta = leer.nextFloat();
        }while (precioVenta <= precioCompra);
        
        float utilidad=0;
        utilidad = precioVenta - precioCompra;
        System.out.println("La utilidad es de: "+ utilidad);
    }
}
//for (int i = 1002; i <= 1500; i+=3) {
           // cantidad +=1;
          //  do{
                
          //  }while(contador == 5);