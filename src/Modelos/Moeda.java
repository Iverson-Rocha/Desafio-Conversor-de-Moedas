package Modelos;

public class Moeda { private String moedaBase;
    private String moedaAlvo;
    private String dataTaxa;
    private double cotacao;
    private double resultadoDaConversao;
    private double valor;

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Moeda(MoedaExchange moedaExchange) {
        this.moedaBase = moedaExchange.base_code();
        this.moedaAlvo = moedaExchange.target_code();
        this.cotacao = moedaExchange.conversion_rate();
        this.resultadoDaConversao = moedaExchange.conversion_result();
        this.dataTaxa = moedaExchange.time_last_update_utc().substring(0, 16);
    }

    public void ExibeMoeda(){
        System.out.println("\n\nO valor de: " + valor + " " + moedaBase + " convertido é "+ resultadoDaConversao +" "+ moedaAlvo  );
                //"\nUsando a Cotação: " + cotacao + "    Atualizada em: " + dataTaxa + "\n\n");
    }



}
