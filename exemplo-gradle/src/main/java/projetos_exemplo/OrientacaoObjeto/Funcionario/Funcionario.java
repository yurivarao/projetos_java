package projetos_exemplo.OrientacaoObjeto.Funcionario;

public class Funcionario {

    private final String cargo;
    private final double salario;

    public Funcionario (String cargo, double salario) {
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void calcula_imposto() {
        System.out.println("Cargo: " + getCargo() + " - Imposto: " + getSalario() * 0.1);
    }
}
