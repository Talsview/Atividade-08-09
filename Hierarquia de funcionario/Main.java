public class Main {
    public static void main(String[] args) {
        Gerente gerent = new Gerente("Gerente", 2000,50);
        Estagiario estag = new Estagiario("Estagiario",200.0, 50);
        Engenheiro eng = new Engenheiro("Engenheiro", 5000.0, "Engenharia");

        gerent.exibirInformacoes();
        estag.exibirInformacoes();
        eng.exibirInformacoes();  
    }
}
