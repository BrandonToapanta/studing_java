
import java.util.Scanner;


public class Matris {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        float nota1,nota2,nota3,promedio=0;
         System.out.println("Ingrese el numero de estudiantes: ");
         int numEstudiantes=leer.nextInt();
         String nombres[]=new String[numEstudiantes];
         float notas[][]=new float[numEstudiantes][4];
         for (int i = 0; i < numEstudiantes; i++) {
             System.out.println("Ingrese el nombre del estudiante");
             nombre=leer.next();
             nombres[i]=nombre;
             System.out.println("Ingrese la primera nota: ");
             nota1=leer.nextInt();
             notas[i][0]=nota1;
             System.out.println("Ingrese la segunda nota: ");
             nota2=leer.nextInt();
             notas[i][1]=nota2;
             System.out.println("Ingrese la tercera nota: ");
             nota3=leer.nextInt();
             notas[i][2]=nota3;
             promedio=(float)(nota1+nota2+nota3)/3;
             notas[i][3]=promedio;
         }
         System.out.println("Notas y promedio");
         for (int i = 0; i < numEstudiantes; i++) {
             System.out.print(nombres[i]+"   ");
             System.out.print(notas[i][0]+"   ");
             System.out.print(notas[i][1]+"   ");
             System.out.print(notas[i][2]+"   ");
             System.out.println(notas[i][3]+"   ");
         }
     }
}
