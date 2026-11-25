package aula4;

import java.util.Scanner;

public class Exercicio6 {
    static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        int a = s.nextInt();
        System.out.println("Primeiro valor  é igual a: " + a);

        System.out.println("Digite o segundo valor: ");
        int b = s.nextInt();
        System.out.println("Segundo valor é igual a: " + b);

        if (a > b && a != b) {
            System.out.println(a + " é diferente de " + b);
            System.out.println(a + " é maior que " + b );
        } else if (b > a){
            System.out.println(b + " é maior que " + a);
        } else if (a == b){
            System.out.println(a + " é igual a " + b);
        } else if (a >= b) {
            System.out.println(a + " é igual ou maior que " + b);
        }


    }
}
