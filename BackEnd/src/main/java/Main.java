import jogo.menus.IniciarJogo;

public class Main {

    public static void main(String[] args) {
        String menu;
        String opcoes;
        Integer escolha;

        menu = """
                Um mundo... Destruido pelo desespero e moldado pelo medo... Se aventure se tiver coragem...
                """;

        opcoes = """
                Deseja prosseguir... É um caminho sem volta...

                1. Sim
                2. Não

                escolha:
                """;

        IniciarJogo iniciarJogo = new IniciarJogo(
                menu, opcoes);
        
        System.out.println(iniciarJogo.getMenu());

    }

}
