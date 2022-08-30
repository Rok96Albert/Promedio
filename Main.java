package ejercicio2;
import java.util.Scanner;

//Programa que permita leer 4 notas ingresadas por el usuario.

public class Main {

    public static void main (String args []){

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresa 4 notas:");

        double nota,media = 0f;

        int i = 1;

        while(i <= 4)
        {
            System.out.println("Nota: "+ i);
            nota = scan.nextDouble();

            media += nota;

            i++;
        }
        media = media / 4;

        System.out.println("El promedio de las 4 notas es: "+media);
    }
}
