public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2020, 4);
        Moto moto = new Moto("Honda", "CB500", 2021, 500);
        Caminhao caminhao = new Caminhao("Volvo", "FH", 2019, 18.0);

        System.out.println("\n Informações do Carro");
        carro.exibirInformacoes();
        carro.acelerar();
        carro.frear();

        System.out.println("\n Informações da Moto");
        moto.exibirInformacoes();
        moto.acelerar();
        moto.frear();

        System.out.println("\n Informações do Caminhão");
        caminhao.exibirInformacoes();
        caminhao.acelerar();
        caminhao.frear();
    }
}