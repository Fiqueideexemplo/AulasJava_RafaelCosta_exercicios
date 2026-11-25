package aula06;

import java.util.Scanner;

public class Exercicio5 {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double soma = 0;
        for (int i = 1; i <= 5; i++){
            System.out.println("Digite a nota: " + i + ":");
            double nota = s.nextDouble();
            soma += nota;
        }
        double media = soma / 5;
        System.out.println("A média é: " + media);
        s.close();;






    }
}
