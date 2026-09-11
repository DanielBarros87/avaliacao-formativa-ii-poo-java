public class Questao05 {
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno("Daniel Barros", "20260001", "Ciência da Computação");
        

        Aluno aluno2 = new Aluno("Estefany dos Santos", "20260002", "Psicologia");

    //exibindo os alunos
        System.out.println("--- Aluno 1 ---");
        aluno1.exibirDados();
        
        System.out.println("\n--- Aluno 2 ---");
        aluno2.exibirDados();
    }
}