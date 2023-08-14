
package exame;


public class Glicemia extends Exame {
    private double quantidadeGlicose;

    public Glicemia(String nomePaciente, String tipoSanguineo, int anoNascimento) {
        super(nomePaciente, tipoSanguineo, anoNascimento);
    }

    @Override
    public String getClassificacao() {
        if (quantidadeGlicose < 100) {
            return "Normoglicemia";
        } else if (quantidadeGlicose < 126) {
            return "Pré-diabetes";
        } else {
            return "Diabetes estabelecido";
        }
    }

    @Override
    public String getResultado() {
         return "Paciente: " + nomePaciente + "\nIdade: " + calcularIdade() + " anos\n\nExame Glicemia:\nGlicemia: " + quantidadeGlicose + " mg/dL\nClassificação: " + getClassificacao();
    }

    @Override
    public void cadastrarExame(double valor) {
        quantidadeGlicose = valor;
    }
}
/*

public class Glicemia extends Exame {: Essa linha declara a classe Glicemia, que herda (extende) da classe Exame. Isso significa que Glicemia é uma subclasse de Exame e herda seus atributos e métodos.

private double quantidadeGlicose;: Aqui, você declara um atributo privado quantidadeGlicose, que é específico para a classe Glicemia. Ele armazena a quantidade de glicose no exame.

public Glicemia(String nomePaciente, String tipoSanguineo, int anoNascimento): Este é o construtor da classe Glicemia. Ele recebe os parâmetros necessários para criar uma instância da classe, além de chamar o construtor da classe pai Exame usando super(nomePaciente, tipoSanguineo, anoNascimento).

@Override: Essa anotação indica que você está substituindo (sobrescrevendo) um método da classe pai. Neste caso, você está sobrescrevendo os métodos abstratos da classe Exame.

public String getClassificacao(): Esta é a implementação do método abstrato getClassificacao() da classe Exame. Dependendo da quantidade de glicose, ele retorna a classificação correspondente.

public String getResultado(): Esta é a implementação do método abstrato getResultado() da classe Exame. Ele retorna o resultado do exame de glicemia, incluindo a quantidade de glicose e sua classificação.

public void cadastrarExame(double valor): Esta é a implementação do método abstrato cadastrarExame() da classe Exame. Ele atribui a quantidade de glicose com base no valor fornecido.*/