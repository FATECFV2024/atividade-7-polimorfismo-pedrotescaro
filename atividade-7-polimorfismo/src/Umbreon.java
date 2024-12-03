public class Umbreon extends Eevee {
    public Umbreon() {
        super("Noturno", 27.0, 100, 150);
    }

    @Override
    public String ataque() {
        return "Mordida - Bite";
    }

    @Override
    public String defesa() {
        return "Proteção - Protect";
    }

    @Override
    public String especial() {
        return "Raio Lunar - Moonlight";
    }
}
