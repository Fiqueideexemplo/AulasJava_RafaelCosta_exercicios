package aula06;

import java.util.Scanner;

public class Exercicio4 {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int numero = s.nextInt();
        boolean primo = numero > 1;

        for (int i = 2; i < numero; i++){
            if (numero % i == 0){
                primo = false;
                break;
            }
        }

        if (primo){
            System.out.println("O número é primo!");
        } else {
            System.out.println("O número não é primo!");
        }

        s.close();
























































    }
}
