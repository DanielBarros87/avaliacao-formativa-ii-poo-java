import java.util.Scanner;

public class Questao01 {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
   
    System.out.println("Nome :");
    String nome = scanner.nextLine();

    System.out.println("Idade: ");
    int idade = scanner.nextInt();

    scanner.nextLine();

    System.out.println("Curso: ");
    String curso = scanner.nextLine();

    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Curso: " + curso);
    

    scanner.close();

}
    
}
