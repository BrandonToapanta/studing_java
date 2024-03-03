
package clase2bprogramacion;

import java.util.Scanner;

public class Productos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el precio de compra del producto: ");
        float precioCompra = leer.nextFloat();
        System.out.println("Ingrese el porsentaje de comicion: ");
        float comision = leer.nextFloat();
        System.out.println("El producto aplica IVA: S/N");
        char impuesto= leer.next().charAt(0);
        
        float total;
        total= (float) precioCompra + precioCompra*(comision/100);
        
        if (impuesto == 's' || impuesto == 'S') {
            float iva =0;
                iva = (float) (total + (total*0.12));
                System.out.printf("%s es el PVP \n",iva);
        }else if (impuesto == 'n' || impuesto == 'N'){
            System.out.printf("%s es el PVP \n",total);
        }else{
            System.out.println("No a ingresado una opcion valida.");}
    }
}
