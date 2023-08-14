
package exame;

public abstract class Exame {
    // Atributos da classe Exame
    protected String nomePaciente;
    protected String tipoSanguineo;
    protected int anoNascimento;
    
    // Construtor da classe Exame

    public Exame(String nomePaciente, String tipoSanguineo, int anoNascimento) {
        this.nomePaciente = nomePaciente;
        this.tipoSanguineo = tipoSanguineo;
        this.anoNascimento = anoNascimento;
    }
    
    //método para calcular idade ficticia
    public int calcularIdade() {
        int anoAtual = 2023;
        return anoAtual - anoNascimento;
    }

     // Métodos abstratos que serão implementados nas classes filhas
    public abstract String getClassificacao();
    public abstract String getResultado();
    public abstract void cadastrarExame(double valor);
}

/*
Neste código:

Classe Abstrata Exame: Esta é a classe base abstrata que contém os atributos e métodos gerais para exames. Os atributos nomePaciente, tipoSanguineo e anoNascimento armazenam informações sobre o paciente. O construtor Exame é usado para inicializar esses atributos.

Método Abstrato getClassificacao(): Este método abstrato será implementado nas classes filhas e é responsável por retornar a classificação específica para cada tipo de exame.

Método Abstrato getResultado(): Outro método abstrato que será implementado nas classes filhas para retornar o resultado específico de cada exame.

Método Abstrato cadastrarExame(): Mais um método abstrato que será implementado nas classes filhas para permitir o cadastro dos resultados dos exames.

public int calcularIdade() {: Isso define a assinatura do método calcularIdade(). Ele é público (public), portanto, pode ser acessado de fora da classe. Ele retorna um valor inteiro (int).

int anoAtual = 2023;: Nessa linha, você declara uma variável local chamada anoAtual e atribui o valor 2023 a ela. Esse valor representa o ano atual fictício para o qual você deseja calcular a idade. Em um cenário real, você pode obter o ano atual usando funções da biblioteca de data e hora.

return anoAtual - anoNascimento;: Aqui, você calcula a idade subtraindo o ano de nascimento (anoNascimento) do ano atual (anoAtual). Isso resultará na diferença entre os dois anos, que é a idade do paciente.
*/