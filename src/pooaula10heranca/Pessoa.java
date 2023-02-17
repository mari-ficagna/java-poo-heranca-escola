package pooaula10heranca;
//@author Mari (48) 99618-5728
 
public abstract class Pessoa {
    //Classe raiz abstrata, ou seja, não pode gerar objeto.
    //É progenitora das classes Aluno, Professor, Funcionario e Visitante; e ascendente das classes Bolsista e Tecnico.
    //Atributos
    private String nome;
    private int idade;
    private String sexo;
    
    //Metodo Publico
    public final void fazerAniver(){
        //final não pode ser sobreposto
        this.idade++;
    }
    
    //Metodos Especiais
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }
    
    //Metodo ToString

    @Override
    public String toString() {
        return "\n Nome: " + nome + "\n Idade: " + idade + "\n Sexo: " + sexo;
    }
    
    
}
