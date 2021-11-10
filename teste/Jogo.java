package teste;

abstract public class Jogo {
    private int aposta;
    private int resultado;

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    public void setAposta(int aposta) {
        this.aposta = aposta;
    }
    public int getResultado() {
        return this.resultado;
    }
    public int getAposta() {
        return this.aposta;
    }
    abstract public void jogaJogo();

    public void mostraResultado() {
        System.out.println("Sua aposta foi " + this.getAposta() + " e o resultado foi " + this.getResultado());
        if(this.getResultado() == this.getAposta()) {
            System.out.println("Parabens, voce acertou!");
        } else {
            System.out.println("Que pena! Continue tentando...");
        }
    }
}
