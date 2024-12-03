public class Eevee {
    private String tipo;
    private double peso;
    private int altura;
    private int hp;

    // Construtor
    public Eevee(String tipo, double peso, int altura, int hp) {
        this.tipo = tipo;
        this.peso = peso;
        this.altura = altura;
        this.hp = hp;
    }

    // Getters e Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

     // Métodos de ataques
    public String ataque() {
        return "Ataque rápido";
    }

    public String defesa() {
        return "Desvio";
    }

    public String especial() {
        return "Tri-ataque";
    }

    // Método imprimir
    public void imprimir() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " cm");
        System.out.println("HP: " + hp);
    }
}
