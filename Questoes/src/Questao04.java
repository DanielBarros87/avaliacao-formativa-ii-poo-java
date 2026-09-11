import java.util.Scanner;
import java.util.Locale;

public class Questao04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        double[] notas = new double[5];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        double soma = 0;
        int aprovados = 0;


        double maiorNota = notas[0];
        double menorNota = notas[0];

        System.out.println("\n--- Resultado ---");
     

        System.out.print("Notas: ");
        for (int i = 0; i < notas.length; i++) {
         
            System.out.print(notas[i] + " ");
            

            soma += notas[i];
            

            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
            }
            if (notas[i] < menorNota) {
                menorNota = notas[i];
            }
            

            if (notas[i] >= 7.0) {
                aprovados++;
            }
        }
        
        System.out.println(); //pra pular a linha

        double media = soma / notas.length;

        System.out.println("Média: " + media);
        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Menor nota: " + menorNota);
        System.out.println("Estudantes com nota >= 7.0: " + aprovados);

        scanner.close();
    }
}