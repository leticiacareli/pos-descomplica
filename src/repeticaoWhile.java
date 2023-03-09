import java.util.Scanner;

public class repeticaoWhile {
    public static void main(String[] args) {
        int opcao = 0;
        
        while(opcao != 99){
          System.out.println("Digite um número ou 99 pra sair");
          Scanner entrada = new Scanner(System.in);
    
          opcao = entrada.nextInt();
        }


    }
}
