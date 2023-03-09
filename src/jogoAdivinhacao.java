import java.util.Random;
import java.util.Scanner;

public class jogoAdivinhacao {
    public static void main(String[] args) {
        Random gerador = new Random();
        
    
        System.out.println(">>>>Escolha o nível do jogo\n");
        System.out.println("[1] Fácil - 10 números");
        System.out.println("[2] Médio - 25 números");
        System.out.println("[3] Difícil - 50 números\n");
    
        Scanner entrada = new Scanner(System.in);
        int nivel = entrada.nextInt();

        int count = 0;
    
        switch(nivel){
          case 1:
            
            System.out.println(">>>>Nível Fácil - 0 a 10\n");
            
            int xFacil = gerador.nextInt(10);

            int nFacil;

            System.out.println("Adivinhe o número que estou pensando...\n");
      
            do{
              nFacil = entrada.nextInt();

              if(nFacil == xFacil){
                System.out.println("Parabéns, você acertou, eu pensei no número " + xFacil);
              }
              else if(xFacil > nFacil ){
                System.out.println("O número que pensei é maior que " + nFacil);
              }
              else if(xFacil < nFacil){
                System.out.println("O número que pensei é menor que " + nFacil);
              }

              count++;
            }while(nFacil != xFacil);

            System.out.println("\n" + count + " tentativas.");
            
          break;
    
          case 2:

            System.out.println(">>>>Nível Médio - 0 a 25\n");

            int xMedio = gerador.nextInt(25);

            int nMedio;

            System.out.println("Adivinhe o número que estou pensando...\n");
            
            do{
              nMedio = entrada.nextInt();

              if(nMedio == xMedio){
                System.out.println("Parabéns, você acertou, eu pensei no número " + xMedio);
              }
              else if(xMedio > nMedio ){
                System.out.println("O número que pensei é maior que " + nMedio);
              }
              else if(xMedio < nMedio){
                System.out.println("O número que pensei é menor que " + nMedio);
              }

              count++;
            }while(nMedio != xMedio);

            System.out.println("\n" + count + " tentativas.");
            
          break;
    
          case 3:

            System.out.println(">>>>Nível Médio - 0 a 50\n");

            int xDificil = gerador.nextInt(50);

            int nDificil;

            System.out.println("Adivinhe o número que estou pensando...\n");
            
            do{
              nDificil = entrada.nextInt();

              if(nDificil == xDificil){
                System.out.println("Parabéns, você acertou, eu pensei no número " + xDificil);
              }
              else if(xDificil > nDificil ){
                System.out.println("O número que pensei é maior que " + nDificil);
              }
              else if(xDificil < nDificil){
                System.out.println("O número que pensei é menor que " + nDificil);
              }

              count++;
            }while(nDificil != xDificil);

            System.out.println("\n" + count + " tentativas.");
            
          break;
    
          default:
            System.out.println("Opção inválida.");
          break;
        }
      }
}
