public class FuncionariosAdministrativos extends Funcionarios {

    private String funcaoAdministrativa;
    private String senioridade;

    public FuncionariosAdministrativos(String nome, String cpf, Integer nroRegistro, String orgaoLotacao, double salario, String funcaoAdministrativa, String senioridade) {
        super(nome, cpf, nroRegistro, orgaoLotacao, salario);
        this.funcaoAdministrativa = funcaoAdministrativa;
        this.senioridade = senioridade;

    }

    public String getFuncaoAdministrativa() {
        return funcaoAdministrativa;
    }

    public void setFuncaoAdministrativa(String funcaoAdministrativa) {
        this.funcaoAdministrativa = funcaoAdministrativa;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }

    @Override
    public double aumentoSalario() {
        return this.getSalario() * 0.10;
    }

}
