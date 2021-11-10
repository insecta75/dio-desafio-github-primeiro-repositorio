package teste;

public class JogoPOO {
    public static void main(String[] args) {
        Dado d1 = new Dado();
        Roleta r1 = new Roleta();

        d1.setAposta(5);
        d1.jogaJogo();
        d1.mostraResultado();

        r1.setAposta(32);
        r1.jogaJogo();
        r1.mostraResultado();
    }
}