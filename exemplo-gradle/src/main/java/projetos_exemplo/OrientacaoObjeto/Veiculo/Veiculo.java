package projetos_exemplo.OrientacaoObjeto.Veiculo;

public abstract class Veiculo {

    private final String marca;
    private final String modelo;
    private final int ano;
    private final double valor_venal;

    public Veiculo(String marca, String modelo, int ano, double valor_venal) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor_venal = valor_venal;
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAno() { return ano; }
    public double getValor_venal() { return valor_venal; }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        Veiculo comparavel;
        if (obj instanceof Veiculo) {
            comparavel = (Veiculo)obj;
        } else {
            return false;
        }

        return comparavel.marca == this.marca && comparavel.modelo == this.modelo && comparavel.ano == this.ano && comparavel.valor_venal == this.valor_venal;
    }

}