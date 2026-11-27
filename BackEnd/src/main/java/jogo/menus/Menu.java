package jogo.menus;

public abstract class Menu {
    protected String menu;
    private String opcoes;
    private Integer escolha;

    public Menu() {
        
    }

    public abstract void criarMenu();
    public abstract void chamarMenu();

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getOpcoes() {
        return opcoes;
    }

    public void setOpcoes(String opcoes) {
        this.opcoes = opcoes;
    }

    public Integer getEscolha() {
        return escolha;
    }

    public void setEscolha(Integer escolha) {
        this.escolha = escolha;
    }
}
