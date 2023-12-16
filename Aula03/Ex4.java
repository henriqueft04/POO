package Aula03;

import java.util.Scanner;
import java.util.Random;
public class Ex4 {
    
        public static void main(String[] args){
            Scanner tec = new Scanner(System.in);
            Random rnd = new Random();
            System.out.print("Quantos alunos tem a turma? ");
            int numeroAlunos = tec.nextInt();
            double[][] notas = new double[numeroAlunos][2];
            for (int i = numeroAlunos-1; i >= 0; i--) {
                for (int j = 1; j >= 0; j--) {
                    notas[i][j] = Math.round(rnd.nextDouble()*20);
                }      
            }
            System.out.printf("%7s %7s %7s\n", "NotaT", "NotaP", "Pauta");
            for (int i = 0; i < numeroAlunos; i++) {
                double notaFinal = (0.4 * notas[i][0] + 0.6*notas[i][1]);
                if (notas[i][0] <7 || notas[i][1] <7) {
                    notaFinal = 66 ;
                }
                System.out.printf("%7s %7s %7s\n", notas[i][0], notas[i][1], Math.round(notaFinal));

            }
            tec.close();
            

    }
}
