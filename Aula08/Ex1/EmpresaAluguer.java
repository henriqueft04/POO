package Aula08.Ex1;
import java.util.ArrayList;

public class EmpresaAluguer {
    
    //privates
    private String nome;
    private String codigoPostal;
    private String email;
    private String telefone;
    private ArrayList<Veiculo> veiculos;  

    //constructor
    public EmpresaAluguer(String nome, String codigoPostal, String email) {
        this.nome = nome;
        this.codigoPostal = codigoPostal;
        if(utils.CheckEmail.checkMail(email))
            this.email = email;
        else
            throw new IllegalArgumentException("Email inválido");

        this.veiculos = new ArrayList<>();
    }

    public void addVeiculo(Veiculo v){
        veiculos.add(v);
    }

    public void removeVeiculo(Veiculo v){
        veiculos.remove(v);
    }

    public void removeVeiculo(String matricula){
        for (Veiculo v : veiculos) {
            if(v.getMatricula().equals(matricula)){
                veiculos.remove(v);
                break;
            }
        }
    }

    public Veiculo maisUsado(EmpresaAluguer veiculos){
        int max = 0;
        Veiculo v = null;
        for (Veiculo veiculo : veiculos.getVeiculos()) {
            if(veiculo.distanciaTotal() > max){
                max = veiculo.distanciaTotal();
                v = veiculo;            }
        }
        return v;

    }

    public Veiculo maisPotente(EmpresaAluguer veiculos){
        int max = 0;
        Veiculo v = null;
        for (Veiculo veiculo : veiculos.getVeiculos()) {
            if(veiculo.getPotencia() > max){
                max = veiculo.getPotencia();
                v = veiculo;
            }
        }
        return v;
    }

    public void ordemPotentencia(EmpresaAluguer veiculos){
        ArrayList <Veiculo> veiculosPotencia = new ArrayList<>();
        ArrayList <Veiculo> veiculosOg = veiculos.getVeiculos();
        do{
            Veiculo maisPotente = null;
            int max  = 0;
            for(Veiculo veiculo : veiculos.getVeiculos()){
                if(veiculo.getPotencia() > max){
                    max = veiculo.getPotencia();
                    maisPotente = veiculo;
                }
            }
            veiculosPotencia.add(maisPotente);
            veiculosOg.remove(maisPotente);
        }while(veiculosOg.size() > 0);
        System.out.println(veiculosPotencia);

    }

    public void addVeiculo(String matricula){
        for (Veiculo v : veiculos) {
            if(v.getMatricula().equals(matricula)){
                veiculos.add(v);
                break;
            }
        }
    }

    public void listVeiculos(){
        for (Veiculo v : veiculos) {
            System.out.println(v);
        }
    }

    public void listVeiculosMarca(String marca){
        for (Veiculo v : veiculos) {
            if(v.getMarca().equals(marca)){
                System.out.println(v);
            }
        }
    }

    //getters
    public String getNome() {
        return nome;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public String toString(){
        return "Empresa de Aluguer de Veiculos: " + nome + " - " + codigoPostal + " - " + email + " - " + telefone + " - " + veiculos;
    }

}
