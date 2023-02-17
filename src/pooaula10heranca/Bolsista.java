package pooaula10heranca;
//@author Mari (48) 99618-5728
 
public class Bolsista extends Aluno{
    //Herança do tipo: para diferença
    //A classe Bolsista é descendente da classe Pessoa e filha da classe Aluno
    //Atributo
    private float bolsa;
    
    //Metodo Publico
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de "+this.getNome());
        
    }

    @Override //sobrepor
    public void pagarMensalidade() {
        //super.pagarMensalidade(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println(this.getNome()+" é bolsista! Pagamento facilitado.");
    }
    
    //Metodos Especiais
    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
       
}
