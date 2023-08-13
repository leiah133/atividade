
package exame;


public class Glicemia extends Exame{
    int quantidadeGlicose;
    private String resultadoGlicemia;

    public Glicemia(int quantidadeGlicose ) {
        super("Marina", "A+", 1993);
        this.quantidadeGlicose = quantidadeGlicose;
    }
    

    @Override
    public void classificarResultado() {
        if(quantidadeGlicose < 100){
            resultadoGlicemia = "Normoglicemia";
        }else if (quantidadeGlicose >= 100 && quantidadeGlicose < 126 ){
            resultadoGlicemia = "Pré-diabetes";
        } else {
           resultadoGlicemia = "Diabete se lascou" ;
        }
    }

    @Override
    public void mostrarResultado() {
        System.out.println(" Status Glicemia" + resultadoGlicemia);
        System.out.println(super.toString());
    }

    @Override
    public void cadastrarExame() {
       
    }
    
    
   
  
   
}
