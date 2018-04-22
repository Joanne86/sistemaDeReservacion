package uan.edu.co.sistemaDeReservaciones;

import java.util.Scanner;

public class Main {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int menu;
        boolean[] asientos = new boolean[10];
        for (int i = 0; i < 10; i++) {
            asientos[i] = false;
        }
        char continuar;
        Reservacion reserv = new Reservacion();

        do {
            System.out.print("Porfavor digite 1 para primera clase o 2 para clase economica: ");
            menu = entrada.nextInt();
            reserv.seleccion_menu(menu);
            reserv.numero_asiento(asientos, menu);
            System.out.print("\nDesea continuar? (s/n) : ");
            continuar = entrada.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');

    }
}
