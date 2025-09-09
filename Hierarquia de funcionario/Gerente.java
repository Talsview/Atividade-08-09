public class Gerente extends Funcionario {
    public double bonus;

    public Gerente(String nome,double salario,double bonus){
        super(nome, salario);
        this.bonus = bonus;
    }
@Override

    public void exibirInformacoes(){
        System.out.println("Cargo: " + nome);
    
        System.out.println("Salario Total: " + (salario + bonus));
        
    }

}
