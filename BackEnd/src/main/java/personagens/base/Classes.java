package personagens.base;

public abstract class Classes extends PersonagemBase {

    public Classes(String nome, Integer vida, Integer ataque, Integer defesa) {
        super(nome, vida, ataque, defesa);
    }

    public Classes(String nome, Integer vida, Integer ataque, Integer defesa, Integer nivel) {
        super(nome, vida, ataque, defesa, nivel);
    }

}
