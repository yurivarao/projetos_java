package projetos_exemplo.Funcionario;

public class Supervisor extends Funcionario {

    public Supervisor(String cargo, double salario) {
        super(cargo, salario);
    }

    public void calcula_imposto() {
        System.out.println("Cargo: " + getCargo() + " - Imposto: " + getSalario() * 0.05);
    }
}
