//herança
package exame;


 abstract class Exame {
     //atributo - abstração
   private String nomePaciente;
   private String tipoSanguineo;
   private int anoNascimento;

  
   //construtor

    public Exame(String nomePaciente, String tipoSanguineo, int anoNascimento) {
        this.nomePaciente = nomePaciente;
        this.tipoSanguineo = tipoSanguineo;
        this.anoNascimento = anoNascimento;
    }
     //toString
     @Override
    public String toString() {
        return "Exame{" + "nomePaciente=" + nomePaciente + ", tipoSanguineo=" + tipoSanguineo + ", anoNascimento=" + anoNascimento + '}';
    }
    

    //get and set - encapsulamento
    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }
    
    
    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }
    

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        
        this.anoNascimento = anoNascimento;
        
    }

   
    
    
    
    //métodos - polimorfismo
    
   public abstract void classificarResultado();
   
   public abstract void mostrarResultado();
   
   public abstract void cadastrarExame();
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
 }