
import java.util.Scanner;


public class Venta_de_carros {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el valor de contado del veiculo :");
        double valorContado = leer.nextDouble();
        System.out.println("selecione el plazo: 1 para 12 meses; 2 para 24 meses; 3 para 36 meses");
        int opcion = leer.nextInt();
        // ejecutamosn los casos correspondintes
        switch(opcion){
            case 1:
                int interes = 9;
                int entrada = 45;
                int plazo = 12;
                int anio = 1;
                calculo(valorContado,plazo,entrada,interes,anio);
                break;
            case 2:
                int interes2 = 11;
                int entrada2 = 30;
                int plazo2 = 24;
                int anio2 = 2;
                calculo(valorContado,plazo2,entrada2,interes2,anio2);
                break;
            case 3:
                int interes3 = 14;
                int entrada3 = 25;
                int plazo3 = 36;
                int anio3 = 3;
                calculo(valorContado,plazo3,entrada3,interes3,anio3);
                break;
            
        }
    }
    //Funcion que calcule la entrada y el valor mensual 
    static void calculo(double vContado, int plazo, int entrada, int interes, int anio){
        double valorEntrada = (entrada/100d)*vContado;
        System.out.printf("El valor de entrada para %s meses de plazo es: "+valorEntrada+"\n",plazo);
        //valor a ser financiado
        double valorFinanciado = vContado - valorEntrada;
        //calcular valor a ser financiado 
        double valorInteres=((interes/100d)*valorFinanciado)*anio +valorFinanciado;
        System.out.println("El valor a ser financiado es: "+valorInteres);
        //calcular valor por mes
        double valorMesual = valorInteres/plazo;
        System.out.printf("El valor de la mesualidad para %s meses es: "+valorMesual+"\n",plazo);
    }
}                       
