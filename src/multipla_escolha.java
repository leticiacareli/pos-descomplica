import java.util.Scanner;

public class multipla_escolha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    
        System.out.println("Escolha uma opção: ");
        System.out.println("[1] Cadastrar aluno.");
        System.out.println("[2] Cadastrar nota.");
        System.out.println("[3] Listar aluno e nota.");
    
        int n = entrada.nextInt();
    
        switch(n){
          case 1:
            System.out.println("Cadastro de aluno.");
          break;
    
          case 2:
            System.out.println("Cadastro de nota.");
          break;
    
          case 3:
            System.out.println("Lista aluno e nota.");
          break;
    
          default:
            System.out.println("Opção inválida.");
        }
      }
}
