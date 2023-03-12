public class Aluno {
    private String nome;

    public void setNome(String n){
        nome  = n;
    }

    public String getNome(){
        return nome;
    }

    public boolean VerificarNome(){
        if(nome == "Letícia"){
            return true;
        }
        else{
            return false;
        }
    }

}
