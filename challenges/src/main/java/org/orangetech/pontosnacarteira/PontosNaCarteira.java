package org.orangetech.pontosnacarteira;

import java.util.Scanner;

public class PontosNaCarteira {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidade = leitor.nextInt();
        int multas = leitor.nextInt();

        if (velocidade > 80) {
            multas++;

            if ((multas < 3)) {
                System.out.println(multas + " multas. Nao levou pontos na carteira");
            } else if (multas >= 3) {
                System.out.println(multas + " multas. Levou pontos na carteira");
            }
        } else {
            System.out.println(multas + " multas. Nao levou pontos na carteira");
        }
    }
}
