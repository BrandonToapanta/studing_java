
package clase2bprogramacion;

public class Edad_chica {
    public static void main(String[] args) {
        int edad=12,total=10,cantidad;
        for ( cantidad = 10; cantidad <= 500; edad +=1) {
            cantidad = cantidad*2;
            total=cantidad+total;
        }
        
        System.out.println("La edad de la niña es: "+edad);
        System.out.println("El la ultima cantidad obtenida es: "+cantidad);
        System.out.printf("%s este es la cantidad total recibida \n",total);
    }
}
