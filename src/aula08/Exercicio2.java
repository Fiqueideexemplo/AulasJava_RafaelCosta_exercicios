package aula08;

import java.util.Scanner;

public class Exercicio2 {
    static void main() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite dois valores inteiros: ");
        int valor = somar(s.nextInt(),s.nextInt());
        System.out.println("Soma é igual a: " + valor);

    }
    static int somar(int valor, int valor2){
        return valor + valor2;
    }
}
