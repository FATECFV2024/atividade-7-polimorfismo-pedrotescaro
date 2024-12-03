public class Sylveon extends Eevee {
    public Sylveon() {
        super("Fada", 23.0, 87, 135);
    }

    @Override
    public String ataque() {
        return "Luz Encantada - Dazzling Gleam";
    }

    @Override
    public String defesa() {
        return "Aura Protetora - Protective Aura";
    }

    @Override
    public String especial() {
        return "Explosão Lunar - Moonblast";
    }
}
