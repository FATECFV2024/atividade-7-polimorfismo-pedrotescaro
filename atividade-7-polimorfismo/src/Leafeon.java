public class Leafeon extends Eevee {
    public Leafeon() {
        super("Grama", 25.5, 85, 140);
    }

    @Override
    public String ataque() {
        return "Corte de Folha - Leaf Blade";
    }

    @Override
    public String defesa() {
        return "Escudo de Folhas - Leaf Shield";
    }

    @Override
    public String especial() {
        return "Tempestade de Folhas - Leaf Storm";
    }
}
