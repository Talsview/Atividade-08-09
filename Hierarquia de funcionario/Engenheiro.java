public class Engenheiro extends Funcionario {
    public Engenheiro curso;
    public Engenheiro(String nome,double salario,String curso){
        super(nome, salario);

    }
@Override

    public void exibirInformacoes(){
        System.out.println("Cargo: " + nome);
        System.out.println("Salario Total: " + salario);
        System.out.println("Curso: " + curso);
        
    }

}

