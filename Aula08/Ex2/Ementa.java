package Aula08.Ex2;

public class Ementa {

    public static final int NR_PRATOS_NA_EMENTA = 10;

    private String nome;
    private String local;
    private Prato[] pratos;
    private int nrPratosAdicionados;

    public Ementa(String nome, String local) {
        this.nome = nome;
        this.local = local;
        pratos = new Prato[NR_PRATOS_NA_EMENTA];
        nrPratosAdicionados = 0;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        builder.append("Ementa [nome=" + nome + ", local=" + local +"]\n");
        for (Prato prato : pratos) {
            builder.append("\t");
            builder.append(prato.getNome());
            builder.append("\t");
            builder.append("\n");
        }
        builder.append("]");
        return builder.toString();

    }

    //prato

    public void addPrato(Prato prato) {
        pratos[nrPratosAdicionados] = prato;
        nrPratosAdicionados++;
    }

    public void removePrato(Prato prato) {
        for (int i = 0; i < pratos.length; i++) {
            if (pratos[i].equals(prato)) {
                pratos[i] = null;
            }
        }
    }

    public Prato selecionarPrato(String nome) {
        for (Prato prato : pratos) {
            if (prato.getNome().equals(nome)) {
                return prato;
            }
        }
        return null;
    }

    public void removeIngrediente(Alimento alimento) {
        for (Prato prato : pratos) {
            prato.removeIngrediente(alimento);
        }
    }

    //Ingrediente
    public void addCarne(Carne carne) {
        for (Prato prato : pratos) {
            prato.adicionarIngrediente(carne);
        }
    }

    public void addPeixe(Peixe peixe) {
        for (Prato prato : pratos) {
            prato.adicionarIngrediente(peixe);
        }
    }

    public void addLegume(Legume legume) {
        for (Prato prato : pratos) {
            prato.adicionarIngrediente(legume);
        }
    }

    public void addCereal(Cereal cereal) {
        for (Prato prato : pratos) {
            prato.adicionarIngrediente(cereal);
        }
    }

    //ementa

    public Prato listarPrato(int ordem) {
        return pratos[ordem];
    }

    public void addPrato(Prato p, Object o) {
        throw new UnsupportedOperationException();
    }

}
