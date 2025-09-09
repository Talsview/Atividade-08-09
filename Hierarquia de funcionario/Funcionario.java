public class Funcionario {
    String nome;
    double salario;

    public Funcionario (String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void exibirInformacoes() {
        System.out.println("Cargo " + nome);
        System.out.println("Salario: " + salario);
    }

    
}
