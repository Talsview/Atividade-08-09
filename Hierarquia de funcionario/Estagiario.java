public class Estagiario extends Funcionario {
    public double desconto;

    public Estagiario(String nome,double salario, double desconto){
        super(nome, salario);
        this.desconto = desconto;
    }
@Override

    public void exibirInformacoes(){
        System.out.println("Cargo: " + nome);
        
        System.out.println("Salario Total: " + (salario - desconto));
        
    }

}
