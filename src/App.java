public class App {
    public static void main(String[] args) throws Exception {
        
        Cao cachorro = new Cao();

        cachorro.Andar();

        Cao dog = new Cao("Lara", 3);
        dog.DadosCao();    

        Pessoa pessoa = new Pessoa();

        pessoa.calcularIMC(85, 1.75);

        Aluno aluno = new Aluno();

        aluno.setNome("Letícia");

        if(aluno.VerificarNome()){
            System.out.println("Y");
        }
        else{
            System.err.println("N");
        }

    }
}
