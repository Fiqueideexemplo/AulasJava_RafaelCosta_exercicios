package aula08;

import java.util.Scanner;

public class Exercicio4 {
    static void main() {
        Scanner s = new Scanner(System.in);
        double conversao = converterCParaF(s.nextDouble());
        System.out.println("Celsius para Fahrenheit: " + conversao);

    }
    static double converterCParaF(double C){
        double F;
        return F = C *1.8+32;
    }
}
