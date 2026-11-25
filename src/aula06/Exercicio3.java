package aula06;

import java.util.Scanner;

public class Exercicio3 {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numeroI = s.nextInt();
        long fatorial = 1;
        System.out.println("Número inteiro: " + numeroI);
        int i = 1;
        do {
            fatorial *= i;
            i++;

        } while (i <= numeroI);
        System.out.println("Fatorial: " + fatorial);


























    }
}
