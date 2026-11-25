package aula06;

public class Exercicio6 {
    static void main(String[] args) {
        int i = 1;
        int num = 1;
        int soma = 0;

        while (i <= 10) {


            int fibo = num + soma;
            soma = num;
            num = fibo;
            System.out.println(fibo);
            i++;
        }




























    }
}
