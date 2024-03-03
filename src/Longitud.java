
import java.util.Scanner;

//Desarrollar un programa que me permita convertir unidades de longitud
public class Longitud {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la longitud:\n1 Metros\n2 Kilómetro\n3 Pulgada\n4 Pie\n5 Milla Terr.\n6 Milla Marit");
        int uLong = leer.nextInt();
        System.out.println("Ingrese el valor: ");
        double valor = leer.nextDouble();
        System.out.println("En metros son: "+metros(uLong,valor));
        double metros=metros(uLong,valor);
        longitudes(metros);
    }
    //funciones
    static double metros(int lon, double val){
        //trasformamos a metros
        double met=0;
        switch(lon){
            case 1:
                met=val/1;
                break;
            case 2:
                met=val/0.001;
                break;
            case 3:
                met=val*0.025399 ;
                break;
            case 4:
                met=val*0.304794;
                break;
            case 5:
                met=val*1609.34;
                break;
            case 6:
                met=val*1852;
                break;        
        }
        return met;
    }
    //Trasformas a las demas unidades de medidas 
    static void longitudes(double medidas){
        double kilometros=medidas*0.001;
        System.out.println("En Kilometros son: "+kilometros);
        double pulgada=medidas*39.3701;
        System.out.println("En pulgadas son: "+pulgada);
        double pie = medidas* 3.28084;
        System.out.println("En pies son: "+pie);
        double mTer=medidas/1609.34;
        System.out.println("En milla terrestre son: "+mTer);
        double mMar=medidas/1852;
        System.out.println("En milla matina son: "+mMar);
    }
}
