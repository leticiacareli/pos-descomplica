public class operadores_aritmeticos {
    public static void main(String[] args) {
        int n1, n2, soma, subtracao, divisao, multiplicacao, modulo;
        n1 = 10;
        n2 = 2;
    
        soma = 0;
        subtracao = 0;
        divisao = 0;
        multiplicacao = 0;
        modulo = 0;
    
        soma = n1 + n2;
        System.out.println("Soma = " + soma);
    
        subtracao = n1 - n2;
        System.out.println("Subtração = " + subtracao);
    
        divisao = n1 / n2;
        System.out.println("Divisão = " + divisao);
    
        multiplicacao = n1 * n2;
        System.out.println("Multiplicação = " + multiplicacao);
    
        modulo = n1 % n2;
        System.out.println("Resto da divisão = " + modulo);
      }
}
