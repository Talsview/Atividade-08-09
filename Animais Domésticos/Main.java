import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();
        
        animais.add(new Cachorro("Rex", 5));
        animais.add(new Gato("Mimi", 3));
        animais.add(new Papagaio("Loro", 2));

        for (Animal animal : animais) {
            animal.exibirInformacoes();
            animal.fazerSom();
            System.out.println();
        }
    }

}
