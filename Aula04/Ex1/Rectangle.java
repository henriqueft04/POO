package Aula04.Ex1;

public class Rectangle {
    
    private double comprimento;
    private double altura;

    public Rectangle(double comprimento, double altura){
        setParameters(comprimento, altura);

        if (altura <0 || comprimento <0){
            System.out.println("Os valores têm de ser postivos, bom dia");
        
        }
        setParameters(comprimento, altura);
        perimetro();
        area();

    }

    public void setParameters(double comprimento, double altura){
        if (altura <0 || comprimento <0){
            System.out.println("Os valores têm de ser postivos, bom dia");
        
        }
        
        this.comprimento = comprimento;
        this.altura = altura;

    }

    public double perimetro() {
        return (comprimento + altura)*2;
    }

    public double area() {
        return altura*comprimento;
    }

    public String toString() {
        return "Retângulo de lados de comprimento  " + comprimento + " e altura " + altura;
    }

}
