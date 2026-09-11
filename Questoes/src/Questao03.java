import java.util.Scanner;

public class Questao03 {

    
    public static int quantidadeCaracteres(String texto) {
        return texto.length();
    }


    public static String formatarNome(String nome) {
        return nome.toUpperCase();
    }

    //o contains ve se o nome q a gente coloca tem 'silva'
    public static boolean contemSilva(String nome) {
        return nome.contains("Silva");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome completo: ");
        String nomeCompleto = scanner.nextLine();

        System.out.println();//pra pular uma linha, por isso o () ta vazio
        
        System.out.println("Quantidade de caracteres: " + quantidadeCaracteres(nomeCompleto));
        System.out.println("Nome em maiúsculas: " + formatarNome(nomeCompleto));
        
        System.out.println("Contém \"Silva\": " + contemSilva(nomeCompleto));

        scanner.close();
    }
}