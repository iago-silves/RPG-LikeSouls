package personagens.base;

public abstract class Inimigo extends PersonagemBase{

    public Inimigo(String nome, Integer vida, Integer ataque, Integer defesa) {
        super(nome, vida, ataque, defesa);
    }

    public Inimigo(String nome, Integer vida, Integer ataque, Integer defesa, Integer nivel) {
        super(nome, vida, ataque, defesa, nivel);
    }
}
