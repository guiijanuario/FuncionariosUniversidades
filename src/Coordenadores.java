import java.util.List;

public class Coordenadores extends Funcionarios{

    private List<String> professoresSupervisionados;

    public Coordenadores(String nome, String cpf, Integer nroRegistro, String orgaoLotacao, double salario, List<String> professoresSupervisionados ) {
        super(nome, cpf, nroRegistro, orgaoLotacao, salario);
        this.professoresSupervisionados = professoresSupervisionados;
    }

    public List<String> getProfessoresSupervisionados() {
        return professoresSupervisionados;
    }

    public void setProfessoresSupervisionados(List<String> professoresSupervisionados) {
        this.professoresSupervisionados = professoresSupervisionados;
    }

    @Override
    public double aumentoSalario() {
        return this.getSalario() * 0.5;
    }


    public void cadastrarProfessor(List<String> professoresSupervisionados, String nome, String cpf, Integer nroRegistro,
                                          String orgaoLotacao, double salario, String nivelGraduacao,
                                          String disciplinaMinistrada, int qtdAlunos, int qtdTurmas) {

        Professores professor = new Professores(nome, cpf, nroRegistro, orgaoLotacao, salario, nivelGraduacao,
                disciplinaMinistrada, qtdAlunos, qtdTurmas);

        if (professoresSupervisionados.size() >= 5){
            System.out.println("Já tem 5 professores cadastrados!");
        }

        professor.cadastrarProfessor();
        System.out.println("Professor cadastrado com sucesso!");
        professoresSupervisionados.add(String.valueOf(professor));
    }
}
