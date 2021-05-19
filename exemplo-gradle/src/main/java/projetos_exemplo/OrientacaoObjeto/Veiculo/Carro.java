package projetos_exemplo.OrientacaoObjeto.Veiculo;

public class Carro extends Veiculo {

    private final int qtd_portas;
    private int qtd_pessoas;

    public Carro(String marca, String modelo, int ano, double valor_venal, int qtd_portas) {
        super(marca, modelo, ano, valor_venal);
        this.qtd_portas = qtd_portas;
    }

    public Carro(String marca, String modelo, int ano, double valor_venal, int qtd_portas, int qtd_pessoas) {
        super(marca, modelo, ano, valor_venal);
        this.qtd_portas = qtd_portas;
        this.qtd_pessoas = qtd_pessoas;
    }

    public void adicionar_pessoas(int quantidade) {
        qtd_pessoas = qtd_pessoas + quantidade;
    }

    public void remover_pessoas(int quantidade) {
        qtd_pessoas = qtd_pessoas - quantidade;
    }

    public static void main(String[] args) {

        Carro carro1 = new Carro("Fiat", "Uno", 2011, 30000, 4, 4);
        Carro carro2 = new Carro("Fiat", "Uno", 2011, 30000, 4, 4);

        carro1.remover_pessoas(3);
        carro1.adicionar_pessoas(2);

        System.out.println("Marca: " + carro1.getMarca() + "\n" +
                           "Modelo: " + carro1.getModelo() + "\n" +
                           "Ano: " + carro1.getAno() + "\n" +
                           "Valor Venal: " + carro1.getValor_venal() + "\n" +
                           "Portas: " + carro1.qtd_portas + "\n" +
                           "Passageiros: " + carro1.qtd_pessoas + "\n");

        System.out.println("Marca: " + carro2.getMarca() + "\n" +
                "Modelo: " + carro2.getModelo() + "\n" +
                "Ano: " + carro2.getAno() + "\n" +
                "Valor Venal: " + carro2.getValor_venal() + "\n" +
                "Portas: " + carro2.qtd_portas + "\n" +
                "Passageiros: " + carro2.qtd_pessoas + "\n");

        System.out.println(carro1.equals(carro2));
    }
}
