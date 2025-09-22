import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Criando lista de animais
        ArrayList<Animal> animais = new ArrayList<>();

        // Adicionando diferentes animais
        animais.add(new Cachorro("Rex", 5));
        animais.add(new Gato("Mimi", 3));
        animais.add(new Papagaio("Loro", 2));

        // Percorrendo a lista e chamando fazerSom()
        for (Animal animal : animais) {
            animal.exibirInformacoes();
            animal.fazerSom();
            System.out.println();
        }
    }
}