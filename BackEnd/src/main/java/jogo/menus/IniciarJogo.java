package jogo.menus;

import java.util.Scanner;

public class IniciarJogo extends Menu {

    public IniciarJogo() {
    }

    @Override
    public void criarMenu() {
        String menu;
        String opcoes;
        Integer escolha;

        Scanner sc = new Scanner(System.in);

        menu = """
                Um mundo... Destruido pelo desespero e moldado pelo medo... Se aventure se tiver coragem...
                """;

        opcoes = """
                Deseja prosseguir... É um caminho sem volta...

                1. Sim
                2. Não

                escolha:
                """;

        setMenu(menu);
        setOpcoes(opcoes);
    }

    @Override
    public void chamarMenu() {

        criarMenu();

        Scanner sc = new Scanner(System.in);

        String escolher = String.format ("""

        %s
        %s
        
                """, getMenu(), getOpcoes());
        
        System.out.printf("%s", escolher);

        if (!sc.hasNextInt()) {
            System.out.println("Erro: Selecione a opção correta | Erro ao selecionar opção.");
        }
        
        if ((getEscolha() != 1) || (getEscolha() != 2)) {
            System.out.println("Erro: Selecione a opção correta | Erro ao selecionar opção.");
        }
    }
}
