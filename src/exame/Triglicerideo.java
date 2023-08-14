
package exame;

public class Triglicerideo extends Exame {
    private double quantidadeTriglicerideos;

    public Triglicerideo(String nomePaciente, String tipoSanguineo, int anoNascimento) {
        super(nomePaciente, tipoSanguineo, anoNascimento);
    }

    @Override
    public String getClassificacao() {
            String comJejum ="";
        if (anoNascimento <= 9) {
            comJejum = (quantidadeTriglicerideos < 75) ? "Normal" : "Alto";
            
        } else if (anoNascimento <= 19) {
            comJejum = (quantidadeTriglicerideos < 90) ? "Normal" : "Alto";
        } else {
           comJejum = (quantidadeTriglicerideos < 150) ? "Normal" : "Alto";
        }
         return "Triglicerídeos: " + quantidadeTriglicerideos + " mg/dL\nClassificação: Com SJejum " + comJejum;
    
    }

    @Override
    public String getResultado() {
        return "Triglicerídeos: " + quantidadeTriglicerideos + " mg/dL\nClassificação: " + getClassificacao();
    }

    @Override
    public void cadastrarExame(double valor) {
        quantidadeTriglicerideos = valor;
    }
}

/*
Aqui está a explicação detalhada:

public class Triglicerideos extends Exame {: Declaração da classe Triglicerideos, que herda da classe Exame. Isso significa que Triglicerideos é uma subclasse de Exame.

private double quantidadeTriglicerideos;: Declaração do atributo quantidadeTriglicerideos, que armazenará a quantidade de triglicerídeos no exame. Ele é marcado como private, o que significa que só pode ser acessado dentro da classe Triglicerideos.

public Triglicerideos(String nomePaciente, String tipoSanguineo, int anoNascimento): Construtor da classe Triglicerideos. Recebe os dados básicos do paciente (nomePaciente, tipoSanguineo e anoNascimento) e chama o construtor da classe pai (Exame) usando super(nomePaciente, tipoSanguineo, anoNascimento).

@Override: Indica que você está sobrescrevendo métodos da classe pai (Exame).

public String getClassificacao(): Implementação do método abstrato getClassificacao() da classe Exame. Calcula e retorna a classificação dos triglicerídeos com base na quantidade e na faixa etária do paciente.

public String getResultado(): Implementação do método abstrato getResultado() da classe Exame. Retorna uma string formatada com a quantidade de triglicerídeos e sua classificação.

public void cadastrarExame(double valor): Implementação do método abstrato cadastrarExame() da classe Exame. Recebe um valor (quantidade de triglicerídeos) e atribui-o ao atributo quantidadeTriglicerideos.
*/
