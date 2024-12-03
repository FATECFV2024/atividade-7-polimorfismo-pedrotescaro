public class Pokedex {
    public static void main(String[] args) throws Exception {
        Eevee e = new Eevee();
        Joltreon j = new Joltreon();

        System.out.println("Eu sou: Eevee ");
        System.out.println("Ataque: " + e.ataque());
        System.out.println("Defesa: " + e.defesa());
        System.out.println("Especial: " + e.especial());
        System.out.print("\n");

        e = j;

        System.out.println("Eu sou: Joltreon ");
        System.out.println("Ataque: " + e.ataque());
        System.out.println("Defesa: " + e.defesa());
        System.out.println("Especial: " + e.especial());
        System.out.print("\n");

    }
}
