
package exame;


public class Colesterol extends Exame {
    private double quantidadeLDL;
    private double quantidadeHDL;
    private char risco;

    public Colesterol(String nomePaciente, String tipoSanguineo, int anoNascimento) {
        super(nomePaciente, tipoSanguineo, anoNascimento);
    }

    @Override
    public String getClassificacao() {
        return "LDL: " + getClassificacaoLDL() + "\nHDL: " + getClassificacaoHDL();
    }

    private String getClassificacaoLDL() {
        if (risco == 'B') {
            return (quantidadeLDL < 100) ? "Bom" : "Alto";
        } else if (risco == 'M') {
            return (quantidadeLDL < 70) ? "Bom" : "Alto";
        } else if (risco == 'A') {
            return (quantidadeLDL < 50) ? "Bom" : "Alto";
        } else {
            return "Indefinido";
        }
    }

    private String getClassificacaoHDL() {
        if (anoNascimento <= 19) {
            return (quantidadeHDL > 45) ? "Bom" : "Alto";
        } else {
            return (quantidadeHDL > 40) ? "Bom" : "Alto";
        }
    }

    @Override
    public String getResultado() {
        return "Colesterol LDL: " + quantidadeLDL + " mg/dL\nColesterol HDL: " + quantidadeHDL + " mg/dL\nClassificação:\n" + getClassificacao();
    }

    @Override
    public void cadastrarExame(double valor) {
        quantidadeLDL = valor;
    }

    public void cadastrarHDL(double valor) {
        quantidadeHDL = valor;
    }

    public void cadastrarRisco(char risco) {
        this.risco = risco;
    }
}
/*
Aqui está a explicação detalhada:

public class Colesterol extends Exame {: Declaração da classe Colesterol, que herda da classe Exame. Isso significa que Colesterol é uma subclasse de Exame.

private double quantidadeLDL; e private double quantidadeHDL;: Declaração dos atributos quantidadeLDL e quantidadeHDL, que armazenarão as quantidades de colesterol LDL e HDL nos exames, respectivamente. Eles são marcados como private, o que significa que só podem ser acessados dentro da classe Colesterol.

private char risco;: Declaração do atributo risco, que armazenará o nível de risco do paciente ('B' para baixo, 'M' para médio, 'A' para alto). Também é marcado como private.

public Colesterol(String nomePaciente, String tipoSanguineo, int anoNascimento): Construtor da classe Colesterol. Recebe os dados básicos do paciente (nomePaciente, tipoSanguineo e anoNascimento) e chama o construtor da classe pai (Exame) usando super(nomePaciente, tipoSanguineo, anoNascimento).

@Override: Indica que você está sobrescrevendo métodos da classe pai (Exame).

public String getClassificacao(): Implementação do método abstrato getClassificacao() da classe Exame. Retorna uma string que combina as classificações do LDL e do HDL.

private String getClassificacaoLDL(): Método privado para calcular a classificação do LDL com base no risco e na quantidade de LDL.

private String getClassificacaoHDL(): Método privado para calcular a classificação do HDL com base na idade e na quantidade de HDL.

public String getResultado(): Implementação do método abstrato getResultado() da classe Exame. Retorna uma string formatada com as quantidades de LDL e HDL e suas classificações.

public void cadastrarExame(double valor): Implementação do método abstrato cadastrarExame() da classe Exame. Recebe um valor (quantidade de LDL) e atribui-o ao atributo quantidadeLDL.

public void cadastrarHDL(double valor): Método para cadastrar a quantidade de HDL.

public void cadastrarRisco(char risco): Método para cadastrar o nível de risco.
*/