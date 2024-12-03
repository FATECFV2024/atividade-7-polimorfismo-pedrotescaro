public class Joltreon extends Eevee{

    public Joltreon() {
        super("Elétrico", 24.5, 80, 130);
    }

    @Override
    public String ataque(){
        return "Trovoada - Thunder Shock";  
    }
    @Override
    public String defesa(){
        return "Carga - Wild Charge";
    }
    @Override
    public String especial(){
        return "Raio - Thunderbolt ";
    }
}
