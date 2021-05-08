package fr.diginamic.essais;

import fr.diginamic.banque.entites.Operation;
import fr.diginamic.operations.Operations;

import java.util.Scanner;

public class TestOperations {

    public static void main(String[] args) {

        double x = 0;
        double b = 0;
        Scanner scan= new Scanner(System.in);

        System.out.print("\nRentrez le premier nombre: ");
        double a = scan.nextDouble();
        System.out.print("\nRentrez l'opérateur ( +, -, *, / ): ");
        char c = scan.next().charAt(0);
        if (c != '+' && c != '-' && c != '*' && c != '/'){
            System.out.println("Vous n'avez pas rentrez un operateur valide. Rappel: +, -, *, /.");
        }
        else {
            System.out.print("\nRentrez le deuxieme nombre: ");
            b = scan.nextDouble();
        }

        x = Operations.calcul(a, b, c);
        System.out.println(x);

    }
}
