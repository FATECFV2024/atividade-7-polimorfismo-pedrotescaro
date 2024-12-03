public class Glaceon extends Eevee {
    public Glaceon() {
        super("Gelo", 27.0, 80, 125);
    }

    @Override
    public String ataque() {
        return "Sopro Gelado - Ice Breath";
    }

    @Override
    public String defesa() {
        return "Escudo de Gelo - Ice Shield";
    }

    @Override
    public String especial() {
        return "Nevasca - Blizzard";
    }
}
