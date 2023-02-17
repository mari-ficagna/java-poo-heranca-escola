package pooaula10heranca;
//@author Mari (48) 99618-5728
 
public class PooAula10Heranca {

    public static void main(String[] args) {
       //Programa principal
       Aluno p1 = new Aluno();
       Professor p2 = new Professor();
       Funcionario p3 = new Funcionario();
       Visitante p4 = new Visitante();
       Bolsista p5 = new Bolsista();
              
       p1.setNome("Mario");
       p1.setIdade(16);
       p1.setSexo("Masculino");
       p1.setMatricula(1111);
       p1.setCurso("Informatica");
       p1.fazerAniver();
       p1.pagarMensalidade();
       
       p2.setNome("Claudio");
       p2.setIdade(60);
       p2.setSexo("Masculino"); 
       p2.setEspecialidade("Programador");
       p2.setSalario(4500.70f);
       p2.receberAum(200.00f);
             
       p3.setNome("Fabiana");
       p3.setIdade(40);
       p3.setSexo("Feminino");
       p3.setSetor("RH");
       p3.setTrabalhando(true);
       p3.fazerAniver();
       p3.mudarTrabalho();
       
       p4.setNome("Maria");
       p4.setIdade(32);
       p4.setSexo("Feminino");
       
       p5.setNome("Adriana");
       p5.setIdade(17);
       p5.setSexo("Feminino");
       p5.setMatricula(2222);
       p5.setBolsa(100.00f);
       p5.pagarMensalidade();
         
       System.out.println(p1.toString());
       System.out.println(p2.toString());
       System.out.println(p3.toString());
       System.out.println(p4.toString());
    }
}
