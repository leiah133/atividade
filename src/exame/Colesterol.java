
package exame;


public class Colesterol extends Exame{
    private double colesterolHDL;
    private double colesterolLDL;
    private String risco;
    private String classificarHDL;
    private String classificarLDL;
    int idade;
    
    
    public Colesterol(double colesterolHDL, double colesterolLDL, String risco, String classificarHDL, String classificarLDL){
        super( "Marina", "A", 1993);
        this.colesterolHDL = colesterolHDL;
        this.colesterolLDL = colesterolLDL;
        this.classificarHDL = classificarLDL;
        this.classificarLDL = classificarLDL;
        this.risco = risco;
    }
    
    
    

    @Override
    public void classificarResultado() {
        int anoAtualFixo = 2023;
         idade = anoAtualFixo - getAnoNascimento();
    }

    @Override
    public void mostrarResultado() {
    }

    @Override
    public void cadastrarExame() {
    }
    
    
}
