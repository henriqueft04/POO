package Aula07.Ex1;

public class Rectangle extends Formas{
    
    protected double comprimento;
    protected double altura;

    public Rectangle(double comprimento, double altura, String cor){
        super(cor);
        setParameters(comprimento, altura);

        if (altura <0 || comprimento <0){
            System.out.println("Os valores têm de ser postivos, bom dia");
            return;
        
        }
        setParameters(comprimento, altura);
        perimetro();
        area();

    }

    public void setParameters(double comprimento, double altura){
        if (altura <0 || comprimento <0){
            System.out.println("Os valores têm de ser postivos, bom dia");
            return;
        
        }
        
        this.comprimento = comprimento;
        this.altura = altura;

    }


    public String getCor(){
        return cor;
    }
    

    public double perimetro() {
        return (comprimento + altura)*2;
    }

    public double area() {
        return altura*comprimento;
    }

    public String toString() {
        return "Retângulo de lados de comprimento  " + comprimento + " e altura " + altura + ", area " + area() + ", perimetro " + perimetro() + " e cor " + getCor();
    }

}
