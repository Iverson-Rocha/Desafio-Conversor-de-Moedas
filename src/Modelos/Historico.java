package Modelos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Historico {
    private Scanner leitura;
    List<Moeda> historicoDeConversao = new ArrayList<>();

    public Historico(Scanner leitura) {
        this.leitura = leitura;
    }

    public void Adicionar(Moeda moeda){
        historicoDeConversao.add(moeda);
    }

}
