package Aula06.Ex03;
import java.util.Arrays;

public class Conjunto {
    
    //definir as privates
    private int[] inteiros;
    private int tamanho;;

    public Conjunto() {
        this.inteiros = new int[10];
        this.tamanho = 0;
    }

    public boolean contains(int n) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.inteiros[i] == n) {
                return true;
            }
        }
        return false;
    }

    public void insert(int n) {
        if(contains(n) == false){
            if(this.tamanho == this.inteiros.length){
                this.inteiros = Arrays.copyOf(this.inteiros, 2*this.tamanho);
            }
            this.inteiros[this.tamanho] = n;
            this.tamanho ++;
        }

    }

    public void remove(int n){
        for (int i = 0; i < this.tamanho; i++) {
            if(this.inteiros[i] == n){
                this.inteiros[i] = this.inteiros[this.tamanho-1];
                this.tamanho -= 1;
                return;
            }
        }
        
    }

    public void empty(){
        this.tamanho = 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" ");
        for (int i = 0; i < tamanho; i++) {
            sb.append(inteiros[i]);
            if (i < tamanho - 1) {
                sb.append(", ");
            }
        }
        sb.append(" ");
        return sb.toString();
    }

    public int size(){
        return this.tamanho;
    
    }

    public Conjunto unir(Conjunto add){
        Conjunto c = new Conjunto();
        for (int i = 0; i < this.tamanho; i++) {
            c.insert(this.inteiros[i]);
        }
        for (int i = 0; i < add.tamanho; i++) {
            c.insert(add.inteiros[i]);
        }
        return c;
    }

    public Conjunto subtrair(Conjunto dif){
        Conjunto c = new Conjunto();
        for (int i = 0; i < this.tamanho; i++) {
            c.insert(this.inteiros[i]);
        }
        for (int i = 0; i < dif.tamanho; i++) {
            c.remove(dif.inteiros[i]);
        }
        return c;
    }

    public Conjunto interset(Conjunto inter){
        Conjunto c = new Conjunto();
        for (int i = 0; i < this.tamanho; i++) {
            if(inter.contains(this.inteiros[i]) == true){
                c.insert(this.inteiros[i]);
            }
        }
        return c;
    }
    
}
