package org.orangetech.dcmonalds;

import java.util.Scanner;

public class DcMonalds {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String ingredientes = leitor.next();
        String listaIngredientes[] = new String[3];

        listaIngredientes = ingredientes.split(";");

        for (String ingrediente: listaIngredientes) {
            System.out.println(ingrediente);
        }
    }
}
