public class Espeon extends Eevee {
    public Espeon() {
        super("Psíquico", 26.5, 88, 120);
    }

    @Override
    public String ataque() {
        return "Confusão - Confusion";
    }

    @Override
    public String defesa() {
        return "Barreira Psíquica - Psychic Barrier";
    }

    @Override
    public String especial() {
        return "Raio Psíquico - Psychic";
    }
}
