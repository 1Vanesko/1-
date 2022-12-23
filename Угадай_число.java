package Ugaday_chislo;

import java.util.Scanner;

public class Ugaday_chislo {

    public static void main(String[] args) {
        int random = (int) (Math.random() * 10);
        while (true) {
            Scanner vashechislo = new Scanner(System.in);
            int Vashechislo = vashechislo.nextInt();
            if (random == Vashechislo) {
                System.out.println("Congratulations"); break;
            }
            if (Math.abs(random - Vashechislo) == 1) {
                System.out.print("Already closer, try once more");
            } else if (Vashechislo != random) {
                    System.out.println("Not this, try once more");
                }

        }
    }
}



