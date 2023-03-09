import java.util.Scanner;
public class entrada_saida {
    public static void main(String[] args) {

        String nome;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe seu nome.");
        
        nome = entrada.next();
    
        System.out.println("Como vai? " + nome);
      }
}
