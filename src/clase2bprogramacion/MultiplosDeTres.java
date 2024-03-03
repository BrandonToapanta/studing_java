
package clase2bprogramacion;

public class MultiplosDeTres {
    public static void main(String[] args) {
        int inicio=1002,contador=0,cantidad=0;
        do{
            System.out.print(" "+ inicio);
            inicio +=3;
            contador += 1;
            cantidad +=1;
            if (contador == 5) {
                System.out.println("");
                contador =0;
            }
            
        }while(inicio<=1500);
        System.out.println("");
        System.out.println("La cantidad de numeros multiplos de 3 son: "+ cantidad);
    }
}

