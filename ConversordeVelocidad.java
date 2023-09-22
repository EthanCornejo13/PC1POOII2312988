/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ConversorVelocidad;
import java.util.Scanner;

public class ConversordeVelocidad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número final para los kilometros por hora mayor a 60 KPH: ");
        int numeroFinalKPH = sc.nextInt();

        if (numeroFinalKPH <= 60 || numeroFinalKPH % 10 != 0) {
            System.out.println("Programa finalizado, debe ingresar un valor multiplo de 10 mayor a 60 KPH.");
        } else {
            System.out.println("KPH    MPH");
            System.out.println("-----------");
            
            for (int kph = 60; kph <= numeroFinalKPH; kph += 10) {
                double mph = kph * 0.6214;
                System.out.printf("%-5d  %.1f%n", kph, mph);
            }
        }

        sc.close();
    }
}
   
