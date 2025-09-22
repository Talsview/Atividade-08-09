class Papagaio extends Animal {
    public Papagaio(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void fazerSom() {
        System.out.println(nome + " diz: Canto! ");
    }
}
