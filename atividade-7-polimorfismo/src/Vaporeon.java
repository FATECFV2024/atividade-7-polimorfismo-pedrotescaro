public class Vaporeon extends Eevee {
    public Vaporeon() {
        super("Água", 29.0, 100, 160);
    }

    @Override
    public String ataque() {
        return "Jato de Água - Water Gun";
    }

    @Override
    public String defesa() {
        return "Escudo de Bolha - Bubble Shield";
    }

    @Override
    public String especial() {
        return "Hidro Bomba - Hydro Pump";
    }
}
