abstract class Funcionarios {

    private String nome;
    private String cpf;
    private Integer nroRegistro;
    private String orgaoLotacao;
    private double salario;

    public Funcionarios(String nome, String cpf, Integer nroRegistro, String orgaoLotacao, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.nroRegistro = nroRegistro;
        this.orgaoLotacao = orgaoLotacao;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getNroRegistro() {
        return nroRegistro;
    }

    public void setNroRegistro(Integer nroRegistro) {
        this.nroRegistro = nroRegistro;
    }

    public String getOrgaoLotacao() {
        return orgaoLotacao;
    }

    public void setOrgaoLotacao(String orgaoLotacao) {
        this.orgaoLotacao = orgaoLotacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double aumentoSalario();

}
