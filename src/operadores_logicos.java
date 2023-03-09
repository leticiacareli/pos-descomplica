public class operadores_logicos {
    /*
      > maior
      < menor
      == igual
      >= maior igual
      <= menor igual
      != diferente
      && e
      || ou
      ! negação
    */

    public static void main(String[] args) {

        int n1, n2;
    
        boolean maior, menor, igual, maiorIgual, menorIgual, diferente, e, ou, negacao;
    
        n1 = 10;
        n2 = 2;
    
        maior = n1 > n2;
        System.out.println(n1 + " > " + n2 + " = " + maior);
    
        menor = n1 < n2;
        System.out.println(n1 + " < " + n2 + " = " + menor);
    
        igual = n1 == n2;
        System.out.println(n1 + " == " + n2 + " = " + igual);
    
        maiorIgual = n1 >= n2;
        System.out.println(n1 + " >= " + n2 + " = " + maiorIgual);
    
        menorIgual = n1 <= n2;
        System.out.println(n1 + " <= " + n2 + " = " + menorIgual);
    
        diferente = n1 != n2;
        System.out.println(n1 + " != " + n2 + " = " + diferente);
    
        e = (n1 > n2 && n2 < n1);
        System.out.println(n1 + " > " + n2 + " && " + n2 + " < " + n1 + " = " + e);
    
        ou = (n1 > n2 || n2 < n1);
        System.out.println(n1 + " > " + n2 + " || " + n2 + " < " + n1 + " = " + ou);
    
        negacao = !(n1 > n2);
        System.out.println(n1 + " > " + n2 + " = " + negacao);    
    }
}
