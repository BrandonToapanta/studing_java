
package clase2bprogramacion;

public class MultiploTres {
    public static void main(String[] args) {
        int contador=5, suma=0;
        while (contador<=50){
            suma = suma + contador;
            contador += 5;
        }
        System.out.println("La suma es: "+ contador);
    }
}
