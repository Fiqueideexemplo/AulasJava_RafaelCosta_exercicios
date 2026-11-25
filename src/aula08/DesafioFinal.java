package aula08;

import java.util.Scanner;

public class DesafioFinal {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] cadastro  = new String[2][3];

        cadastro[0][0] = "Arthur";
        cadastro[0][1] = "16";
        cadastro[0][2] = "Rua Madri Cabrini";

        cadastro[1][0] = "Matheus";
        cadastro[1][1] = "16";
        cadastro[1][2] = "Largo Nossa Senhora da Conceição";

        int opcao;
        do {
            System.out.println("=====BEM VINDO AO SITE=====");
            System.out.println("1 - Cadastro");
            System.out.println("2 - Consulta de Cadastros");
            System.out.println("3 - Atualização de Cadastros");
            System.out.println("0 - Exclusão de Cadastros");
            opcao = sc.nextInt();
        }
        while (opcao != 0);

    }
}
