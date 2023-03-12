public class Cao {
    String nome;
    String cor;
    int idade;
    double peso;

    // metodo construtor
    public Cao(){
        cor = "Caramelo";
    }
    
    // metodo construtor sobrecarregado
    public Cao(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void Andar(){
        System.out.println("Estou andando..." + cor);
    }

    public void DadosCao(){
        System.out.println(nome + " " + idade);
    }
}
