package Aula07.Ex03;

public class Jogo {
    
    //privates
    private Bola bola;
    private Equipa equipa1;
    private Equipa equipa2;
    private int duracao;
    private int tempoDecorrido;

    //construtor
    public Jogo(Bola bola, Equipa equipa1, Equipa equipa2, int duracao) {
        this.bola = bola;
        this.equipa1 = equipa1;
        this.equipa2 = equipa2;
        this.duracao = duracao;
        this.tempoDecorrido = 0;

    }

    //getters
    public Bola getBola() {
        return bola;
    }

    public void getScore(){
        System.out.println("A equipa " + equipa1.getNome() + " tem " + equipa1.getGm() + " golos.");
        System.out.println("A equipa " + equipa2.getNome() + " tem " + equipa2.getGm() + " golos.");
    } 
    

    public Equipa getEquipa1() {
        return equipa1;
    }

    public Equipa getEquipa2() {
        return equipa2;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getTempoDecorrido() {
        return tempoDecorrido;
    }

    //setters
    public void setBola(Bola bola) {
        this.bola = bola;
    }

    public void setEquipa1(Equipa equipa1) {
        this.equipa1 = equipa1;
    }

    public void setEquipa2(Equipa equipa2) {
        this.equipa2 = equipa2;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int tempoAutmatic(){
        int moves = 0;
        for(Robo jogador1 : equipa1.getConjunto()){
            moves = jogador1.getMoves();
        }
        for(Robo jogador2 : equipa2.getConjunto()){
            moves += jogador2.getMoves();
        }

        int tempoPorMove = duracao/5;
        tempoDecorrido = moves * tempoPorMove;

        return tempoDecorrido;

    }


    public String toString(){
        return "O jogo tem a duração de: " + duracao + " minutos. " + "As equipas participantes sao: " + equipa1.getNome() + " e " + equipa2.getNome() + ". " + "O jogo já decorreu: " + tempoDecorrido + " minutos." ;
    }

}
