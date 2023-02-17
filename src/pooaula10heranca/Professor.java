package pooaula10heranca;
//@author Mari (48) 99618-5728
 
public class Professor extends Pessoa{
    //Atributos
    private String especialidade;
    private float salario;
    
    //Metodos Publicos
    public void receberAum(float aum){
        this.salario += aum;
    }
    
    //Metodos Especiais

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public float getSalario() {
        return salario;
    }
    
}
