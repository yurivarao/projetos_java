package projetos_exemplo.Funcionario;

public class Gerente extends Funcionario {

    public Gerente(String cargo, double salario) {
        super(cargo, salario);
    }

    public void calcula_imposto() {
        System.out.println("Cargo: " + getCargo() + " - Imposto: " + getSalario() * 0.1);
    }
}
