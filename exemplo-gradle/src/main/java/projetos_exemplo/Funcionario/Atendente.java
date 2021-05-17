package projetos_exemplo.Funcionario;

public class Atendente extends Funcionario {

    public Atendente(String cargo, double salario) {
        super(cargo, salario);
    }

    public void calcula_imposto() {
        System.out.println("Cargo: " + getCargo() + " - Imposto: " + getSalario() * 0.01);
    }
}
