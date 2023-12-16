package Aula07.Ex03;
import java.util.ArrayList;

public class Equipa {
    
    //privates
    private String nome;
    private String responsavel;
    private int gm;
    private int gs;
    private ArrayList<Robo> conjunto;

    //construtor
    public Equipa(String nome, String responsavel) {
        this.nome = nome;
        this.responsavel = responsavel;
        this.gs = 0;
        this.conjunto = new ArrayList<Robo>();

    }

    //getters
    public String getNome() {
        return nome;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public int getGm() {

        return gm;
    }

    public void getPlayerGoals(){
        int total = 0;
        for (Robo r : conjunto){
            total += r.getGolos();
        }
        this.gm = total;
    }

    public int getGs() {
        return gs;
    }

    public ArrayList<Robo> getConjunto() {
        return conjunto;
    }

    public void addRobo(Robo r){
        conjunto.add(r);
        getPlayerGoals();
    }

    public void removeRobo(Robo r){
        conjunto.remove(r);
        getPlayerGoals();
    }

    public void teamConceded(){
        gs++;
    
    }

    public void marcarGolo(Robo r){
        r.scoreGoal();
        getPlayerGoals();
    }
    
    

    public String toString(){
        return "Nome da equipa: " + nome + "; Responsável: " + responsavel + "; Golos marcados: " + gm + "; Golos sofridos: " + gs + "; Jogadores da equip: " + conjunto;
    }

}
