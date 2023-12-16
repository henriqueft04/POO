package Aula08.Ex2;

public class PratoVegetariano extends Prato {

    public PratoVegetariano(String nome) {
        super(nome);
    }

    @Override
    public boolean adicionarIngrediente(Alimento a) {
        if (a instanceof Cereal || a instanceof Legume)
            return super.adicionarIngrediente(a);
        return false;
    }
}
