
import java.util.Scanner;

public class Arreglo {
  public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] empleado= new String[4];
        int[] clave= new int[4]; 
        int i=0,buscarUser=0,numEmpleado=1;
        char condicion=0;
        do{
            System.out.println("Registre el nombre del empleado "+numEmpleado);
            empleado[i]= leer.next();
            System.out.println("Registre una clave de numeros "+numEmpleado);
            clave[i]= leer.nextInt();
            numEmpleado=numEmpleado+1;
            i+=1;
        }while(i<=3);
        do{
        System.out.println("Que empleado nesesita el nombre y clave: ");
        buscarUser = leer.nextInt();
        buscarUser = buscarUser-1;
        System.out.println("El empleado se llama: "+empleado[buscarUser]+" y su clave es: "+clave[buscarUser]);
        System.out.println("Desea buscar otro empleado: s/n");
            condicion = leer.next().charAt(0);
        }while(condicion =='s'||condicion =='S');
  }
}
