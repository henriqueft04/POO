package Aula08.Ex2;

public class PratoDieta extends Prato {
    private double limiteCalorias;

    public PratoDieta(String nome, double limiteCalorias) {
        super(nome);
        this.limiteCalorias = limiteCalorias;
    }

    @Override
    public boolean adicionarIngrediente(Alimento alim) {
        if (totalCalorias() + alim.getCalorias() <= limiteCalorias)
            return super.adicionarIngrediente(alim);
        return false;
    }
}
