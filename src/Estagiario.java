public class Estagiario extends Funcionarios implements FuncionarioComBolsa{

    public Estagiario(String nome, String cpf, int numeroRegistro, String orgaoLotacao) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, 0.0);
    }

    @Override
    public double aumentoSalario() {
        return 0;
    }

    @Override
    public void reembolsoDespesas() {

    }
}
