package aula08;

import java.util.Scanner;

public class Exercicio5 {
    static void main() {
        Scanner s = new Scanner(System.in);
        System.out.println("Insira as notas para calcular a média: ");
        double media = calcularMedia(s.nextDouble(),s.nextDouble(),s.nextDouble());
        System.out.println("Média das notas: " + media);
    }
    static double calcularMedia(double nota1, double nota2, double nota3){
        return (nota1+nota2+nota3) /3;
    }
}
