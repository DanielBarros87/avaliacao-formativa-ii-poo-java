import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantidade de estudantes: ");
        int qtdEstudantes = scanner.nextInt();

        
        double somaNotas = 0;
        double maiorNota = 0;
        double menorNota = 0;
        int aprovados = 0;

        //Ler as notas
        System.out.println(); 
        for (int i = 1; i <= qtdEstudantes; i++) {
            System.out.print("Nota do estudante " + i + ": ");
            double nota = scanner.nextDouble();

            somaNotas += nota; 

           
            if (nota >= 7.0) {
                aprovados++;
            }

            
            if (i == 1) {
               
                maiorNota = nota;
                menorNota = nota;
            } else {
                
                if (nota > maiorNota) {
                    maiorNota = nota;
                }
                if (nota < menorNota) {
                    menorNota = nota;
                }
            }
        }

        
        double media = somaNotas / qtdEstudantes;

      
        
        System.out.println("Média da turma: " + media);
        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Menor nota: " + menorNota);
        System.out.println("Estudantes aprovados: " + aprovados);

        scanner.close();
    }
}