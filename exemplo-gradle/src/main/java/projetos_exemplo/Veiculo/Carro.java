package projetos_exemplo.Veiculo;

public class Carro {

    private final String marca;
    private final String modelo;
    private final String variante;
    private final int ano;
    private int qtd_pessoas;

    public Carro(String marca, String modelo, String variante, int ano, int qtd_pessoas) {
        this.marca = marca;
        this.modelo = modelo;
        this.variante = variante;
        this.ano = ano;
        this.qtd_pessoas = qtd_pessoas;
    }

    public void adicionar_pessoas(int quantidade) {
        qtd_pessoas = qtd_pessoas + quantidade;
    }

    public void remover_pessoas(int quantidade) {
        qtd_pessoas = qtd_pessoas - quantidade;
    }

    public static void main(String[] args) {

        Carro carro = new Carro("Fiat", "Uno", "Sport", 2011, 4);

        carro.remover_pessoas(3);
        carro.adicionar_pessoas(2);

        System.out.println("Marca: " + carro.marca + "\n" +
                           "Modelo: " + carro.modelo + "\n" +
                           "Variante: " + carro.variante + "\n" +
                           "Ano: " + carro.ano + "\n" +
                           "Passageiros: " + carro.qtd_pessoas);
    }
}
