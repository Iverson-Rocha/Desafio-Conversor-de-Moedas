package Modelos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Texto {
    public void TextoMenu(){
        System.out.println(
                "\n ********* Conversor de Moedas *********\n" +
                        " ********** Escolha uma opção ********** \n" +
                        "1 - Dólar (USD) para Real Brasileiro (BRL)\n" +
                        "2 - Real Brasileiro (BRL) para Dólar (USD)\n" +
                        "3 - Euro (EUR) para Real Brasileiro (BRL)\n" +
                        "4 - Real Brasileiro (BRL) para Euro (EUR)\n" +
                        "5 - Libra Esterlina (GBP) para Real Brasileiro (BRL)\n" +
                        "6 - Real Brasileiro (BRL) para Libra Esterlina (GBP)\n" +
                        "7 - Sair\n" +
                        "**************************************\n\n" +
                        "Digite a opção desejada: "
        );
    }

    public int ValidaOpcao(Scanner leitura) {
        int key = 0;
        while (true) {
            try {
                key = leitura.nextInt();
                if (key < 1 || key > 7) {
                    System.out.println("Opção inválida! Por favor, insira um número entre 1 e 7.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, insira um número entre 1 e 7!\n");
                leitura.nextLine();
            }
        }
        return key;
    }
}
