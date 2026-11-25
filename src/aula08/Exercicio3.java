package aula08;

import java.util.Scanner;

public class Exercicio3 {
    static void main() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um valor inteiro: ");
        int valor = dobrar(s.nextInt());
        System.out.println("O dobro desse valor é: " + valor);
    }
    static int dobrar(int valor){
        return valor*2;
    }
}
