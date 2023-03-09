public class condicional_aninhada {
    public static void main(String[] args) {
        int nota = 2;
    
        if(nota >= 6){
          System.out.println("Aprovado.");
        }
        else if((nota >= 3) && (nota <= 5)){
          System.out.println("Exame.");
        }
        else{
          System.out.println("Reprovado.");
        }
    }
}
