package personagens.base;

public abstract class PersonagemBase {
    private String nome;
    private Integer vida;
    private Integer ataque;
    private Integer defesa;
    private Integer nivel;

    public PersonagemBase(String nome, Integer vida,
            Integer ataque, Integer defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.nivel = getNivel();
    }

    public PersonagemBase(String nome, Integer vida, Integer ataque,
            Integer defesa, Integer nivel) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        
        setNivel(nivel);

        this.nivel = getNivel();
    }

    public void atacar() {

        if (this.ataque > this.defesa) {
            setVida((this.ataque - this.defesa) - this.vida);
        } 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public Integer getAtaque() {
        return ataque;
    }

    public void setAtaque(Integer ataque) {
        this.ataque = ataque;
    }

    public Integer getDefesa() {
        return defesa;
    }

    public void setDefesa(Integer defesa) {
        this.defesa = defesa;
    }

    public Integer getNivel() {

        if (nivel == null) {
            this.nivel = 1;
        }

        return nivel;
    }

    public void setNivel(Integer nivel) {

        if (nivel > getNivel()) {
            this.nivel = nivel;
        }
    }
}
