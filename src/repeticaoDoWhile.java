import java.util.*;
public class repeticaoDoWhile {
    public static void main(String[] args) {
        int opcao = 0;
    
        do{
          System.out.println("Digite um valor ou 99 para sair.");
    
          Scanner entrada = new Scanner(System.in);
          opcao = entrada.nextInt();
          
        }while(opcao != 99);
      }
}
