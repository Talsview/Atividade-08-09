class Caminhao extends Veiculo {
    double capacidadeDeCarga;

    public Caminhao(String marca, String modelo, int ano, double capacidadeDeCarga) {
        super(marca, modelo, ano);
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    @Override
    public void acelerar() {
        System.out.println("O caminhão acelera lentamente!");
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Capacidade de carga: " + capacidadeDeCarga + " toneladas");
    }
}