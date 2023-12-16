package Aula08.Ex2;

public class Cliente {


    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente = " + nome;
    }

	public java.lang.String getNome() {
		return this.nome;
	}

	public void setNome(java.lang.String value) {
		this.nome = value;
	}

}
