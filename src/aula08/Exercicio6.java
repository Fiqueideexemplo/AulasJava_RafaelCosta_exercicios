package aula08;

import java.util.Scanner;

public class Exercicio6 {
    static void main() {
        Scanner s = new Scanner(System.in);
        System.out.println("Número é impar ou par?");
        verificarPar(s.nextInt());


    }
    static boolean verificarPar(int numero) {
        if (numero % 2 == 0) {
            System.out.println("É par");
            return true;
        } else {
            System.out.println("É impar");
            return false;

        }
    }
}
