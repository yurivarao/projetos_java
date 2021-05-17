package projetos_exemplo.Funcionario;

public class main_class {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Gerente", 5000);
        Supervisor supervisor = new Supervisor("Supervisor", 3500);
        Atendente atendente = new Atendente("Atendente", 1500);

        gerente.calcula_imposto();
        supervisor.calcula_imposto();
        atendente.calcula_imposto();
    }
}
