package pooaula10heranca;
// @author Mari (48) 99618-5728
 
public class Aluno extends Pessoa {
    //Herança para diferença
    //Atributos
    private int matricula;
    private String curso;
    
    //Metodos publicos
    public void cancelarMatr(){
        System.out.println("Matricula sera cancelada.");
    }
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do(a) aluno(a)"+this.getNome());
    }
    
    //Metodos Especiais
    public int getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
