import java.util.Random;
import java.util.Scanner;

public class jogoAdivinhacao {
    public static void main(String[] args) {
        Random gerador = new Random();
        
    
        System.out.println(">>>>Escolha o nível do jogo\n");
        System.out.println("[1] Fácil");
        System.out.println("[2] Médio");
        System.out.println("[3] Difícil\n");
    
        Scanner entrada = new Scanner(System.in);
        int nivel = entrada.nextInt();
    
        switch(nivel){
          case 1:
            
            System.out.println(">>>>Nível Fácil - 0 a 10\n");
            System.out.println("Adivinhe o número que estou pensando...\n");
            
            int xFacil = gerador.nextInt(10);
    
            int nFacil = entrada.nextInt();
            
            if(nFacil == xFacil){
              System.out.println("Parabéns, você acertou, eu pensei no número " + xFacil);
            }
            else{
              System.out.println("Você errou, eu pensei no número " + xFacil);
            }
            
          break;
    
          case 2:
            
            System.out.println(">>>>Nível Médio - 0 a 25\n");
            System.out.println("Adivinhe o número que estou pensando...\n");
            
            int xMedio = gerador.nextInt(25);
    
            int nMedio = entrada.nextInt();
            
            if(nMedio == xMedio){
              System.out.println("Parabéns, você acertou, eu pensei no número " + xMedio);
            }
            else{
              System.out.println("Você errou, eu pensei no número " + xMedio);
            }
            
          break;
    
          case 3:
            
            System.out.println(">>>>Nível Difícil - 0 a 50\n");
            System.out.println("Adivinhe o número que estou pensando...\n");
            
            int xDificil = gerador.nextInt(50);
    
            int nDificil = entrada.nextInt();
            
            if(nDificil == xDificil){
              System.out.println("Parabéns, você acertou, eu pensei no número " + xDificil);
            }
            else{
              System.out.println("Você errou, eu pensei no número " + xDificil);
            }
            
          break;
    
          default:
            System.out.println("Opção inválida.");
          break;
        }
      }
}
