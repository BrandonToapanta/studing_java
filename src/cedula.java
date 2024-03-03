
import java.util.Scanner;

public class cedula {
  public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      int[] DNI = new int[8];
      int numeroDNI=1,suma=0,resto=0,numero;
      
      System.out.println("Hallar el ultimo dijito del DNI de españa");
      for (int i = 0; i < 8; i++) {
          System.out.printf("Ingrese el dijito %s de su DNI: ",numeroDNI);
          DNI[i] = leer.nextInt();
          numeroDNI=numeroDNI+1;
          suma=(DNI[i]+suma)*10;
      }
      suma=suma/10;
      resto=suma%23;
      switch (resto){
          case 0:
              System.out.println("Este es su DNIcompleto:");
              for (int i = 0; i < 8; i++) {
                  System.out.print(DNI[i]);
                  }
              System.out.println("T");
              break;
          case 1:
              System.out.println("Este es su DNIcompleto:");
              for (int i = 0; i < 8; i++) {
                  System.out.print(DNI[i]);
                  }
              System.out.println("R");
              break;
          case 2:
              System.out.println("Este es su DNIcompleto:");
              for (int i = 0; i < 8; i++) {
                  System.out.print(DNI[i]);
                  }
              System.out.println("W");
              break;
          case 3:
              System.out.println("Este es su DNIcompleto:");
              for (int i = 0; i < 8; i++) {
                  System.out.print(DNI[i]);
                  }
              System.out.println("A");
              break;
          case 4:
              System.out.println("Este es su DNIcompleto:");
              for (int i = 0; i < 8; i++) {
                  System.out.print(DNI[i]);
                  }
              System.out.println("G");
              break;
          case 5:
              System.out.println("Este es su DNIcompleto:");
              for (int i = 0; i < 8; i++) {
                  System.out.print(DNI[i]);
                  }
              System.out.println("M");
              break;
          case 6:
              System.out.println("Este es su DNIcompleto:");
              for (int i = 0; i < 8; i++) {
                  System.out.print(DNI[i]);
                  }
              System.out.println("Y");
              break;
          case 7:
              System.out.println("Este es su DNIcompleto:");
              for (int i = 0; i < 8; i++) {
                  System.out.print(DNI[i]);
                  }
              System.out.println("F");
              break;
          case 8:
              System.out.println("Este es su DNIcompleto:");
              for (int i = 0; i < 8; i++) {
                  System.out.print(DNI[i]);
                  }
              System.out.println("P");
              break;
          case 9:
              System.out.println("Este es su DNIcompleto:");
              for (int i = 0; i < 8; i++) {
                  System.out.print(DNI[i]);
                  }
              System.out.println("D");
              break;
          case 10:
              System.out.println("Este es su DNIcompleto:");
              for (int i = 0; i < 8; i++) {
                  System.out.print(DNI[i]);
                  }
              System.out.println("X");
              break;
          case 11:
              System.out.println("Este es su DNIcompleto:");
              for (int i = 0; i < 8; i++) {
                  System.out.print(DNI[i]);
                  }
              System.out.println("B");
              break;
          case 12:
              System.out.println("Este es su DNIcompleto:");
              for (int i = 0; i < 8; i++) {
                  System.out.print(DNI[i]);
                  }
              System.out.println("N");
              break;
          case 13:
              System.out.println("Este es su DNIcompleto:");
              for (int i = 0; i < 8; i++) {
                  System.out.print(DNI[i]);
                  }
              System.out.println("J");
              break;
          case 14:
              System.out.println("Este es su DNIcompleto:");
              for (int i = 0; i < 8; i++) {
                  System.out.print(DNI[i]);
                  }
              System.out.println("Z");
              break;
          case 15:
              System.out.println("Este es su DNIcompleto:");
              for (int i = 0; i < 8; i++) {
                  System.out.print(DNI[i]);
                  }
              System.out.println("S");
              break;
          case 16:
              System.out.println("Este es su DNIcompleto:");
              for (int i = 0; i < 8; i++) {
                  System.out.print(DNI[i]);
                  }
              System.out.println("Q");
              break;
          case 17:
              System.out.println("Este es su DNIcompleto:");
              for (int i = 0; i < 8; i++) {
                  System.out.print(DNI[i]);
                  }
              System.out.println("V");
              break;
          case 18:
              System.out.println("Este es su DNIcompleto:");
              for (int i = 0; i < 8; i++) {
                  System.out.print(DNI[i]);
                  }
              System.out.println("H");
              break;
          case 19:
              System.out.println("Este es su DNIcompleto:");
              for (int i = 0; i < 8; i++) {
                  System.out.print(DNI[i]);
                  }
              System.out.println("L");
              break;
          case 20:
              System.out.println("Este es su DNIcompleto:");
              for (int i = 0; i < 8; i++) {
                  System.out.print(DNI[i]);
                  }
              System.out.println("C");
              break;
          case 21:
              System.out.println("Este es su DNIcompleto:");
              for (int i = 0; i < 8; i++) {
                  System.out.print(DNI[i]);
                  }
              System.out.println("K");
              break;
           case 22:
              System.out.println("Este es su DNIcompleto:");
              for (int i = 0; i < 8; i++) {
                  System.out.print(DNI[i]);
                  }
              System.out.println("E");
              break;
      }
  }
}
