package teste;
import java.util.Random;

public class Roleta extends Jogo {

    @Override
    public void setAposta(int aposta) {
        if(aposta > 36 || aposta < 0) {
            System.out.println("Aposta inválida!");
        } else {
            super.setAposta(aposta);
        }        
    }
    @Override
    public void jogaJogo() {
        Random rnd = new Random();
        super.setResultado(rnd.nextInt(36) + 1);
    }
}
