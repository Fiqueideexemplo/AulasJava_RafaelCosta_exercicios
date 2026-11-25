package aula08;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int maior = maiorNumero(s.nextInt(), s.nextInt(), s.nextInt());
        System.out.println("Maior número: " + maior);
    }
    static int maiorNumero(int valor1, int valor2, int valor3) {
        if (valor1 > valor2 && valor1 > valor3) {
            return valor1;
        } else if (valor2 > valor1 && valor2 > valor3) {
            return valor2;
        } else {
            return valor3;
        }
    }
}
