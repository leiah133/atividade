
package exame;


public class Principal {
    public static void main(String[] args) {
     
        String nomePaciente = "Léia Maria dos Santos Oliveira";
        String tipoSanguineo = "A+";
        int anoNascimento = 1993 ;
        
   
      
     
        Glicemia glicemia = new Glicemia(nomePaciente, tipoSanguineo, anoNascimento);
        glicemia.cadastrarExame(110);
        System.out.println("Resultado Exame:\n" + glicemia.getResultado());

   
        Colesterol colesterol = new Colesterol(nomePaciente, tipoSanguineo, anoNascimento);
        colesterol.cadastrarExame(160);
        colesterol.cadastrarHDL(50);
        colesterol.cadastrarRisco('M');
        System.out.println("\nExame de Colesterol:\n" + colesterol.getResultado());

   
        Triglicerideo triglicerideos = new Triglicerideo(nomePaciente, tipoSanguineo, anoNascimento);
        triglicerideos.cadastrarExame(120);
        System.out.println("\nExame de Triglicerídeos:\n" + triglicerideos.getResultado());
    }
}

