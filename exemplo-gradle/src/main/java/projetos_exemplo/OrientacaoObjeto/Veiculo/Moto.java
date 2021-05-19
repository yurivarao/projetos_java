package projetos_exemplo.OrientacaoObjeto.Veiculo;

public class Moto extends Veiculo {

    private String cilindradas;

    public Moto(String marca, String modelo, int ano, double valor_venal) {
        super(marca, modelo, ano, valor_venal);
    }

    public Moto(String marca, String modelo, int ano, double valor_venal, String cilindradas) {
        super(marca, modelo, ano, valor_venal);
        this.cilindradas = cilindradas;
    }

    public static void main(String[] args) {

        Moto moto1 = new Moto("Honda", "POP", 2016, 8000.00, "100cc");
        Moto moto2 = new Moto("Honda", "CG", 2016, 15000.00, "300cc");

        System.out.println("Marca: " + moto1.getMarca() + "\n" +
                "Modelo: " + moto1.getModelo() + "\n" +
                "Ano: " + moto1.getAno() + "\n" +
                "Valor Venal: " + moto1.getValor_venal() + "\n" +
                "Cilindradas: " + moto1.cilindradas + "\n");

        System.out.println("Marca: " + moto2.getMarca() + "\n" +
                "Modelo: " + moto2.getModelo() + "\n" +
                "Ano: " + moto2.getAno() + "\n" +
                "Valor Venal: " + moto2.getValor_venal() + "\n" +
                "Cilindradas: " + moto2.cilindradas + "\n");

        System.out.println(moto1.equals(moto2));
    }
}