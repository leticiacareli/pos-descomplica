import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Cao cachorro = new Cao();

        cachorro.Andar();

        Cao dog = new Cao("Lara", 3);
        dog.DadosCao();    

        Pessoa pessoa = new Pessoa();

        pessoa.calcularIMC(85, 1.75);

        pessoa.nome = "Letícia";
        
        Vendedor vendedor = new Vendedor();

        vendedor.nome = "Lais";
        vendedor.comissao = 1.2;

        Aluno aluno = new Aluno();

        aluno.setNome("Letícia");

        if(aluno.VerificarNome()){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        // cliente
        Cliente cliente = new Cliente();
        cliente.setName("Claudio");
        cliente.setPhone("(00) 0000-0000");
        cliente.setId(00000000000);

        cliente.ExibirDados();

        Pedido pedido = new Pedido();

        Conta conta = new Poupanca();
            
            conta.setSaldo(5000);
            conta.imprimeExtrado();

        InterfaceConta interfaceConta = new ImplementsPopanca();

        interfaceConta.depositar(732);
        interfaceConta.sacar(8);
        interfaceConta.getSaldo();

        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Digite um número");
            int n = scanner.nextInt();

            System.out.println(n);
        }
        catch(Exception ex){
            System.out.println("Erro: Valor digitado não é um número. " + ex);
        }

        Cachorro cachorro2 = new Cachorro();
        cachorro2.setNome("Bidu");
        cachorro2.mostrar();

        Gato gato = new Gato();
        gato.setNome("Lola");
        gato.mostrar();
    }
}
