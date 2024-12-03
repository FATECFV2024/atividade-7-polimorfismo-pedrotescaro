public class Flareon extends Eevee {
    public Flareon() {
        super("Fogo", 25.0, 90, 130);
    }

    @Override
    public String ataque() {
        return "Lança-Chamas - Flamethrower";
    }

    @Override
    public String defesa() {
        return "Calor Protetor - Heat Shield";
    }

    @Override
    public String especial() {
        return "Explosão de Fogo - Fire Blast";
    }
}
