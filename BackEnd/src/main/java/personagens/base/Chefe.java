package personagens.base;

public abstract class Chefe extends Inimigo{

    public Chefe(String nome, Integer vida, Integer ataque, Integer defesa) {
        super(nome, vida, ataque, defesa);
    }

    public Chefe(String nome, Integer vida, Integer ataque, Integer defesa, Integer nivel) {
        super(nome, vida, ataque, defesa, nivel);
    }
    
}
