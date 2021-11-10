package teste;
import java.util.Random;

public class Dado extends Jogo {

    @Override
    public void setAposta(int aposta) {
        if(aposta > 6 || aposta < 1) {
            System.out.println("Aposta inválida!");
        } else {
            super.setAposta(aposta);
        }        
    }
    @Override
    public void jogaJogo() {
        Random rnd = new Random();
        super.setResultado(rnd.nextInt(6) + 1);
    }
}
