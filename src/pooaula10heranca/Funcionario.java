package pooaula10heranca;
//@author Mari (48) 99618-5728
 
public class Funcionario extends Pessoa{
    //Atributos
    private String setor;
    private boolean trabalhando;
    
    //Metodos Publicos
    public void mudarTrabalho(){
        this.trabalhando = ! this.trabalhando; //vai inverter 
    }
    
    //Metodos Especiais

    public String getSetor() {
        return setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
}
