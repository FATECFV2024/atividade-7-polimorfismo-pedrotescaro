public class Pokedex {
    public static void main(String[] args) throws Exception {
        Eevee    e = new Eevee("Normal", 6.5, 30, 100);
        Joltreon j = new Joltreon();
        Umbreon  u = new Umbreon();
        Vaporeon v = new Vaporeon();
        Flareon  f = new Flareon();
        Espeon   es = new Espeon();
        Leafeon  lf = new Leafeon();
        Glaceon  gl = new Glaceon();
        Sylveon  sy = new Sylveon();

        System.out.println("Eu sou: Eevee ");
        e.imprimir();
        System.out.println("Ataque: " + e.ataque());
        System.out.println("Defesa: " + e.defesa());
        System.out.println("Especial: " + e.especial());
        System.out.print("\n");

        e = j;

        System.out.println("Eu sou: Joltreon ");
        e.imprimir();
        System.out.println("Ataque: " + e.ataque());
        System.out.println("Defesa: " + e.defesa());
        System.out.println("Especial: " + e.especial());
        System.out.print("\n");

        e = u;

        System.out.println("Eu sou: Umbreon ");
        e.imprimir();
        System.out.println("Ataque: " + e.ataque());
        System.out.println("Defesa: " + e.defesa());
        System.out.println("Especial: " + e.especial());
        System.out.print("\n");

        e = v;

        System.out.println("Eu sou: Vaporeon ");
        e.imprimir();
        System.out.println("Ataque: " + e.ataque());
        System.out.println("Defesa: " + e.defesa());
        System.out.println("Especial: " + e.especial());
        System.out.print("\n");

        e = f;

        System.out.println("Eu sou: Flareon ");
        e.imprimir();
        System.out.println("Ataque: " + e.ataque());
        System.out.println("Defesa: " + e.defesa());
        System.out.println("Especial: " + e.especial());
        System.out.print("\n");

        e = es;

        System.out.println("Eu sou: Espeon ");
        e.imprimir();
        System.out.println("Ataque: " + e.ataque());
        System.out.println("Defesa: " + e.defesa());
        System.out.println("Especial: " + e.especial());
        System.out.print("\n");

        e = lf;

        System.out.println("Eu sou: Leafeon ");
        e.imprimir();
        System.out.println("Ataque: " + e.ataque());
        System.out.println("Defesa: " + e.defesa());
        System.out.println("Especial: " + e.especial());
        System.out.print("\n");
        
        e = gl;

        System.out.println("Eu sou: Glaceon ");
        e.imprimir();
        System.out.println("Ataque: " + e.ataque());
        System.out.println("Defesa: " + e.defesa());
        System.out.println("Especial: " + e.especial());
        System.out.print("\n");

        e = sy;

        System.out.println("Eu sou: Sylveon ");
        e.imprimir();
        System.out.println("Ataque: " + e.ataque());
        System.out.println("Defesa: " + e.defesa());
        System.out.println("Especial: " + e.especial());
        System.out.print("\n");

    }
}
