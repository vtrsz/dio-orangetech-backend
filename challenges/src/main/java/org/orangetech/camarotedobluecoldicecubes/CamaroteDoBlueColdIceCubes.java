package org.orangetech.camarotedobluecoldicecubes;

import java.util.Scanner;

public class CamaroteDoBlueColdIceCubes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = leitor.nextInt();
        int pessoasNoCamarote = 0;

        int possiveisPessoasNoCamarote = tamanhoDaFila / 2;
        int pessoasRestantes = tamanhoDaFila % 2;

        pessoasNoCamarote =  possiveisPessoasNoCamarote + pessoasRestantes;

        System.out.println(pessoasNoCamarote + " pessoas no camarote");
    }
}
