package org.orangetech.salvandomusicas;

import java.util.Scanner;

public class SalvandoMusicas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String arquivoDoPc = leitor.next();

        String fileExtension = arquivoDoPc.substring(arquivoDoPc.length() - 4);

        if ( fileExtension.equalsIgnoreCase(".mp3") ) {
            System.out.println("Salvar");
        } else {
            System.out.println("Deletar");
        }
    }
}
