package uan.edu.co.sistemaDeReservaciones;

import java.util.Scanner;

public class Reservacion {

    int i = 0, j = 5;
    static Scanner entrada = new Scanner(System.in);

    public void seleccion_menu(int asiento) {
        switch (asiento) {
            case 1:
                System.out.println("Usted selecciono primera clase, a continuacion se le asignara un asiento: ");
                break;
            case 2:
                System.out.println("Usted selecciono clase economica, a continuacion se le asignara un asiento: ");
                break;
            default:
                System.out.println("Error, debe digitar 1 para primera clase o 2 para economica.");
        }
    }

    public void numero_asiento(boolean asientos[], int clase) {
        char cambio;

        switch (clase) {
            case 1:
                if (clase == 1 && i < 5) {
                    asientos[i] = true;     
                    imprimirPasePrim(asientos);
                    i++;
                } else {
                    System.out.println("\nLa primera clase esta llena,\nAcepta que lo asignemos en clase economica?(s/n)");
                    cambio = entrada.next().charAt(0);

                    if (cambio == 's' && j < 10) {
                        asientos[j] = true;                      
                        imprimirPaseEc(asientos);
                        j++;
                    } else {
                        if (cambio == 's' && j > 9) {
                            System.out.println("\nAmbas clases estan llenas");
                            System.out.println("\nLamentamos las molestias, el siguiente vuelo parte en 3 horas");
                        } else {
                            System.out.println("\nLamentamos las molestias, el siguiente vuelo parte en 3 horas");
                        }
                    }
                }
                break;

            case 2:
                if (clase == 2 && j < 10) {
                    asientos[j] = true;                    
                    imprimirPaseEc(asientos);
                    j++;
                } else {
                    System.out.println("La clase turista esta llena,\nAcepta que lo asignemos en primera clase?(s/n)");
                    cambio = entrada.next().charAt(0);

                    if (cambio == 's' && i < 5) {
                        asientos[i] = true;                        
                        imprimirPasePrim(asientos);
                        i++;
                    } else {
                        if (cambio == 's' && i > 4) {
                            System.out.println("\nAmbas clases estan llenas");
                            System.out.println("Lamentamos las molestias, el siguiente vuelo parte en 3 horas");
                        } else {
                            System.out.println("Lamentamos las molestias, el siguiente vuelo parte en 3 horas");
                        }
                    }
                }
        }
    }

    public void imprimirPasePrim(boolean asientos[]) {
        System.out.println("numero de asiento: " + (i + 1));
        System.out.println("primera clase");
    }

    public void imprimirPaseEc(boolean asientos[]) {
        System.out.println("numero de asiento: " + (j + 1));
        System.out.println("clase economica");
    }
}
